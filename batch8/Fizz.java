kimport java.util.Scanner;
class Fizz
  {
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n");
	int n=sc.nextInt();
	if (n%3==0 && n%5==0)
	{
	  System.out.println("Fizz-Buzz");
	}
	else if (n%3==0)
	{
	  System.out.println("Fizz");
	}
	else if (n%5==0)
	{
	  System.out.println("Buzz");
	}
	
	else 
	{
	  System.out.println("No Fizz - No Buzz");
	}
	
     }
  }	