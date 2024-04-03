/*
      CS282-1913 – Spring 2023
               Lab 5 - DMV Line

               John Nix

               3/10/2023

               At service office, like the DMV, there is a need to sign in to a waiting list. 
               For this Lab, you need to create a waiting list program. 
               The program should have an interactive menu that allows you to add an individual to the list,  
               check who is next on the list and remove the next person once they are helped. 

				For implementation a Queue container should be used. The interactive menu should have at least 4 options:

				Add a person.
				check who is next.
				Assist next person (and remove from list)
				exit.

         */
import java.util.*;
public class DMV {
	public static void main(String[] args) {
		int choice=99;
		Queue q1 = new Queue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the DMV!\n");
		while(choice != 4)
		{
			choice = menu();
			switch(choice) 
			{
				case 1: 
						if(q1.isFull()) 
							System.out.println("The line is currently full.\n");
						else {
							System.out.println("Enter the name of the person you "+
									   "would like to add to the line:");
							String x = sc.nextLine();
							q1.enqueue(x);
							System.out.println(x + " has been added to the list.\n");
						}
					break;
				case 2: 
					if(q1.isEmpty())
						System.out.println("The line is empty.\n");
					else
						System.out.println("The next person in line is: " + q1.checkNext() + "\n"); 
					break;
				case 3: 
					if(q1.isEmpty())
						System.out.println("The line is empty.\n");
					else
						System.out.println("The next person helped is: " + q1.dequeue()); 
					break;
				case 4:  System.out.println("!!Thank you and Good Bye!!\n"); break;
			}
		}
		sc.close();
	}
	public static int menu()
	{
		int choice = 99;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the Operation you wish to perform:");
		System.out.println("1. Add a person\n"+
						   "2. Check who is next\n"+
				           "3. Assist next person (and remove from list)\n"+
						   "4. Exit\n");
		System.out.println("Enter Choice: ");
		try 
		{
			choice = sc.nextInt();
			while(choice < 1 || choice > 4)
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
