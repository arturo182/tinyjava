package artur.pacholec;

import artur.pacholec.records.AbstractRecord;

public final class SymbolTable 
{
	private Scope current;
	private Scope root;
	
	public SymbolTable()
	{
		root = new Scope(null);
		current = root;
	}
	
	public void enterScope()
	{
		current = current.nextChild();
	}
	
	public void exitScope()
	{
		current = current.getParent();
	}
	
	public void addRecord(AbstractRecord record)
	{
		current.addRecord(record);
	}
	
	public AbstractRecord getRecord(String id)
	{
		return current.getRecord(id);
	}
	
	public void print()
	{
		root.print(1);
	}
	
	public void printCurrent()
	{
		current.print(1);
	}
	
	public void reset()
	{
		root.reset();
	}
}
