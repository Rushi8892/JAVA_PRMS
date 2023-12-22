//write a program to print qoetient and modulus of the two number without using modulus or division operator

import java.util.Scanner;
class Pgm43
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
	System.out.println("modulus of two number is : "+ p);
	System.out.println("qoetient of two number is : "+ count );
    }
}