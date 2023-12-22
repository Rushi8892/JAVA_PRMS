//Neon Number

import java.util.Scanner;
class Pgm69
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int sum=0;
	int sqr=n*n;
	while(sqr>0)
	{
	   int rem=sqr%10;
	   sum=sum+rem;
	   sqr=sqr/10;
	}
	if(n==sum)
	{
	    System.out.println(n+" is Neon number");
	}
	else 
	{
	    System.out.println(n+" is not a Neon number");
	}
      }
}