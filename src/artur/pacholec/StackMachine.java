package artur.pacholec;

import artur.pacholec.bytecode.ClassFile;
import artur.pacholec.bytecode.Instruction;
import artur.pacholec.bytecode.Method;
import java.util.Stack;

class StackMachine 
{
	MethodActivation currentActivation;
	Stack<MethodActivation> activationStack;	
	ClassFile classFile;
	Stack<Integer> dataStack;
	
	public StackMachine(ClassFile classFile)
	{
		this.activationStack = new Stack<>();
		this.currentActivation = null;
		this.classFile = classFile;
		this.dataStack = new Stack<>();
	}

	public void start(String mainClass)
	{
		currentActivation = new MethodActivation(classFile.getMethod(Method.qualifiedName(mainClass, "main")));
		
		Instruction instruction;
		Object argument;
		do {
			instruction = currentActivation.nextInstruction();
			argument = instruction.getArgument();
			
			//System.out.println("-- " + instruction.getCode() + " " + argument);
			
			switch(instruction.getCode()) {					
				case IntLoad:
				{
					dataStack.push(currentActivation.getVariable((int)argument));
				}
				break;
					
				case IntConst:
				{
					dataStack.push((int)argument);
				}
				break;
					
				case IntStore:
				{
					currentActivation.setVariable((int)argument, dataStack.pop());
				}
				break;
					
				case IntAdd:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push(v1 + v2);
				}
				break;
					
				case IntMul:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push(v1 * v2);
				}
				break;
					
				case IntSub:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push(v2 - v1);
				}
				break;
					
				case IntLess:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push((v2 < v1) ? 1 : 0);
				}
				break;
					
				case IntAnd:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push((v1 * v2 == 0) ? 0 : 1);
				}
				break;
					
				case IntOr:
				{
					int v1 = dataStack.pop();
					int v2 = dataStack.pop();
					
					dataStack.push((v1 + v2 == 0) ? 0 : 1);
				}
				break;
					
				case IntNot:
				{
					dataStack.push((dataStack.pop() == 0) ? 1 : 0);
				}
				break;
					
				case Goto:
				{
					currentActivation.setProgramCounter((int)argument);
				}
				break;
					
				case IfFalse:
				{
					if(dataStack.pop() == 0)
						currentActivation.setProgramCounter((int)argument);
				}
				break;
					
				case InvokeVirtual:
				{
					activationStack.push(currentActivation);
					currentActivation = new MethodActivation(classFile.getMethod((String)argument));
				}
				break;
					
				case IntReturn:
				{
					currentActivation = activationStack.pop();
				}
				break;
					
				case Print:
				{
					System.out.println(dataStack.pop());
				}
				break;
					
				case Stop:
				{
					System.out.println("Execution succesful.");
				}
				break;
					
				default:
					throw new AssertionError(instruction.getCode().name());					
			}
			
			//System.out.println(dataStack + " - " + currentActivation.getVariableValues());
		} while(instruction.getCode() != Instruction.InstructionCode.Stop);
	}
}
