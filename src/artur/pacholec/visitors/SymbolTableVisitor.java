package artur.pacholec.visitors;

import artur.pacholec.SymbolTable;
import artur.pacholec.records.AbstractRecord;
import artur.pacholec.records.AbstractRecord.RecordType;
import org.antlr.runtime.tree.CommonTree;
import artur.pacholec.records.ClassRecord;
import artur.pacholec.records.MethodRecord;
import artur.pacholec.records.VariableRecord;

//SymbolTableVisitor creates a SymbolTable for the nodes
public final class SymbolTableVisitor extends AbstractVisitor
{
	private MethodRecord currentMethod;
	private ClassRecord currentClass;
	private SymbolTable symbolTable;
	boolean shouldContinue = true;
	
	public SymbolTableVisitor()
	{
		currentMethod = null;
		currentClass = null;
		symbolTable = new SymbolTable();
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
	
	public SymbolTable getSymbolTable()
	{
		return symbolTable;
	}
	
	@Override
	public Object visitMainClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		String arg = node.getChild(1).getChild(0).getText();
		
		currentClass = new ClassRecord(name);
		
		VariableRecord argRecord = new VariableRecord("String[]", arg);
		currentClass.addVariable(argRecord);
		
		symbolTable.addRecord(currentClass);
		symbolTable.enterScope();
			symbolTable.addRecord(argRecord);
		symbolTable.exitScope();
		
		return currentClass;
	}
	
	@Override
	public Object visitClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		String sup = (String)visitNode(node.getChild(1));
		
		if(symbolTable.getRecord(name) != null) {
			reportError(node.getLine() + ": Duplicate class " + name + ".");
			return null;
		}
		
		currentClass = new ClassRecord(name);
		currentMethod = null;
		
		symbolTable.addRecord(currentClass);
		symbolTable.enterScope();
			visitNode(node.getChild(2).getChild(0));
			visitNode(node.getChild(2).getChild(1));
		symbolTable.exitScope();
		
		return currentClass;
	}
	
	@Override
	public Object visitMethod(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(2));
		String returnType = (String)visitNode(node.getChild(1));
		String visibility = (String)visitNode(node.getChild(0));
		
		if(symbolTable.getRecord(name) != null) {
			reportError(node.getLine() + ": Method " + name + " is already defined in class " + currentClass.getId() + ".");
			return null;
		}
		
		currentMethod = new MethodRecord(currentClass, name, returnType, visibility.equals("public"));
		currentClass.addMethod(currentMethod);
		
		symbolTable.addRecord(currentMethod);
		symbolTable.enterScope();
			visitNode(node.getChild(3));
			visitNode(node.getChild(4));
		symbolTable.exitScope();
		
		return currentMethod;
	}
	
	@Override
	public Object visitParameters(CommonTree node)
	{
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree variable = (CommonTree)node.getChild(i);
			
			String type = (String)variable.getChild(0).getText();
			String name = (String)visitNode(variable.getChild(1));
			
			VariableRecord record = new VariableRecord(type, name);
			currentMethod.addParameter(record);
			symbolTable.addRecord(record);
		}
		
		return null;
	}
	
	@Override
	public Object visitVariables(CommonTree node)
	{
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree variable = (CommonTree)node.getChild(i);

			String type = (String)variable.getChild(0).getText();
			String name = (String)visitNode(variable.getChild(1));
			
			AbstractRecord record = symbolTable.getRecord(name);
			if((record != null) && (record.getRecordType() == RecordType.Variable)) {
				reportError(variable.getLine() + ": Variable \"" + name + "\" is already defined.");
				return null;
			}
			
			VariableRecord varRecord = new VariableRecord(type, name);
			symbolTable.addRecord(varRecord);
						
			if(currentMethod != null) {
				currentMethod.addVariable(varRecord);
			} else if(currentClass != null) {
				currentClass.addVariable(varRecord);
			}			
		}
		
		return null;	
	}
}
