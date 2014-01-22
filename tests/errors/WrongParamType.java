class WrongParamType
{
    public static void main(String[] a)
    {
		System.out.println(new Test().exec(1, 2));
    }
}

class Test
{
	public int exec(int a, boolean b)
	{
		return a;
	}
}