package artur.pacholec.visitors;

import artur.pacholec.SymbolTable;
import artur.pacholec.bytecode.ClassFile;
import artur.pacholec.bytecode.Instruction;
import artur.pacholec.bytecode.Method;
import artur.pacholec.minijava.MiniJavaLexer;
import artur.pacholec.records.AbstractRecord;
import artur.pacholec.records.ClassRecord;
import artur.pacholec.records.MethodRecord;
import artur.pacholec.records.VariableRecord;
import java.util.ArrayList;
import java.util.Collections;
import org.antlr.runtime.tree.CommonTree;

public final class CodeGenVisitor extends AbstractVisitor
{
	private SymbolTable symbolTable;
	private Method currentMethod;
	private String currentClass;
	private ClassFile classFile;
	
	private Object addChildrenInstructions(CommonTree node, Instruction.InstructionCode instructionCode)
	{
		visitNode(node.getChild(0));
		
		for(int i = 1; i < node.getChildCount(); ++i) {
			visitNode(node.getChild(i));
			currentMethod.addInstruction(instructionCode, null);
		}
		
		return null;
	}
	
	public CodeGenVisitor(SymbolTable symbolTable)
	{
		this.symbolTable = symbolTable;
		this.currentMethod = null;
		this.currentClass = null;
		this.classFile = new ClassFile();
		
		this.symbolTable.reset();
	}
	
	public ClassFile getClassFile()
	{
		return classFile;
	}
	
	@Override
	public Object visitMainClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		
		currentClass = name;		
		currentMethod = new Method(Method.qualifiedName(name, "main"));
		classFile.addMethod(currentMethod);
		
		symbolTable.enterScope();
			visitNode(node.getChild(2));
		symbolTable.exitScope();		
		
		currentMethod.addInstruction(Instruction.InstructionCode.Stop);
		
		return name;
	}
	
	@Override
	public Object visitClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		
		currentClass = name;
		currentMethod = null;
				
		symbolTable.enterScope();
			visitNode(node.getChild(2).getChild(1));
		symbolTable.exitScope();
		
		return name;
	}
	
	@Override
	public Object visitMethod(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(2));
		
		MethodRecord methodRecord = (MethodRecord)symbolTable.getRecord(name);
		
		currentMethod = new Method(Method.qualifiedName(currentClass, name));
		currentMethod.setVariableList(methodRecord.getLocals());
		
		int parameterCount = methodRecord.getParameterList().size();
		for(int i = parameterCount - 1; i >= 0; --i) 
			currentMethod.addInstruction(Instruction.InstructionCode.IntStore, i);
		
		classFile.addMethod(currentMethod);
				
		symbolTable.enterScope();
			visitNode(node.getChild(3));
			visitNode(node.getChild(4));
			visitNode(node.getChild(5));
			visitNode(node.getChild(6));
		symbolTable.exitScope();
		
		return name;
	}
	
	@Override
	public Object visitInteger(CommonTree node)
	{
		currentMethod.addInstruction(Instruction.InstructionCode.IntConst, Integer.valueOf(node.getText()));
		
		return node.getText();
	}
	
	@Override
	public Object visitBoolean(CommonTree node)
	{
		currentMethod.addInstruction(Instruction.InstructionCode.IntConst, (node.getText().equals("true") ? 1 : 0));
		
		return node.getText();
	}
	
	@Override
	public Object visitIdentifier(CommonTree node)
	{
		String name = node.getText();
		
		if(symbolTable.getRecord(name) instanceof VariableRecord) {		
			int idx = currentMethod.indexOf(name);
			currentMethod.addInstruction(Instruction.InstructionCode.IntLoad, idx);
		} else if(symbolTable.getRecord(name) instanceof MethodRecord) {
			currentMethod.addInstruction(Instruction.InstructionCode.InvokeVirtual, Method.qualifiedName(currentClass, name));
		}
		
		return name;
	}
	
	@Override
	public Object visitEquals(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		visitNode(node.getChild(1));
		
		int idx = currentMethod.indexOf(name);
		currentMethod.addInstruction(Instruction.InstructionCode.IntStore, idx);
		
		return null;
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
		
		visitNode(node.getChild(1));
				
		return type.replace("[]", "");
	}
	
	@Override
	public Object visitPrintLn(CommonTree node)
	{
		Object result =  visitNode(node.getChild(0));
		
		currentMethod.addInstruction(Instruction.InstructionCode.Print);
		
		return result;
	}
	
	@Override
	public Object visitObjectCreation(CommonTree node)
	{
		return node.getChild(0).getText();
	}
	
	@Override
	public Object visitArrayCreation(CommonTree node)
	{
		visitNode(node.getChild(1));
					
		return null;
	}
	
	@Override
	public Object visitDot(CommonTree node)
	{
		String type = (String)visitNode(node.getChild(0));
		String method = node.getChild(1).getText();
		
		if(type.equals("this"))
			type = currentClass;
		
		currentMethod.addInstruction(Instruction.InstructionCode.InvokeVirtual, Method.qualifiedName(type, method));
		
		return null;
	}
	
	@Override
	public Object visitMethodCall(CommonTree node)
	{
		//args
		visitNode(node.getChild(1));
		
		//method
		visitNode(node.getChild(0));

		return null;
	}
	
	@Override
	public Object visitAddition(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntAdd);
	}
	
	@Override
	public Object visitSubtraction(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntSub);
	}
		
	@Override
	public Object visitMultiplication(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntMul);
	}
	
	@Override
	public Object visitOr(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntOr);
	}
	
	@Override
	public Object visitAnd(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntAnd);
	}
	
	@Override
	public Object visitNot(CommonTree node)
	{
		visitNode(node.getChild(0));
		currentMethod.addInstruction(Instruction.InstructionCode.IntNot);
		
		return null;
	}
	
	@Override
	public Object visitLess(CommonTree node)
	{
		return addChildrenInstructions(node, Instruction.InstructionCode.IntLess);
	}
	
	@Override
	public Object visitReturn(CommonTree node)
	{
		super.visitReturn(node);
		
		currentMethod.addInstruction(Instruction.InstructionCode.IntReturn);
		
		return null;
	}
	
	@Override
	public Object visitWhile(CommonTree node)
	{
		int startIdx = currentMethod.getCurrentIndex();
		visitNode(node.getChild(0));
		
		Instruction ifInstruction = new Instruction(Instruction.InstructionCode.IfFalse);
		currentMethod.addInstruction(ifInstruction);
		
		visitNode(node.getChild(1));
		currentMethod.addInstruction(Instruction.InstructionCode.Goto, startIdx);
		
		int endIdx = currentMethod.getCurrentIndex();
		ifInstruction.setArgument(endIdx);
		
		return null;
	}
	
	@Override 
	public Object visitIf(CommonTree node)
	{
		visitNode(node.getChild(0));
		
		Instruction ifInstruction = new Instruction(Instruction.InstructionCode.IfFalse);
		currentMethod.addInstruction(ifInstruction);
		
		visitNode(node.getChild(1));
		ifInstruction.setArgument(currentMethod.getCurrentIndex() + 1);
		
		Instruction gotoInstruction = new Instruction(Instruction.InstructionCode.Goto);
		currentMethod.addInstruction(gotoInstruction);		
		
		visitNode(node.getChild(2));
		
		int endIdx = currentMethod.getCurrentIndex();
		gotoInstruction.setArgument(endIdx);
		
		return null;
	}
}
