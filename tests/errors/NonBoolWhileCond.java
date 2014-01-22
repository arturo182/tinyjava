class NonBoolWhileCond
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
		while(1 + 2)
			System.out.println(1);
		
		return 0;
	}
}
