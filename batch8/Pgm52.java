//write a program to print product of the number from 1 to n

import java.util.Scanner;
class Pgm52
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n :");
	int n=sc.nextInt();
	int product=1;
	for(int i=1; i<=n; i++)
	{
	   product = product * i;
	}
	System.out.println("The product of numbers from 1 to " +n+ " is : "+product);
    }
}