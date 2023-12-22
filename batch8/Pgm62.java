// write a program to print the factor of the numbers from 5 to 15


class Pgm62
{
   public static void main(String[] args)
     {
	for(int n=5; n<=15; n++)
	{
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
}