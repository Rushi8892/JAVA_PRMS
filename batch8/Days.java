import java.util.Scanner;
class Days
{
    public static void main(String[] args)
    {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a day number");
	int day=sc.nextInt();
	switch(day)
	{
	  case 1 : System.out.println("Monday");
	  break;
	  case 2 : System.out.println("Tueday");
	  break;
	  case 3 : System.out.println("Wednesday");
	  break;
	  case 4 : System.out.println("Thursday");
	  break;
	  case 5 : System.out.println("Friday");
	  break;
	  case 6 : System.out.println("Saturday");
	  break;
	  case 7 : System.out.println("sonday");
	  break;
	  default : System.out.println("Enter a valid day number");
	}
   }
}