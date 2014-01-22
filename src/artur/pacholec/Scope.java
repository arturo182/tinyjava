package artur.pacholec;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import artur.pacholec.records.AbstractRecord;

public final class Scope 
{
	private HashMap<String, AbstractRecord> records;
	private List<Scope> children;
	private int iterator;
	private Scope parent;
	
	public Scope(Scope parent)
	{
		this.records = new HashMap<>();
		this.children = new ArrayList<>();
		this.parent = parent;
		
		reset();
	}
	
	public void addRecord(AbstractRecord record)
	{
		records.put(record.getId(), record);
	}
	
	public AbstractRecord getRecord(String id)
	{
		if(records.containsKey(id))
			return records.get(id);
		
		if(parent == null)
			return null;
		
		return parent.getRecord(id);
	}
	
	public Scope nextChild()
	{
		if(iterator < children.size()) {
			++iterator;
			return children.get(iterator - 1);
		}
		
		Scope child = new Scope(this);
		children.add(child);
		
		++iterator;
		
		return child;
	}
	
	public Scope getParent()
	{
		return parent;
	}

	public void print(int indent)
	{
		String tabs = "";
		for(int i = 0; i < indent - 1; ++i)
			tabs += "\t";
		
		System.out.println(tabs + "Scope");
		
		tabs += "\t";
		
		Iterator it = records.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			
			System.out.println(tabs + entry.getKey() + " - " + entry.getValue());
		}
		
		for(int i = 0; i < children.size(); ++i)
			children.get(i).print(indent + 1);		
	}
	
	public void reset()
	{
		iterator = 0;
		
		for(int i = 0; i < children.size(); ++i)
			children.get(i).reset();
	}
}
