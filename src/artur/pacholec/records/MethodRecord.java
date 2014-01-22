package artur.pacholec.records;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class MethodRecord extends AbstractRecord
{
	HashMap<String, VariableRecord> variableHash;
	ArrayList<VariableRecord> parameterList;
	ClassRecord classRecord;
	String returnType;
	boolean isPublic;
	
	public MethodRecord(ClassRecord classRecord, String methodName, String returnType)
	{
		this(classRecord, methodName, returnType, false);
	}
	
	public MethodRecord(ClassRecord classRecord, String methodName, String returnType, boolean isPublic)
	{
		super(methodName, RecordType.Method);
		
		this.parameterList = new ArrayList<>();
		this.variableHash = new HashMap<>();
		this.classRecord = classRecord;
		this.returnType = returnType;
		this.isPublic = isPublic;
	}
	
	public ClassRecord getClassRecord()
	{
		return classRecord;
	}
	
	public boolean isPublic()
	{
		return isPublic;
	}
	
	public boolean isPrivate() 
	{
		return !isPublic;
	}
	
	public String getReturnType()
	{
		return returnType;
	}
	
	public void addParameter(VariableRecord parameter)
	{
		parameterList.add(parameter);
	}
	
	public VariableRecord getParameter(String paramName)
	{
		for(int i = 0; i < parameterList.size(); ++i) {
			if(parameterList.get(i).getId().equals(paramName))
				return parameterList.get(i);
		}
		
		return null;
	}
	
	public int getParameterCount()
	{
		return parameterList.size();
	}
	
	public ArrayList<VariableRecord> getParameterList()
	{
		return parameterList;
	}
	
	public void addVariable(VariableRecord variable)
	{
		variableHash.put(variable.getId(), variable);
	}
	
	public VariableRecord getVariable(String varName)
	{
		return variableHash.get(varName);
	}
	
	public ArrayList<String> getLocals()
	{
		ArrayList<String> locals = new ArrayList<String>();
		
		for(VariableRecord var : parameterList)
			locals.add(var.getId());
		
		for(Map.Entry<String, VariableRecord> var : variableHash.entrySet()) {
			VariableRecord varRecord = var.getValue();
			locals.add(varRecord.getId());
		}
		
		return locals;
	}
	
	@Override
	public String toString()
	{
		return "MethodRecord[name = " + getId() + ",\treturnType = " + getReturnType() + ",\tparams = " + parameterList.size() + ",\tvars = " + variableHash.size() + "]";
	}
}
