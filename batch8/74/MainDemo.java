
class MainDemo
{
	static boolean b=true;
	static char ch='R';
	public static void fly()
	{
		System.out.println("Fly method void type");
		//System.out.println(b);
	}
	public static double test()
	{
		System.out.println("Test method double type");
		//System.out.println(ch);
		return 4.5;
	}
	public static void main(String [] args)
	{
		System.out.println("==============Main Starts================");
		System.out.println(Demo.display());
		System.out.println(Demo.i);
		System.out.println(Demo.d);
		System.out.println(Demo.wish());
		fly();
		System.out.println(test());
		System.out.println(ch);
		System.out.println(b);
		System.out.println("==============Main Ends================");
	}
}