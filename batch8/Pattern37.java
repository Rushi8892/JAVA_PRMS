import java.util.Scanner;
class Pattern37
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
	      if(  i==1 || j==(col+1)/2  || i==row && j<=(col+1)/2 || j==1 && i>=(row+1)/2)  
	      {
		System.out.print(" *  ");
	      }
		
		else
		{
		 System.out.print("    ");
		}	
	   }
	System.out.println();
     }
   }
}