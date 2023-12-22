//write a program to print sum of the number from 1 to n

import java.util.Scanner;
class Pgm51
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n :");
	int n=sc.nextInt();
	int sum=0;
	for(int i=1; i<=n; i++)
	{
	   sum = sum+i;
	}
	System.out.println("The sum of numbers from 1 to " +n+ " is : "+sum);
    }
}