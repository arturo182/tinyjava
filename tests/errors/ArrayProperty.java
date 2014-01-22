class ArrayProperty
{
    public static void main(String[] a)
    {
		System.out.println(new Test().exec());
    }
}

class Test
{
	public int exec()
	{
		int[] x;
		
		x = new int[2];
		
		System.out.println(x.test);
		
		return 0;
	}
}