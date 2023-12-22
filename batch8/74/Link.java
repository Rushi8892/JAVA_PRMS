import java.util.Scanner;
class Browser
{
    String name;
    public void Open()
    {
      	System.out.println(" Opening with default System Browser. ");
    }   
}
class Chrome extends Browser
{
    @Override
    public void Open()
    {
        System.out.println(" Opening with Chrome Browser. ");
    }
   
}
class FireFox extends Browser
{
    @Override
    public void Open()
    {
      	System.out.println(" Opening with FireFox Browser. ");
    }
}
class MicrosoftEdge extends Browser
{
    @Override
    public void Open()
    {
      	System.out.println(" Opening with Microsoft Edge Browser. ");
    }
}
class Link
{
    public Browser start(String name)
    {        
        if(name.equals("Browser"))
        	return new Browser();
        else if(name.equals("Chrome"))
        	return new Chrome();
        else if(name.equals("FireFox"))
        	return new FireFox();
	else if(name.equals("MicrosoftEdge"))
        	return new MicrosoftEdge();
        else
        	return null;
    }   
      public static void main(String[] args)
   {
        Link ref = new Link();
        Scanner sc = new Scanner(System.in);

        System.out.println(" Open with :");
        System.out.println(" 1. Default Browser");
        System.out.println(" 2. Chrome ");
	System.out.println(" 3. Firefox");
	System.out.println(" 4. Microsoft Edge ");

	System.out.print(" Enter your choice :");
	int ch = sc.nextInt();
        Browser b = new Browser();
	switch(ch)
	{
		case 1 : b.name = "Browser";			 
			 break;
		case 2 : b.name = "Chrome";			 
			 break;
		case 3 : b.name = "FireFox";
			 break;
		case 4 : b.name = "MicrosoftEdge";			 
			 break;
		default :System.out.println(" Invalid choice");
	}

	Browser b1=ref.start(b.name);
	b1.Open();
    }
}