//write a program to print remainder of the number when p & q without using modulus operator

import java.util.Scanner;
class Pgm38
{
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of p :");
	int p=sc.nextInt();
	System.out.println("Enter the value of q :");
	int q=sc.nextInt();
	while(p>=q)
	{
	   p=p-q;
	}
	System.out.println(p);
    }
}