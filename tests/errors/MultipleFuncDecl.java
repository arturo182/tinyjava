class MultipleFuncDecl
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
		return 0;
	}
	
	public boolean exec()
	{
		return true;
	}
}
