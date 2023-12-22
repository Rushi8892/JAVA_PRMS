import java.util.Scanner;
class Loop
{
   public static void main(String[] args)
   {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of m : ");
	int m=sc.nextInt();	
	System.out.println("Enter the value of n : ");
	int n=sc.nextInt();
	int i=m;
	do
	{
	   if(i%3==0 && i%5==0)
	   {
		System.out.println(i++);
	   }
		i++;
	}while(i<=n);  
   }
}