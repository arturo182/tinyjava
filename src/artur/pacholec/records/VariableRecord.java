package artur.pacholec.records;

public final class VariableRecord extends AbstractRecord
{
	String type;
	
	public VariableRecord(String varType, String varName)
	{
		super(varName, RecordType.Variable);
		
		this.type = varType;
	}
	
	public String getType()
	{
		return type;
	}
	
	@Override
	public String toString()
	{
		return "VariableRecord[type = " + getType() + ",\tname = " + getId() + "]";
	}
}
