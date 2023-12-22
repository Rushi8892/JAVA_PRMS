//write a program to print product of the digit of the given number 

import java.util.Scanner;
class Pgm53
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n :");
	int n=sc.nextInt();
	int temp=n;
	int product=1;
	int rem=0;
	for(int i=1; i<=n; i++)
	{
	   rem = n % 10 ;
	   product = product * rem ;
	   n = n / 10;
	}
	System.out.println("The product of digit of the given number " +temp+ " is : "+product);
    }
}