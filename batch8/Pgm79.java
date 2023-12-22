//write a program to print perfect square by reading its position

import java.util.Scanner;
class Pgm79
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the position");
	int pos=sc.nextInt();
	int count=0;
	int pos1=0;
	for(int i=1; i<=1000; i++)
	{
	   for(int j=1; j<=i; j++)
	   {
	   if(j*j==i)
	     {
		count++;
	     	break;
	     }
	   }
	 if(count>0)
	   {
		pos1++;
		
	   }
	if(pos*pos==pos1)
	{
	   System.out.println(pos1);
	   break;
	}
     }
   }
}