// write a program to print the factor of the given number


import java.util.Scanner;
class Pgm60
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.println("The factor of number "+n+" is : ");
	for(int i=1; i<=n; i++)
	{
	   if(n%i==0)
	   {
	      System.out.println(i);
	   }
	}
    }
}