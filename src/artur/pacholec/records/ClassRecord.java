package artur.pacholec.records;

import java.util.HashMap;

public final class ClassRecord extends AbstractRecord
{
	HashMap<String, VariableRecord> variableHash;
	HashMap<String, MethodRecord> methodHash;
	ClassRecord superClass = null;
	
	public ClassRecord(String className)
	{
		this(className, null);
	}
	
	public ClassRecord(String className, ClassRecord superClass)
	{
		super(className, RecordType.Class);
		
		this.variableHash = new HashMap<>();		
		this.methodHash = new HashMap<>();		
		this.superClass = superClass;
	}
	
	public ClassRecord getSuper()
	{
		return superClass;
	}
	
	public void addMethod(MethodRecord method)
	{
		methodHash.put(method.getId(), method);
	}
	
	public MethodRecord getMethod(String methodName)
	{
		return methodHash.get(methodName);
	}
	
	public void addVariable(VariableRecord variable)
	{
		variableHash.put(variable.getId(), variable);
	}
	
	public VariableRecord getVariable(String varName)
	{
		return variableHash.get(varName);
	}
	
	@Override
	public String toString()
	{
		return "ClassRecord[name = " + getId() + (getSuper() == null ? "" : ",\tsup = " + getSuper()) + ",\tmethods = " + methodHash.size() + ",\tvars = " + variableHash.size() + "]";
	}
}
