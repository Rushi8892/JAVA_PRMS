//write a program to print qoetient of the number p & q without using division and modulus operator

import java.util.Scanner;
class Pgm41
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of p :");
	int p=sc.nextInt();
	System.out.println("Enter the value of q :");
	int q=sc.nextInt();
	int count=0;
	while(p>=q)
	{
	   p=p-q;
	   count++;
	}
	System.out.println(count);
    }
}