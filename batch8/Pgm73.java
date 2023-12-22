//write a program to check wether given number is prime number or not

import java.util.Scanner;
class Pgm73
{
   public static void main(String[] args)
     {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to check");
	int n=sc.nextInt();
	int count=0;
	for(int i=2; i<n; i++)
	{
	   if(n%i==0)
	     {
		count++;
		break;
	     }	
	}
	if(count>0)
	{
	   System.out.println("The given number "+n+" is not a prime number");
	}
	else
	{
	   System.out.println("The given number "+n+" is a prime number");
	}
     }
}
			