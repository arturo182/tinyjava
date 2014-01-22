class NonArrayArrayAccess
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
		Test test;
		
		test[2] = 1;
		
		return 0;
	}
}
