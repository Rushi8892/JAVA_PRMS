import java.util.Scanner;
class Pattern56
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	int space=row-1;
	int star=1;
	for(int i=1; i<=row; i++)
	{
	  
	   for(int j=1; j<=space; j++)
	   {
	    System.out.print("  ");
	   }
	     for(int k=1; k<=star; k++)
	      {  
		System.out.print("* ");
	      }
	   System.out.println();
	   space--;
	   star=star+2;
	}
	row=row-1;
	space=1;
	star=2*row-1;
	for(int i=1; i<=row; i++)
	{
	  
	   for(int j=1; j<=space; j++)
	   {
	    System.out.print("  ");
	   }
	     for(int k=1; k<=star; k++)
	      {  
		System.out.print("* ");
	      }
	   System.out.println();
	   space++;
	   star=star-2;
	}
   }
}