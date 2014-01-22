package artur.pacholec.visitors;

import org.antlr.runtime.tree.CommonTree;
import artur.pacholec.minijava.MiniJavaLexer;
import org.antlr.runtime.tree.Tree;

// The AbstractVisitor mostly returns the code that generated the nodes
public abstract class AbstractVisitor
{
	private void visitChildren(CommonTree node)
	{
		for(int i = 0; i < node.getChildCount(); ++i)
			visitNode(node.getChild(i));
	}
	
	// Returns a string of all children concatenated with a separator
	private String visitChildrenToString(CommonTree node, String sep)
	{
		String str = "";
		
		for(int i = 0; i < node.getChildCount(); ++i)
			str += visitNode(node.getChild(i)) + sep;
		
		if(str.length() > 0)
			str = str.substring(0, str.length() - sep.length());
		
		return str;
	}
	
	public Object visitNode(CommonTree node)
	{
		switch(node.getType()) {
			case MiniJavaLexer.PROGRAM:			return visitProgram(node);
			case MiniJavaLexer.MAINCLASS:		return visitMainClass(node);
			case MiniJavaLexer.CLASS:			return visitClass(node);
			case MiniJavaLexer.NAME:			return visitName(node);
			case MiniJavaLexer.SUPER:			return visitSuper(node);
			case MiniJavaLexer.BODY:			return visitBody(node);
			case MiniJavaLexer.METHODS:			return visitMethods(node);
			case MiniJavaLexer.METHOD:			return visitMethod(node);
			case MiniJavaLexer.VISIBILITY:		return visitVisibility(node);
			case MiniJavaLexer.RETURN:			return visitReturn(node);
			case MiniJavaLexer.RETURN_TYPE:		return visitReturnType(node);
			case MiniJavaLexer.STATEMENTS:		return visitStatements(node);
			case MiniJavaLexer.VARIABLES:		return visitVariables(node);
			case MiniJavaLexer.PARAMETERS:		return visitParameters(node);
			case MiniJavaLexer.VARIABLE:		return visitVariable(node);
			case MiniJavaLexer.BLOCK:			return visitBlock(node);
			case MiniJavaLexer.Identifier:		return visitIdentifier(node);
			case MiniJavaLexer.EQ:				return visitEquals(node);
			case MiniJavaLexer.MUL:				return visitMultiplication(node);
			case MiniJavaLexer.ADD:				return visitAddition(node);
			case MiniJavaLexer.SUB:				return visitSubtraction(node);	
			case MiniJavaLexer.OR:				return visitOr(node);
			case MiniJavaLexer.AND:				return visitAnd(node);
			case MiniJavaLexer.NOT:				return visitNot(node);
			case MiniJavaLexer.LESS:			return visitLess(node);		
			case MiniJavaLexer.PRINTLN_CALL:	return visitPrintLn(node);
			case MiniJavaLexer.METHOD_CALL:		return visitMethodCall(node);
			case MiniJavaLexer.ARGUMENTS:		return visitArguments(node);
			case MiniJavaLexer.ARRAY_CREATION:	return visitArrayCreation(node);
			case MiniJavaLexer.OBJECT_CREATION:	return visitObjectCreation(node);
			case MiniJavaLexer.ARRAY_ACCESS:	return visitArrayAccess(node);
			case MiniJavaLexer.PARENTHESES:		return visitParentheses(node);
			case MiniJavaLexer.THIS:			return visitThis(node);
			case MiniJavaLexer.DOT:				return visitDot(node);
			case MiniJavaLexer.Integer:			return visitInteger(node);
			case MiniJavaLexer.Boolean:			return visitBoolean(node);
			case MiniJavaLexer.IF:				return visitIf(node);
			case MiniJavaLexer.WHILE:			return visitWhile(node);
				
			default:
			{
				System.err.println("Unknown node type: " + ((node.getToken() == null) ? "null" : node.getToken().getText()) + " (" + node.getType() + ") [" + node.getParent().getText() + "]");
			}
		}
		
		return node.getText();
	}
	
	public Object visitNode(Tree node)
	{
		return visitNode((CommonTree)node);
	}

	public Object visitProgram(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitMainClass(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitClass(CommonTree node)
	{
		visitChildren(node);
		return null;
	}

	public Object visitName(CommonTree node)
	{
		return node.getChild(0).getText();
	}

	public Object visitSuper(CommonTree node)
	{
		if(node.getChildCount() > 0)
			return node.getChild(0).getText();
				
		return "";
	}

	public Object visitBody(CommonTree node)
	{
		visitChildren(node);
		return null;
	}

	public Object visitMethods(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitMethod(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitVariables(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitParameters(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitVariable(CommonTree node)
	{
		return null;
	}

	public Object visitVisibility(CommonTree node)
	{
		if(node.getChildCount() > 0)
			return node.getChild(0).getText();
				
		return "private";
	}

	public Object visitReturn(CommonTree node)
	{
		visitChildren(node);
		return null;
	}

	public Object visitReturnType(CommonTree node)
	{
		return node.getChild(0).getText();
	}

	public Object visitStatements(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
	
	public Object visitBlock(CommonTree node)
	{
		visitChildren(node);
		return null;
	}

	public Object visitIdentifier(CommonTree node)
	{
		return node.getText();
	}
	
	public Object visitEquals(CommonTree node)
	{
		String var = (String)visitNode(node.getChild(0));
		String value = (String)visitNode(node.getChild(1));
		
		return var + " = " + value;
	}
	
	public Object visitMultiplication(CommonTree node)
	{
		return visitChildrenToString(node, " * ");
	}
	
	public Object visitAddition(CommonTree node)
	{
		return visitChildrenToString(node, " + ");
	}
	
	public Object visitOr(CommonTree node)
	{
		return visitChildrenToString(node, " || ");
	}
	
	public Object visitAnd(CommonTree node)
	{
		return visitChildrenToString(node, " && ");
	}
	
	public Object visitNot(CommonTree node)
	{
		String expr = (String)visitNode(node.getChild(0));
		
		return "!" + expr;
	}
	
	public Object visitLess(CommonTree node)
	{
		return visitChildrenToString(node, " < ");
	}
	
	public Object visitPrintLn(CommonTree node)
	{
		return visitNode(node.getChild(0));
	}

	public Object visitMethodCall(CommonTree node)
	{
		String method = (String)visitNode(node.getChild(0));
		String args = (String)visitNode(node.getChild(1));

		return method + "(" + args + ")";
	}
	
	public Object visitArguments(CommonTree node)
	{
		return visitChildrenToString(node, ", ");
	}
	
	public Object visitThis(CommonTree node)
	{
		return node.getText();
	}

	public Object visitArrayCreation(CommonTree node)
	{
		String type = node.getChild(0).getText();
		String size = (String)visitNode(node.getChild(1));
		
		return "new " + type + "[" + size + "]";
	}

	public Object visitObjectCreation(CommonTree node)
	{
		String className = node.getChild(0).getText();
		return "new " + className + "()";
	}
	
	public Object visitArrayAccess(CommonTree node)
	{
		String var = (String)visitNode(node.getChild(0));
		String index = (String)visitNode(node.getChild(1));
		
		return var + "[" + index + "]";
	}
	
	public Object visitSubtraction(CommonTree node)
	{
		if(node.getChildCount() == 1) {
			String expr = (String)visitNode(node.getChild(0));
			return "-" + expr;
		}
		
		return visitChildrenToString(node, " - ");
	}
	
	public Object visitDot(CommonTree node)
	{
		return visitChildrenToString(node, ".");
	}

	public Object visitParentheses(CommonTree node)
	{
		String expr = (String)visitNode(node.getChild(0));
		
		return "(" + expr + ")";
	}

	public Object visitInteger(CommonTree node)
	{
		return node.getText();
	}
	
	public Object visitBoolean(CommonTree node)
	{
		return node.getText();
	}

	public Object visitIf(CommonTree node)
	{
		visitChildren(node);
		return null;
	}

	public Object visitWhile(CommonTree node)
	{
		visitChildren(node);
		return null;
	}
}
