package artur.pacholec.bytecode;

import artur.pacholec.bytecode.Instruction.InstructionCode;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class ClassFile implements Serializable
{
	private HashMap<String, Method> methodHash;
	
	public ClassFile()
	{
		methodHash = new HashMap<>();
	}
	
	public void addMethod(Method method)
	{
		methodHash.put(method.getName(), method);
	}
	
	public Method getMethod(String methodName)
	{
		return methodHash.get(methodName);
	}
	
	public void print()
	{
		for(Map.Entry<String, Method> entry : methodHash.entrySet()) {
			System.out.println(entry.getKey() + ":");
			
			Method method = entry.getValue();
			
			String vars = "";			
			for(String variable : method.getVariableList())
				vars += "#" + method.getVariableList().indexOf(variable) + " = " + variable + ", ";
			
			if(vars.length() > 0)
				vars = vars.substring(0, vars.length() - 2);
			
			System.out.println("\tVariables: [" + vars + "]");
		
			System.out.println("\tInstructions:");
			int i = 0;
			for(Instruction instruction : method.getInstructionList())
				System.out.println("\t\t" + i++ + "\t" + instruction.getCode() + " (" + instruction.getArgument() + ")");
		}
	}

	public void saveToStream(ObjectOutputStream out) throws IOException
	{
		//method count
		out.writeInt(methodHash.size());
		for(Map.Entry<String, Method> entry : methodHash.entrySet()) {
			String name = entry.getKey();
			Method method = entry.getValue();
			
			ArrayList<String> variables = method.getVariableList();
			ArrayList<Instruction> instructions = method.getInstructionList();
			
			//method name
			out.writeUTF(name);			
			
			//variables count
			out.writeInt(variables.size());
			
			//variable names
			for(String var : variables)
				out.writeUTF(var);
			
			//instructions count
			out.writeInt(instructions.size());
			
			//instructions
			for(Instruction instruction : instructions) {
				out.writeByte(instruction.getCode().getIntValue());
				
				Object arg = instruction.getArgument();
				if((arg == null) || (arg.getClass().getName().contains("Integer"))) {
					out.writeByte(0);
					out.writeInt((arg == null) ? 0 : (int)arg);
				} else {
					out.writeByte(1);
					out.writeUTF((String)arg);
				}
			}
		}		
	}

	public void loadFromStream(ObjectInputStream in) throws IOException, ClassNotFoundException
	{
		int methodCount = in.readInt();
		for(int i = 0; i < methodCount; ++i) {
			String methodName = in.readUTF();
			Method method = new Method(methodName);
			
			ArrayList<String> variables = new ArrayList<>();
			int variableCount = in.readInt();
			for(int j = 0; j < variableCount; ++j)
				variables.add(in.readUTF());
			
			method.setVariableList(variables);
			
			int instructionCount = in.readInt();
			for(int j = 0; j < instructionCount; ++j) {
				int code = in.readByte();
				Object arg = null;
				
				switch(in.readByte()) {
					case 0: arg = in.readInt(); break;
					case 1: arg = in.readUTF(); break;
				}
				
				method.addInstruction(InstructionCode.fromIntValue(code), arg);
			}
			
			methodHash.put(methodName, method);
		}
	}
	
	public boolean hasErrors()
	{
		if(methodHash.isEmpty())
			return true;
		
		for(Map.Entry<String, Method> entry : methodHash.entrySet()) {
			Method method = entry.getValue();
			
			if(method.getInstructionList().isEmpty())
				return true;
		}
		
		return false;
	}
}
