//write a program to check wether given number id armstrong number or not

import java.util.Scanner;
class Pgm71
{
   public static void main(String[] args)
     {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to check");
	int n=sc.nextInt();
	int temp=n;
	int count=0;
	int sum=0;
	int temp2=n;
	while(n>0)
	{
	count++;
	n=n/10;
	}

	while(temp>0)
	{
	   int prod=1;
	   int rem = temp%10;
	   for(int i=1; i<=count; i++)
	      {
		  prod=prod*rem;
	      }
	   temp=temp/10;
	   sum=sum+prod;
	}
	if(temp2==sum)
	{
	   System.out.println("The given number "+temp2+" is a Armstrong number");
	}
	else
	{
	   System.out.println("The given number "+temp2+" is not a Armstrong number");
	}
     }
}
			