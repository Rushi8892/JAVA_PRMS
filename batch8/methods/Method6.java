
//5 WAP by passing byte type of data to user defined method


class Method6
{
	public static int test(byte a)
	{
		System.out.println("test method");
		return 1;
	}
	public static void main(String []args)
	{
		System.out.println("Main start");
		byte a=(byte)1;
		test (a);
		System.out.println(test (a));
	}

}