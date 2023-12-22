//write a program to check wether given number is strong number or not

import java.util.Scanner;
class Pgm72
{
   public static void main(String[] args)
     {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number to check");
	int n=sc.nextInt();
	int sum=0;
	int temp=n;
	while(n>0)
	{
	   int fact=1;
	   int rem=n%10;
	   for(int i=1; i<=rem; i++)
	     {
		fact=fact*i;
	     }
	   sum=sum+fact;
	   n=n/10;
	}
	
	if(temp==sum)
	{
	   System.out.println("The given number "+temp+" is a strong number");
	}
	else
	{
	   System.out.println("The given number "+temp+" is not a strong number");
	}
     }
}
			