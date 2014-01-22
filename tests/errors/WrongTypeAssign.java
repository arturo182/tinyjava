class WrongTypeAssign
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
		int a;
		
		a = this;
		
		return 0;
	}
}
