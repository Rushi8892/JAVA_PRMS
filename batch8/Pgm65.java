//write a program to check the given number is perfect square or not

import java.util.Scanner;
class Pgm65
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	int count=0;
	for(int i=1; i<n; i++)
	{
	   if(i*i==n)
	     {
		count++;
	     	break;
	     }
	}
	if(count>0)
	{
	   System.out.println(n+" number is perfect square");
	}
	else
	{
	   System.out.println(n+" number is not a perfect square");
	}
     }
}