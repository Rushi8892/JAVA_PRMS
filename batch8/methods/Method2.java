//WAP by passing char type of data to user defined method and method should return char value
//1.print the passing value
//2.print the returning value



class Method2
{
	public static char test(char ch)
	{
		System.out.println("test method");
		return 'r';
	}
	public static void main(String []args)
	{
		System.out.println("Main start");
		test('a');
		System.out.println(test('a'));
		System.out.println("Main ends");
	}

}