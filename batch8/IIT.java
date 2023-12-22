import java.util.Scanner;
class IIT
  {
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student marks");
	int marks=sc.nextInt();
	if (marks>=330 && marks<=360)
	{
	  System.out.println("IIT");
	}
	else if (marks>=300 && marks<=329)
	{
	  System.out.println("NIT");
	}
	else if (marks>=250 && marks<=299)
	{
	  System.out.println("IIIT");
	}
	else if (marks<250)
	{
	  System.out.println("Jspiders");
	}
	else 
	{
	  System.out.println("Enter valid marks");
     }
  }	