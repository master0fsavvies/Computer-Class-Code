import java.util.Scanner;

public class Account 
{
	private double balance;			// Declarations
	private double rate;
	private double amount;
	private double APR;
	private int time;
	static Scanner sc = new Scanner(System.in);
	public Account()
	{
		balance = 100.00;
		rate = 0.03;
	}
	
	public void displayBalance()
	{
		String output = "The balance is %.2f\n\n";
		output = String.format(output, balance);
		System.out.println(output);
	}
	
	public void displayRate()
	{
		String output = "The rate is %.2f\n\n";
		output = String.format(output, rate);
		System.out.println(output);
	}
	
	public void depositMoney()
	{
		System.out.println("How much will be deposited? >> ");
		try 
		{
			amount = sc.nextDouble();
			while(amount < 0 )										// Remove negatives //
			{
				System.out.println("Please enter a valid number >> ");
				
				amount = sc.nextDouble();
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("!!Non Double entered!!");			// Remove non doubles //
			sc.next();
			amount = 0;
		}
		this.balance = balance + amount;
		displayBalance();
	}
	
	public void withdrawMoney()
	{
		System.out.println("How much will be withdrawn? >> ");
		try 
		{
			amount = sc.nextDouble();								
			while(amount < 0)											// Remove negatives //
			{		
				System.out.println("Please enter a valid number >> ");
				
				amount = sc.nextDouble();
			}
		}
		catch(java.util.InputMismatchException e)						// Remove non doubles //
		{
			System.out.println("!!Non Double entered!!");
			sc.next();
			amount = 0;
		}
		if (balance - amount < 0) 									// Throw out negative balance //
		{
			amount = 0;
			System.out.println("!!Cannot enter into a negative balance!!\n");
		}
		else 
		{
			this.balance = balance - amount;
			displayBalance();
		}
	}
	
	public void projectInterest() 
	{
		APR = 0.05;													// APR set here //
		System.out.println("Current APR >> " + APR + "\n");
		System.out.println("How many months will pass? >> ");
		try 
		{
			time = sc.nextInt();
			while(time < 0 )										// no negative months //
			{
				System.out.println("Please enter a valid number >> ");
				
				time = sc.nextInt();
			}
		}
		catch(java.util.InputMismatchException e)					// no non ints //
		{
			System.out.println("!!Non Double entered!!");
			sc.next();
			time = 0;
		}
		this.balance = (balance * APR * time / 12) + balance;
		displayBalance();
	}
}