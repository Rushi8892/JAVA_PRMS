//Neon Number from 1 to 100

class Pgm70
{
   public static void main(String[] args)
      {
	  System.out.println("Neon numbers from 1 to 100 are ");
	  for(int i=1; i<=100; i++)
	     {
		int sum=0;
		int sqr=i*i;
		while(sqr>0)
		{
	   	  int rem=sqr%10;
	  	  sum=sum+rem;
	   	  sqr=sqr/10;
		}
		if(i==sum)
		{
		    System.out.println(i);
		}
	
	     }	
      }
}