package artur.pacholec.records;

public abstract class AbstractRecord 
{
	public enum RecordType
	{
		Class,
		Method,
		Variable
	}
	
	private RecordType recordType;
	private String id;
	
	public AbstractRecord(String id, RecordType recordType)
	{
		this.id = id;
		this.recordType = recordType;
	}
	
	public String getId()
	{
		return id;
	}
	
	public RecordType getRecordType()
	{
		return recordType;
	}
}
