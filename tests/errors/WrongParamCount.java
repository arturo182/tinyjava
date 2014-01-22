class WrongParamCount
{
    public static void main(String[] a)
    {
		System.out.println(new Test().exec(1, 2, 3));
    }
}

class Test
{
	public int exec(int a, int b)
	{
		return a + b;
	}
}