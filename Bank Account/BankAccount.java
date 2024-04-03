/* CS 282 Intermediate Java  Spring 2023
 * Cuyamaca College
 * Jaime  Sanchez + John Nix
 * Lab 1 
 * 
 */

import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) 
	{
		
		Account acct = new Account();
		
		int choice=99;
		
		System.out.println("Welcome to Town Bank\n");
		
		while(choice != 6)
		{
			choice = menu();
			switch(choice) 
			{
				case 1: acct.displayBalance(); break;
				case 2: acct.displayRate(); break;
				case 3: acct.depositMoney(); break;
				case 4: acct.withdrawMoney(); break;
				case 5: acct.projectInterest(); break;
				case 6: System.out.println("!!Thank you and Good Bye!!\n"); break;
			}
		}
	}
	
	public static int menu()
	{
		int choice = 99;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for the Operation you wish to perform:");
		System.out.println("1. Check Balance\n"+
						   "2. Check Current Rate\n"+
				           "3. Deposit to Account\n"+
						   "4. Withdraw from Account\n"+
				           "5. Project Interest Accrual\n"+
						   "6. Exit Program\n");
		
		System.out.println("Enter Choice: ");
		try 
		{
			choice = sc.nextInt();
			while(choice < 1 || choice >6)
			{
				System.out.println("Please enter a valid menu choice: ");
				
				choice = sc.nextInt();
			}
		}
		catch(java.util.InputMismatchException e)
		{
			System.out.println("!!Non Integer entered!!");
			sc.next();
			choice=99;
		}
		

		
		System.out.println(); //prints blank line
		return choice;
	}


}