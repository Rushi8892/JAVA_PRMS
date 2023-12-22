//WAP by passing 2 primitive value and 1 non-primitive value to user defined method and method should return primitive value




class Method3
{
	public static int test(int a, double b,String c)
	{
		System.out.println("test method");
		System.out.println(b);
		return 100;
	}
	public static void main(String []args)
	{
		System.out.println("Main start");
		test (1,4,"java");
		System.out.println(test(100,5.2,"java"));
		
	}

}