import java.util.Scanner;
class Pattern53
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the col");
	int col=sc.nextInt();
	int a=0; 
	for(int i=1; i<=row; i++)
	{
	   a=a+i;
	   int k=a;
	   for(int j=1; j<=col; j++)
	   {
	    if(i>=j)
	      {  
		System.out.print( k-- +"  ");
	      }
	    else  
	      {
		System.out.print( "   "  );
	      }
	   }
	System.out.println();
     }
   }
}