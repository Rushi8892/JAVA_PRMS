import java.util.Scanner;
class Pattern43
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
	    if(i==j)
	      {
		System.out.print( a++ + "  ");
	      }
	    else
	      {
		System.out.print( ch++ + "  ");
	      }
	   }
	System.out.println();
     }
   }
}