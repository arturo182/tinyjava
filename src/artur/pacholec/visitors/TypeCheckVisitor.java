package artur.pacholec.visitors;

import artur.pacholec.SymbolTable;
import artur.pacholec.records.ClassRecord;
import artur.pacholec.records.MethodRecord;
import artur.pacholec.records.VariableRecord;
import org.antlr.runtime.tree.CommonTree;

//TypeCheckVisitor performs type checking on the nodes, stops on first error
public final class TypeCheckVisitor extends AbstractVisitor
{
	SymbolTable symbolTable;
	String currentMethod;
	String currentClass;
	boolean shouldContinue = true;
	
	private void checkAllChildrenType(CommonTree node, String expectedType, String errorMsg)
	{
		for(int i = 0; i < node.getChildCount(); ++i) {
			String type = (String)visitNode(node.getChild(i));
			if((type == null) || !type.equals(expectedType))
				reportError(node.getLine() + ": " + errorMsg + " (\"" + node.getChild(i).getText() + "\" is " + type + ")");
		}
	}
	
	public void reportError(String errorMsg)
	{
		shouldContinue = false;
		
		System.err.println(errorMsg);
	}
	
	public boolean hasErrors()
	{
		return !shouldContinue;
	}
	
	@Override
	public Object visitNode(CommonTree node)
	{
		if(!shouldContinue)
			return null;
		
		return super.visitNode(node);
	}
	
	public TypeCheckVisitor(SymbolTable symbolTable)
	{
		this.symbolTable = symbolTable;
		this.symbolTable.reset();
	}
	
	@Override
	public Object visitMainClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		currentClass = name;
		
		symbolTable.enterScope();
			visitNode(node.getChild(2));
		symbolTable.exitScope();
		
		return name;
	}
	
	@Override
	public Object visitClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		currentClass = name;
		
		symbolTable.enterScope();
			visitNode(node.getChild(2).getChild(1));
		symbolTable.exitScope();
		
		return name;
	}
	
	@Override
	public Object visitMethod(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(2));		
		currentMethod = name;
		
		symbolTable.enterScope();
			visitNode(node.getChild(5));
			visitNode(node.getChild(6));
		symbolTable.exitScope();
		
		return name;
	}
	
	@Override
	public Object visitPrintLn(CommonTree node)
	{
		String type = (String)visitNode(node.getChild(0));
		if((type == null) || !type.equals("int"))
			reportError(node.getLine() + ": [PRINTLN] Wrong parameter type (expected int got " + type + ").");
		
		return "";
	}
	
	@Override
	public Object visitMethodCall(CommonTree node)
	{
		Object method = visitNode(node.getChild(0));
		if((method == null) || method.equals("???"))
			return "???";
		
		if(method.toString().equals("int"))
			return "int";
		
		MethodRecord methodRecord = (MethodRecord)method;
		
		CommonTree args = (CommonTree)node.getChild(1);
		if(args.getChildCount() != methodRecord.getParameterCount()) {
			reportError(node.getLine() + ": [CALL] Wrong number of parameters for \"" + methodRecord.getId() + "\" (expected " + methodRecord.getParameterCount() + " got " + args.getChildCount() + ").");
			return null;
		}
				
		for(int i = 0; i < args.getChildCount(); ++i) {
			String expectedType = methodRecord.getParameterList().get(i).getType();
			String actualType = (String)visitNode(args.getChild(i));
						
			if((actualType == null) || !actualType.equals(expectedType))
				reportError(node.getLine() + ": [CALL] Wrong parameter type for \"" + methodRecord.getId() + "\" (expected " + expectedType + " got " + actualType + ").");
		}

		return methodRecord.getReturnType();
	}
	
	@Override
	public Object visitDot(CommonTree node)
	{
		String type = (String)visitNode(node.getChild(0));
		String method = node.getChild(1).getText();
		
		if(type.equals("int[]")) {
			if(method.equals("length")) {
				return "int";
			} else {
				reportError(node.getLine() + ": [DOT] Unknown property for array \"" + method + "\".");
				return null;
			}
		}
		
		if(type.equals("int") || type.equals("boolean")) {
			reportError(node.getLine() + ": [DOT] Can't use dot operator on " + type + ".");
			return null;
		}
		
		ClassRecord classRecord = (ClassRecord)symbolTable.getRecord(type);
		if(classRecord == null) {
			reportError(node.getLine() + ": [DOT] Class \"" + type + "\" not found in type declaration.");
			return null;
		}
		
		MethodRecord methodRecord = classRecord.getMethod(method);
		if(methodRecord == null) {
			reportError(node.getLine() + ": [DOT] Method " + method + " not found in class " + type + ".");
			return null;
		}
		
		return methodRecord;
	}
	
	@Override
	public Object visitReturn(CommonTree node)
	{			
		ClassRecord classRecord = (ClassRecord)symbolTable.getRecord(currentClass);
		MethodRecord methodRecord = classRecord.getMethod(currentMethod);
		
		String returnType = (String)visitNode(node.getChild(0));
		if(!returnType.equals(methodRecord.getReturnType())) 
			reportError(node.getLine() + ": [RETURN] Method " + currentMethod + " returns wrong type (expected " + methodRecord.getReturnType() + " is " + returnType + ").");
		
		return null;
	}
	
	@Override
	public Object visitArrayCreation(CommonTree node)
	{
		String type = node.getChild(0).getText();
		String sizeType = (String)visitNode(node.getChild(1));
		
		if(!type.equals("int"))
			reportError(node.getLine() + ": [ARRCREAT] Array type can only be int.");
		
		if(!sizeType.equals("int"))
			reportError(node.getLine() + ": [ARRCREAT] Array size can only be int.");
				
		return type + "[]";
	}
	
	@Override
	public Object visitArrayAccess(CommonTree node)
	{
		Object typeObject = visitNode(node.getChild(0));
		String type = new String();
		if(typeObject instanceof String)
			type = (String)typeObject;
		
		if(typeObject instanceof MethodRecord)
			type = ((MethodRecord)typeObject).getReturnType();
		
		String indexType = (String)visitNode(node.getChild(1));
		
		if(!type.equals("int[]"))
			reportError(node.getLine() + ": [ARRACCE] Array access allowed only for ints.");
		
		if((indexType == null) || !indexType.equals("int"))
			reportError(node.getLine() + ": [ARRACCE] Array access index can only be int.");
		
		return type.replace("[]", "");
	}
		
	@Override
	public Object visitObjectCreation(CommonTree node)
	{
		String className = node.getChild(0).getText();
		if(symbolTable.getRecord(className) == null)
			reportError(node.getLine() + ": [NEW] Class \"" + className + "\" not found in type declaration.");
		
		return className;
	}
	
	@Override
	public Object visitThis(CommonTree node)
	{
		return currentClass;
	}
	
	@Override
	public Object visitInteger(CommonTree node)
	{
		return "int";
	}
	
	@Override
	public Object visitBoolean(CommonTree node)
	{
		return "boolean";
	}
	
	@Override
	public Object visitParentheses(CommonTree node)
	{		
		return visitNode(node.getChild(0));
	}
	
	@Override
	public Object visitSubtraction(CommonTree node)
	{
		checkAllChildrenType(node, "int", "[SUB] Not all parts are int.");
		
		return "int";
	}
	
	@Override
	public Object visitMultiplication(CommonTree node)
	{
		checkAllChildrenType(node, "int", "[MUL] Not all parts are int.");
		return "int";
	}
	
	@Override
	public Object visitAddition(CommonTree node)
	{
		checkAllChildrenType(node, "int", "[ADD] Not all parts are int.");
		return "int";
	}
	
	@Override
	public Object visitOr(CommonTree node)
	{
		checkAllChildrenType(node, "boolean", "[OR] Not all parts are boolean.");
		
		return "boolean";
	}
	
	@Override
	public Object visitAnd(CommonTree node)
	{
		checkAllChildrenType(node, "boolean", "[AND] Not all parts are boolean.");
		
		return "boolean";
	}
	
	@Override
	public Object visitNot(CommonTree node)
	{
		String exprType = (String)visitNode(node.getChild(0));
		if(!exprType.equals("boolean"))
			reportError(node.getLine() + ": [NOT] Argument not boolean.");			
		
		return "boolean";
	}
		
	@Override
	public Object visitLess(CommonTree node)
	{
		checkAllChildrenType(node, "int", "[LESS] Not all parts are int.");
		
		return "boolean";
	}
	
	@Override
	public Object visitEquals(CommonTree node)
	{
		String varType = (String)visitNode(node.getChild(0));
		String valueType = (String)visitNode(node.getChild(1));
		
		if(!varType.equals(valueType))
			reportError(node.getLine() + ": [ASSIGN] Can't assign " + valueType + " to variable of type " + varType + ".");
		
		return null;
	}
		
	@Override
	public Object visitIdentifier(CommonTree node)
	{
		String name = node.getText();
		
		if(currentClass != null && currentMethod != null) {
			ClassRecord classRecord = (ClassRecord)symbolTable.getRecord(currentClass);
			MethodRecord methodRecord = classRecord.getMethod(currentMethod);
			
			//method variables
			VariableRecord varRecord = methodRecord.getVariable(name);
			if(varRecord != null)
				return varRecord.getType();
			
			//method parameters
			VariableRecord paramRecord = methodRecord.getParameter(name);
			if(paramRecord != null)
				return paramRecord.getType();
			
			//methods
			MethodRecord methRecord = classRecord.getMethod(name);
			if(methRecord != null)
				return methRecord;
			
			//class variables
			VariableRecord classVarRecord = classRecord.getVariable(name);
			if(classVarRecord != null)
				return classVarRecord.getType();
		}
		
		reportError(node.getLine() + ": [ID] Unknown identifier \"" + name + "\"");
		
		return "???";
	}
	
	@Override 
	public Object visitIf(CommonTree node)
	{
		String condType = (String)visitNode(node.getChild(0));
		if(!condType.equals("boolean"))
			reportError(node.getLine() + ": [IF] Condition is not a boolean.");
		
		visitNode(node.getChild(1));
		visitNode(node.getChild(2));
		
		return null;
	}
	
	@Override 
	public Object visitWhile(CommonTree node)
	{
		String condType = (String)visitNode(node.getChild(0));
		if(!condType.equals("boolean"))
			reportError(node.getLine() + ": [WHILE] Condition is not a boolean.");
		
		visitNode(node.getChild(1));
		
		return null;
	}
}
