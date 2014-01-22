class MultipleClassDecl
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
}

class Test
{
	public int f() 
	{ 
		return 0;
	}
}
