import java.util.Scanner;
class Student
  {
    public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student marks");
	int marks=sc.nextInt();
	if (marks>=91)
	{
	  System.out.println("Outstanding");
	}
	else if (marks>=81)
	{
	  System.out.println("Excellent");
	}
	else if (marks>=71)
	{
	  System.out.println("Very Good");
	}
	else if (marks>=61)
	{
	  System.out.println("Good");
	}
	else if (marks>=51)
	{
	  System.out.println("Average");
	}
	else if (marks>=41)
	{
	  System.out.println("Legend");
	}
	else 
	{
	  System.out.println("Ultra pro max");
	}
     }
  }	