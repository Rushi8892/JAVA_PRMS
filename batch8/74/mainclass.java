import java.util.Scanner;
class Wallet
{
	int emoney;
	Wallet(int emoney)
	{
		this.emoney = emoney;
		
	}
	public void emoney()
	{
		System.out.println(" Total Wallet balance is "+emoney);
	}
	public void topupwallet(int addmoney)
	{
		emoney = emoney + addmoney;
	}
	public void shopping(int deduct)
	{
		emoney = emoney - deduct;
		System.out.println(" Remaining wallet balance is : "+emoney);
	}

}
class Ewallet extends Wallet
{
	Ewallet()
	{
		super(8000);
	}
	public void ewallet()
	{
		Scanner sc = new Scanner(System.in);	
		emoney();
		System.out.print(" Add more money to the wallet : ");
		int addmoney = sc.nextInt();
		topupwallet(addmoney);
		System.out.print(" Purchased the items of : ");
		int deduct= sc.nextInt();
		shopping(deduct);
	}
}
class Mainclass
{
	public static void main(String [] args)
	{
		Ewallet ref = new Ewallet();
		ref.ewallet();
	}
}