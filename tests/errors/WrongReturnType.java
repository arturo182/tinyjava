class WrongReturnType
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
		return false;
	}
}