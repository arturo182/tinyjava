package artur.pacholec.visitors;

import artur.pacholec.minijava.MiniJavaLexer;
import org.antlr.runtime.tree.CommonTree;

//PrintVisitor return a text representation of the nodes
public final class PrintVisitor extends AbstractVisitor
{
	private int indent = 0;
	
	private String getIndent()
	{
		String tabs = "";
		for(int i = 0; i < indent; ++i)
			tabs += "\t";
		
		return tabs;
	}
	
	@Override
	public Object visitMainClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		String arg = node.getChild(1).getChild(0).getText();
		
		System.out.println(getIndent() + "MainClass[name = " + name +", arg = " + arg + "]");
		
		++indent;
		Object result =  super.visitMainClass(node);
		--indent;
		
		System.out.println();
		
		return result;
	}
	
	@Override
	public Object visitClass(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(0));
		String sup = (String)visitNode(node.getChild(1));
		
		System.out.println(getIndent() + "Class[name = " + name + (sup.equals("") ? "" : ",\tsup = " + sup) + "]");
		
		++indent;
		Object result =  super.visitClass(node);
		--indent;
		
		System.out.println();
		
		return result;
	}
	
	@Override
	public Object visitMethod(CommonTree node)
	{
		String name = (String)visitNode(node.getChild(2));
		String returnType = (String)visitNode(node.getChild(1));
		String visibility = (String)visitNode(node.getChild(0));
		
		System.out.println(getIndent() + "Method[visibility=" + visibility + ",\treturn_type=" + returnType + ",\tname=" + name + "]");
		
		++indent;
		Object result =  super.visitMethod(node);
		--indent;
		
		return result;
	}
	
	@Override 
	public Object visitParameters(CommonTree node)
	{
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree variable = (CommonTree)node.getChild(i);
			String type = variable.getChild(0).getText();
			String name = variable.getChild(1).getText();
			
			System.out.println(getIndent() + "Parameter[type=" + type + ",\tname=" + name + "]");
		}
		
		return super.visitParameters(node);
	}
	
	@Override
	public Object visitVariables(CommonTree node)
	{			
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree variable = (CommonTree)node.getChild(i);
			String type = variable.getChild(0).getText();
			String name = variable.getChild(1).getText();
			
			System.out.println(getIndent() + "Variable[type=" + type + ",\tname=" + name + "]");
		}
		
		if(node.getChildCount() > 0)
			System.out.println();
			
		return super.visitVariables(node);
	}
	
	@Override
	public Object visitStatements(CommonTree node)
	{
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree statement = (CommonTree)node.getChild(i);
			if(statement.getType() == MiniJavaLexer.IF)
				continue;
			
			System.out.println(getIndent() + "Statement[" + visitNode(statement) + "]");
		}
		
		return super.visitStatements(node);
	}
			
	@Override
	public Object visitBlock(CommonTree node)
	{
		System.out.println(getIndent() + "BLOCK");
		++indent;
		
		for(int i = 0; i < node.getChildCount(); ++i) {
			CommonTree statement = (CommonTree)node.getChild(i);
			
			if(statement.getType() == MiniJavaLexer.IF) {
				visitNode(statement);
			} else {
				System.out.println(getIndent() + "Statement[" + visitNode(statement) + "]");
			}
		}
		
		--indent;
		System.out.println(getIndent() + "ENDBLOCK");
		
		
		return null;//super.visitBlock(node);
	}
	
	@Override 
	public Object visitIf(CommonTree node)
	{
		String cond = (String)visitNode(node.getChild(0));
		
		System.out.println(getIndent() + "IF[" + cond + "]");
		
		++indent;
		Object trueStat = visitNode(node.getChild(1));
		if(trueStat != null)
			System.out.println(getIndent() + (String)trueStat);
		--indent;
		
		System.out.println(getIndent() + "ELSE");
		
		++indent;
		Object falseStat = visitNode(node.getChild(2));			
		if(falseStat != null)
			System.out.println(getIndent() + (String)falseStat);	
		--indent;
		
		System.out.println(getIndent() + "ENDIF");
		
		return null;
	}
	
	@Override
	public Object visitWhile(CommonTree node)
	{
		String cond = (String)visitNode(node.getChild(0));
		
		System.out.println(getIndent() + "WHILE[" + cond + "]");
		
		++indent;
		Object stat = visitNode(node.getChild(1));			
		if(stat != null)
			System.out.println(getIndent() + (String)stat);	
		--indent;
		
		System.out.println(getIndent() + "END");
		
		return null;
	}
	
	@Override 
	public Object visitReturn(CommonTree node)
	{
		String value = (String)visitNode(node.getChild(0));
		
		System.out.println(getIndent() + "Return[" + value + "]");
		
		return super.visitReturn(node);
	}
	
	@Override
	public Object visitPrintLn(CommonTree node)
	{
		String arg = (String)visitNode(node.getChild(0));
		String text = "System.out.println(" + arg + ")";
		
		if(node.getParent().getType() != MiniJavaLexer.BLOCK)
			System.out.println(getIndent() + text);
		
		return text;
	}
}
