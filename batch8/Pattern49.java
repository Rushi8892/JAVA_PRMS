import java.util.Scanner;
class Pattern49
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
	   char ch='e';
	   for(int j=1; j<=col; j++)
	   {
	    
	    if(i<=j )
	      {
		
		System.out.print( ch-- +" ");
		
	      }
	    else 
	     {
		System.out.print("  " );
	   }
	}
	System.out.println();
     }
   }
}