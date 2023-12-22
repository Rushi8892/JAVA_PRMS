
import java.util.Scanner;

class Register
{
    String fname;
    String lname;
    String phno;
    String gender;
    
    int check=0;
	Register(){ }
    Register(String fname,String lname,String phno,String gender)
    {
        this.fname=fname;
        this.lname=lname;
        this.phno=phno;
        this.gender=gender;
    }
    public void check(String fname,String lname,String phno,String gender)
    {
	 Register r=new Register();
    	 System.out.println("=================================");
    	 if(fname.equals(""))
    	 {
    		 System.out.println("First name is mandatory");
    		 check=1;
    	 }
    	 if(lname.equals(""))
    	 {
    		 System.out.println("Last name is mandatory");
    		 check=1;
    	 }
    	 if(phno.equals(""))
    	 {
    		 System.out.println("Phone number is mandatory");
    		 check=1;
    	 }
    	 if(gender.equals(""))
    	 {
    		 System.out.println("Gender is mandatory");
    		 check=1;
    	 }
    }
    public void display()
    {
    	if(check==0)
    	{
    		System.out.println("Firstname : "+fname);
            System.out.println("Lastname : "+lname);
            System.out.println("Phone number : "+phno);
            System.out.println("Gender : "+gender);
    	}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String fname=sc.nextLine();
        System.out.println("Enter last name");
        String lname=sc.nextLine();
        System.out.println("Enter phone number");
        String phno=sc.nextLine();
        System.out.println("Enter your gender");
        String gender=sc.nextLine();
        
        Register rg=new Register(fname,lname,phno,gender);
        
        rg.check(fname,lname,phno,gender);
        
        System.out.println("======================================");
        
        rg.display();
        
    }
    
}