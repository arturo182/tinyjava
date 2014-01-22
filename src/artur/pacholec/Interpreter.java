package artur.pacholec;

import artur.pacholec.bytecode.ClassFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Interpreter 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		if(args.length == 0) {
			System.out.println("Usage: java -jar 4dv006.artur.pacholec.interpreter.jar \"file_to_process.tjc\"");
			return;
		}
		
        String classFileName = args[0];
		if(!new File(classFileName).exists()) {
			System.err.println("File \"" + classFileName + "\" not found.");
			return;
		}
				
		System.out.println("Processing \"" + classFileName + "\"...\n");
		
		ClassFile classFile = new ClassFile();
				
		try {			
			FileInputStream fileIn = new FileInputStream(classFileName);
			
			ObjectInputStream in = new ObjectInputStream(fileIn);
			classFile.loadFromStream(in);
			in.close();
			
			fileIn.close();
		} catch(IOException ex){
			System.out.println("Fail " + ex.toString());
		}
		
		if(classFile.hasErrors())
			return;
		
		classFile.print();
		
		String className = new File(classFileName).getName().replace(".tjc", "");
		System.out.println("Starting execution of " + className + ".main:");
		
		StackMachine stackMachine = new StackMachine(classFile);
		stackMachine.start(className);
	}
}
