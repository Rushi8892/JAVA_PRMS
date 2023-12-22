import java.util.Scanner;
class Count
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of m : ");
	int m=sc.nextInt();	
	System.out.println("Enter the value of n : ");
	int n=sc.nextInt();
	int even_count=0;
	int odd_count=0;
	for (int i=m; i<=n; i++)
	{
	    if(i%2==0)
	    {
		even_count++;
	    }
	    else 
	    {
		odd_count++; 
	    }
	} 
	System.out.println("The even number from "+m+" to " +n+ " is "+even_count);
	System.out.println("The odd number from "+m+" to " +n+ " is "+odd_count);
   }
}