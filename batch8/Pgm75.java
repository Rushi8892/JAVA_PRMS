//write a program to print strong numbersfrom 1 to 1000
import java.util.Scanner;
class Pgm75
{
   public static void main(String[] args)
     {
	
	for(int n=1; n<=1000; n++)
	{
		int sum=0;
		int temp=n;
		while(temp>0)
		{
	   	int fact=1;
	   	int rem=temp%10;
	   	for(int i=1; i<=rem; i++)
	     	{
			fact=fact*i;
			
	     	}
	   	sum=sum+fact;
	   	temp=temp/10;
		}
	
		if(n==sum)
		{
	   	System.out.println(sum);
		}
	}
		
	
     }
}
			