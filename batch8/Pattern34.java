import java.util.Scanner;
class Pattern34
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
	      if( i==1 && j!=1 &&j!=row || i==row && j!=row && j!=1 || j==1 && i!=1 && i!=col || j==col && i!=col && i!=1 )  
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


// j==1 && i!=1  || i==1 && j!=1 && i!=row  || j==col && i!=col || i==row && j!=col