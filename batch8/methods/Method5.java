
//5 WAP by declairing
//1st user defined method pass the 2 double value and it should return String value
//2nd user defined method passing 1 int value and boolean value it shouldn't return any value

class Method5
{
	public static String test(double a,double b)
	{
		System.out.println("test method");
		return "str";
	}
	public static void test2(int c)
	{
		System.out.println("test method 2");
		return ;
	}
	public static void main(String []args)
	{
		System.out.println("Main start");
		System.out.println(test (2,4));
		test2(1);
		
	}

}