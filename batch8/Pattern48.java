import java.util.Scanner;
class Pattern48
{
  public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the col");
	int col=sc.nextInt();
	int a=1;
	
	for(int i=1; i<=row; i++)
	{
	   char ch='a';
	   for(int j=1; j<=col; j++)
	   {
	    
	    if(i+j>row)
	      {
		System.out.print( ch++ + "  ");
		if(a>9){
			ch=1;
		}
	      }
	    
	   }
	System.out.println();
     }
   }
}