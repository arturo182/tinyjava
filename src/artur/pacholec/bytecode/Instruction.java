package artur.pacholec.bytecode;

import java.io.Serializable;

public final class Instruction implements Serializable
{
	public enum InstructionCode
	{
		IntLoad,		// Arg: n	Push integer value stored in local variable n.
		IntConst,		// Arg: v	Push integer value v.
		IntStore,		// Arg: n	Pop value v and store it in local variable n.	
		IntAdd,			//			Pop value v1, Pop value v2, Push v2 + v1.
		IntMul,			//			Pop value v1, Pop value v2, Push v2 * v1.
		IntSub,			//			Pop value v1, Pop value v2, Push v2 - v1.
		IntLess,		//			Pop value v1, Pop value v2, Push 1 if v2 < v1 else Push 0.
		IntAnd,			//			Pop value v1, Pop value v2, Push 0 if v1 * v2 = 0 else Push 1.
		IntOr,			//			Pop value v1, Pop value v2, Push 0 if v1 + v2 = 0 else Push 1.
		IntNot,			//			Pop value v, Push 1 if v = 0 else Push 0.
		Goto,			// Arg: i	Jump to instruction i.
		IfFalse,		// Arg: i	Pop value v, if v = 0 jump to instruction i, else continue with next instruction.
		InvokeVirtual,	// Arg: m	Push current activation and switch to the method having qualified name m.
		IntReturn,		//			Pop activation and continue.
		Print,			//			Pop value and print.
		Stop;			//			Execution completed.

		static InstructionCode fromIntValue(int value)
		{
			switch(value) {
				case 0:		return IntLoad;
				case 1:		return IntConst;
				case 2:		return IntStore;
				case 3:		return IntAdd;
				case 4:		return IntMul;
				case 5:		return IntSub;
				case 6:		return IntLess;
				case 7:		return IntAnd;
				case 8:		return IntOr;
				case 9:		return IntNot;
				case 10:	return Goto;
				case 11:	return IfFalse;
				case 12:	return InvokeVirtual;
				case 13:	return IntReturn;
				case 14:	return Print;
			}
			
			return Stop;
		}
		
		public int getIntValue()
		{
			switch(this) {
				case IntLoad:		return 0;
				case IntConst:		return 1;
				case IntStore:		return 2;
				case IntAdd:		return 3;
				case IntMul:		return 4;
				case IntSub:		return 5;
				case IntLess:		return 6;
				case IntAnd:		return 7;
				case IntOr:			return 8;
				case IntNot:		return 9;
				case Goto:			return 10;
				case IfFalse:		return 11;
				case InvokeVirtual:	return 12;
				case IntReturn:		return 13;
				case Print:			return 14;
				case Stop:			return 15;	
			}
			
			return -1;
		}
	}
	
	private InstructionCode code;
	private Object argument;
	
	public Instruction(InstructionCode code, Object argument)
	{
		this.argument = argument;
		this.code = code;
	}
	
	public Instruction(InstructionCode code)
	{
		this(code, null);
	}
	
	public InstructionCode getCode()
	{
		return code;
	}
	
	public Object getArgument()
	{
		return argument;
	}
	public void setArgument(Object argument)
	{
		this.argument = argument;
	}
}
