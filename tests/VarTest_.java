class VarTest_
{
    public static void main(String[] a){
		System.out.println(new Class().func());
	}
}

class Inline extends Class { boolean a; int b; int[] c; public boolean Public(int x) { return false; } int[] Private () { return new int[5]; } } 
class f { public int g(int x) { return x; } }

class Class
{
	int func() {
		int[] array;
		int [ ]  array2;
		boolean camelCase;
		boolean bool;	
		int math_result;
		int var182;
		Class x;

		array = new int[6];
		array2 = new  int  [2];
		array[5] = 1;
		
		//a wild line appears!
		array[8] = this.e()[new f().g(3)];

		camelCase=(2 * 1 < 4 && true) || (array[5] < 1);
		camelCase = ((2 * 1) < 4 && true) || false;
		var182 = var182 * -5;//error

		bool = !false;
		bool = !!!!bool;

		math_result = var182 * (var182 + var182) * var182;

		{ math_result; }

		x = this;
		math_result;

		return 0;
	}
	
	int[] e()
	{
		int[] x;
		
		return x;
	}
	
	public boolean func2()
	{
		//confusing as hell
		return false || true && true;
	}
}