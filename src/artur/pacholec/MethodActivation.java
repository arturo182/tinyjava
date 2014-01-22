package artur.pacholec;

import artur.pacholec.bytecode.Instruction;
import artur.pacholec.bytecode.Method; 
import java.util.ArrayList;

public final class MethodActivation 
{
	ArrayList<Integer> varValues;
	int programCounter;
	Method method;
	
	public MethodActivation(Method method)
	{
		this.varValues = new ArrayList<>();
		this.programCounter = 0;
		this.method = method;
		
		int variableCount = method.getVariableList().size();
		for(int i = 0; i < variableCount; ++i)
			this.varValues.add(0);
	}

	public Instruction nextInstruction()
	{
		return method.getInstruction(programCounter++);
	}

	public void setProgramCounter(int programCounter)
	{
		this.programCounter = programCounter;
	}
	
	public void setVariable(int varIdx, int varValue)
	{
		varValues.set(varIdx, varValue);
	}

	public int getVariable(int varIdx)
	{
		return varValues.get(varIdx);
	}
	
	public ArrayList<Integer> getVariableValues()
	{
		return varValues;
	}
}
