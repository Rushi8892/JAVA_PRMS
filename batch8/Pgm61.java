//write program to print the sum of given number sum should be greater than 26 and print the character of that number

import java.util.Scanner;
class Pgm61
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum=0;
	char ch='A';
	while(n>0)
	{
	   int rem=n%10;
	   sum=sum+rem;
	   n = n/10;
	}
	if(sum>26)
	{
	    int n1=sum;
	    sum=0;
	    while(n1>0)
	    {
	       int rem=n1%10;
	       sum=sum+rem;
	       n1 = n1/10; 
	    }
	}
	for(int i=1; i<=sum; i++)
	{
	    if(i==sum)
	    {
		System.out.println(ch);
		
	    }
	ch++;	
	}
    }
}
