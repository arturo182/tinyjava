package artur.pacholec;

import artur.pacholec.minijava.MiniJavaParser;
import artur.pacholec.minijava.MiniJavaLexer;
import artur.pacholec.bytecode.ClassFile;
import artur.pacholec.visitors.CodeGenVisitor;
import artur.pacholec.visitors.PrintVisitor;
import artur.pacholec.visitors.SymbolTableVisitor;
import artur.pacholec.visitors.TypeCheckVisitor;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;

public class CodeGen 
{
    public static void main(String[] args) throws IOException, RecognitionException 
    {
		if(args.length == 0) {
			System.out.println("Usage: java -jar 4dv006.artur.pacholec.codegen.jar \"file_to_process.java\"");
			return;
		}
		
        String sourceFileName = args[0];
		if(!new File(sourceFileName).exists()) {
			System.err.println("File \"" + sourceFileName + "\" not found.");
			return;
		}
		
		System.out.println("Processing \"" + sourceFileName + "\"...\n");
		
        ANTLRReaderStream readerStream = new ANTLRReaderStream(new FileReader(sourceFileName));
        CommonTokenStream tokenStream = new CommonTokenStream(new MiniJavaLexer(readerStream));
        
        MiniJavaParser parser = new MiniJavaParser(tokenStream);
        CommonTree root = (CommonTree)parser.program().getTree();
		
		//don't go any further if syntax error
		if(parser.getNumberOfSyntaxErrors() > 0)
			return;

		//print
        PrintVisitor printVisitor = new PrintVisitor();
		
		System.out.println("PRINT:");
        printVisitor.visitNode(root);
		
		//symbol table
		SymbolTableVisitor symbolTableVisitor = new SymbolTableVisitor();
		symbolTableVisitor.visitNode(root);
		
		SymbolTable symbolTable = symbolTableVisitor.getSymbolTable();
		
		System.out.println("SYMBOL:");
		symbolTable.print();
		
		if(symbolTableVisitor.hasErrors())
			return;
		
		//type check
		TypeCheckVisitor typeCheckVisitor = new TypeCheckVisitor(symbolTable);
		
		System.out.println("TYPE:");
		typeCheckVisitor.visitNode(root);
		
		if(!typeCheckVisitor.hasErrors())
			System.out.println("Everything went fine!");
		
		
		System.out.println("CODE:");
		//code generation
		CodeGenVisitor codeGenVisitor = new CodeGenVisitor(symbolTable);
		codeGenVisitor.visitNode(root);
		
		ClassFile classFile = codeGenVisitor.getClassFile();
		classFile.print();
				
		try {
			String classFileName = sourceFileName.replace(".java", ".tjc");
			
			FileOutputStream fileOut = new FileOutputStream(classFileName);
			
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			classFile.saveToStream(out);
			out.close();
			
			fileOut.close();
		} catch(IOException ex){
			System.out.println("Fail " + ex.toString());
		}
	}    
}
