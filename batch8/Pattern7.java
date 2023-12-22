import java.util.Scanner;
class Pattern7
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the col");
	int col=sc.nextInt();
	for(int i=1; i<=row; i++)
	{
	   for(int j=1; j<=col; j++)
	   {
	      if(i==1 && j==row)  
	      {
		System.out.print("  *  ");
	      }
		if(i==2 && j==row-1)  
	      {
		System.out.print("  *  ");
	      }
		if(i==3 && j==row-2)  
	      {
		System.out.print("  *  ");
	      }
		if(i==4 && j==row-3)  
	      {
		System.out.print("  *  ");
	      }
		else
		{
		 System.out.print("   ");
		}	
	   }
	 System.out.println();
     }
   }
}