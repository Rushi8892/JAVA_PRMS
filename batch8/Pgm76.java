//write a program to count prime number from 1 to 1000


class Pgm76
{
	
   public static void main(String[] args)
     {
	 int num=0;
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
		    num++;
		} 
	  }
	System.out.println(num);
	
     }
}
			