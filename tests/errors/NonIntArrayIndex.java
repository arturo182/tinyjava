class NonIntArrayIndex
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
		int[] a;
		
		a = new int[5];
		a[false] = 1;
		
		return 0;
	}
}
