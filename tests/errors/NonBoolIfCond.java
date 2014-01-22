class NonBoolIfCond
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
		if(1 + 2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
		return 0;
	}
}
