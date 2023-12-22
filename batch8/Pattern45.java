import java.util.Scanner;
class Pattern45
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the col");
	int col=sc.nextInt();
	int a=1;
	char ch='a';
	for(int i=1; i<=row; i++)
	{
	   
	   for(int j=1; j<=col; j++)
	   {
	    if(j==1 || j==col ||i==1 ||i==row)
	      {
		System.out.print( ch++ + "  ");
	      }
	    else
	      {
		System.out.print( a++ + "  ");
	      }
	   }
	System.out.println();
     }
   }
}