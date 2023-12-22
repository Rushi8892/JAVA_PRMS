//write a program to print multiplication of the number a & b without using * operator

import java.util.Scanner;
class Pgm40
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a=sc.nextInt();
	System.out.println("Enter the value of b :");
	int b=sc.nextInt();
	int result=0;
	for(int i=1; i<=b; i++)
	{
	   result=result+a;
	}
	System.out.println(result);
    }
}