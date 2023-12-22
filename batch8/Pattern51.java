import java.util.Scanner;
class Pattern51
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
	  char ch='a';
	  int a=1;
	   for(int j=1; j<=col; j++)
	   {
	    
	    if(i>=j )
	      {
		if(i%2==0)
		   {
		
		   System.out.print( ch++ +" ");
		
	           }
	       else  {
		   System.out.print( a++ +" "  );
	          }
	      }
	}
	System.out.println();
     }
   }
}