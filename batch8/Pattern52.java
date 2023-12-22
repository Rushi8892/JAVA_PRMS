import java.util.Scanner;
class Pattern52
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the col");
	int col=sc.nextInt();
	char ch='a';
	int a=1; 
	for(int i=1; i<=row; i++)
	{
	  
	   for(int j=1; j<=col; j++)
	   {
	    
	    if(i>=j )
	      {
		if(j%2==0)
		   {
		
		   System.out.print( a++ +" ");
		
	           }
	       else  {
		   System.out.print( ch++ +" "  );
	          }
	      }
	}
	System.out.println();
     }
   }
}