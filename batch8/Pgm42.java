//write a program to print multiplication table without using modulus operator

import java.util.Scanner;
class Pgm42
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number who's table you want :");
	int a=sc.nextInt();
	int time=10;
	int result=0;
	for(int i=1; i<=time; i++)
	{
	   result=result+a;
	   System.out.println(a + " * " +i+ " = " + result);
	}
	
    }
}