//write a program to print prime number by reading its position

import java.util.Scanner;
class Pgm78
{	
   public static void main(String[] args)
     {
	Scanner sc=new Scanner(System.in);
        System.out.println("enter the position");
        int pos=sc.nextInt(); 
	int pos1=0;
	
	for(int i=2; i<=100; i++)
	  {
		int count=0;
		for(int j=2; j<i; j++)
		{
	   	  if(i%j==0)
	  	     {
			count++;
			break;
	      	     }	
		  
		}
		if(count==0)
		{
		    pos1++;
		}
		if(pos==pos1)
		  {
	    	     System.out.println(i);
	    	     break;
		  }
	  }
	 
     }
}
			