package artur.pacholec.bytecode;

import artur.pacholec.bytecode.Instruction.InstructionCode;
import java.io.Serializable;
import java.util.ArrayList;

public final class Method implements Serializable
{
	public static String qualifiedName(String className, String methodName)
	{
		return className + "." + methodName;
	}
	
	private ArrayList<Instruction> instructionList;
	private ArrayList<String> variableList;
	private String name;
	
	public Method(String name)
	{
		this.instructionList = new ArrayList<>();
		this.variableList = new ArrayList<>();
		this.name = name;
	}
	
	public void addInstruction(InstructionCode code, Object argument)
	{
		addInstruction(new Instruction(code, argument));
	}
	
	public void addInstruction(InstructionCode code)
	{
		addInstruction(code, null);
	}

	public void addInstruction(Instruction instruction)
	{
		instructionList.add(instruction);
	}

	public Instruction getInstruction(int idx)
	{
		return instructionList.get(idx);
	}

	public int getCurrentIndex()
	{
		return instructionList.size();
	}
	
	public int indexOf(String varName)
	{
		return variableList.indexOf(varName);
	}

	public String getName()
	{
		return name;
	}

	public ArrayList<Instruction> getInstructionList()
	{
		return instructionList;
	}

	public ArrayList<String> getVariableList()
	{
		return variableList;
	}

	public void setVariableList(ArrayList<String> vars)
	{
		variableList.addAll(vars);
	}
}
