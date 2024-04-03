/*
      CS282-1913 – Spring 2023
               Lab 6 - Phone Book

               John Nix

               4/8/23

               A phone book which can store individual's first and last names, addresses, and phone numbers.

         */
import java.util.*;

public class Lab6Demo {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int choice = 99;
        int choice2 = 99;
        Contact newC = new Contact("WALTER", "WHITE", "308 NEGRA ARROYO LANE", "555-123-4567");
        ab.addItem(newC);
        newC = new Contact("HOLLY", "WHITE", "308 NEGRA ARROYO LANE", "555-123-4567");
        ab.addItem(newC);
        ab.printContacts();		//INITIALIZED ITEMS
        while(choice != 6)
        {
            choice = menu();
            switch(choice) 
            {
                case 1: //(ADD CONTACT)
                    System.out.println("Enter the following: ");
                    System.out.println("First name: ");
                    String Fname = sc.nextLine().toUpperCase();
                    System.out.println("Last name: ");
                    String Lname = sc.nextLine().toUpperCase();
                    System.out.println("Address: ");
                    String addr = sc.nextLine().toUpperCase();
                    System.out.println("Phone Number: ");
                    String Pnum = sc.nextLine().toUpperCase();
                    newC = new Contact(Fname, Lname, addr, Pnum);
                    ab.addItem(newC);
                    System.out.println("Contact added!\n");
                    System.out.println("First name: " + newC.getFirstName());
                    System.out.println("Last name: " + newC.getLastName());
                    System.out.println("Address: " + newC.getAddress());
                    System.out.println("Phone number: " + newC.getPhoneNumber());
                    System.out.println(); // print a blank line for formatting
                    break;
                case 2: //FIND CONTACT
                	System.out.println("Enter the last name of the contact you are looking for: ");
                	String Lname2 = sc.nextLine().toUpperCase();
                    if(ab.hasMultipleContacts(Lname2, ab)) {
                        System.out.println("There is more than one contact that share that last name.\n"+
                                            "Enter the first name of the contact you are looking for:");
                        String Fname2 = sc.nextLine().toUpperCase();
                        if(ab.findContactByFirstName(Fname2, Lname2, ab) == null) {
                            System.out.println("First name's contact not found!");
                        }
                        else {
                            ab.printContact(ab.findContactByFirstName(Fname2, Lname2, ab));
                        }
                    }
                    else if (ab.findContactByLastName(Lname2, ab) == null) {
                    	System.out.println("Contact not found!");
                    }
                    else
                    	ab.printContact(ab.findContactByLastName(Lname2, ab));
                    break;
                case 3: //EDIT CONTACT
                	System.out.println("Enter the last name of the contact you want to edit: ");
                	String Lname4 = sc.nextLine().toUpperCase();
                    if(ab.hasMultipleContacts(Lname4, ab)) {
                        System.out.println("There is more than one contact that share that last name.\n"+
                                            "Enter the first name of the contact you want to edit:");
                        String Fname4 = sc.nextLine().toUpperCase();
                        if(ab.findContactByFirstName(Fname4, Lname4, ab) == null) {
                            System.out.println("First name's contact not found!");
                        }
                        else {
                        	System.out.println("Contact editing: ");
                            ab.printContact(ab.findContactByFirstName(Fname4, Lname4, ab));
                        	System.out.println("Enter the number for the element you want to edit: ");
                        	System.out.println("1. First Name\n"+
                        						"2. Last Name\n"+
                        						"3. Address\n"+
                        						"4. Phone Number");
                        	System.out.println("Enter choice: ");
                        	try 
                            {
                                choice2 = sc.nextInt();
                                while(choice2 < 1 || choice2 > 4)
                                {
                                    System.out.println("Please enter a valid menu choice: ");
                                    
                                    choice2 = sc.nextInt();
                                }
                            }
                            catch(java.util.InputMismatchException e)
                            {
                                System.out.println("!!Non Integer entered!!");
                    			sc.nextLine();
                    			choice2=99;
                    		}
                    		System.out.println(); 
                        	switch(choice2) {
                        	case 1:
                        		System.out.println("Enter what replaces the first name: ");
                        		sc.nextLine();
                        		String Fname5 = sc.nextLine().toUpperCase();
                        		ab.findContactByFirstName(Fname4, Lname4, ab).setFirstName(Fname5);
                        		break;
                        	case 2:
                        		System.out.println("Enter what replaces the last name: ");
                        		sc.nextLine();
                        		String Lname5 = sc.nextLine().toUpperCase();
                        		ab.findContactByFirstName(Fname4, Lname4, ab).setLastName(Lname5);
                        		break;
                        	case 3:
                        		System.out.println("Enter what replaces the address: ");
                        		sc.nextLine();
                        		String addr5 = sc.nextLine().toUpperCase();
                        		ab.findContactByFirstName(Fname4, Lname4, ab).setAddress(addr5);
                        		break;
                        	case 4:
                        		System.out.println("Enter what replaces the phone number: ");
                        		sc.nextLine();
                        		String Pnum5 = sc.nextLine().toUpperCase();
                        		ab.findContactByFirstName(Fname4, Lname4, ab).setPhoneNumber(Pnum5);
                        		break;
                        	}
                        }
                    }
                    else if (ab.findContactByLastName(Lname4, ab) == null) {
                    	System.out.println("Contact not found!");
                    }
                    else
                    	System.out.println("Contact editing: ");
                    	ab.printContact(ab.findContactByLastName(Lname4, ab));
                    	System.out.println("Enter the number for the element you want to edit: ");
                    	System.out.println("1. First Name\n"+
                    						"2. Last Name\n"+
                    						"3. Address\n"+
                    						"4. Phone Number");
                    	System.out.println("Enter choice: ");
                    	try 
                        {
                            choice2 = sc.nextInt();
                            while(choice2 < 1 || choice2 > 4)
                            {
                                System.out.println("Please enter a valid menu choice: ");
                                
                                choice2 = sc.nextInt();
                            }
                        }
                        catch(java.util.InputMismatchException e)
                        {
                            System.out.println("!!Non Integer entered!!");
                			sc.nextLine();
                			choice2=99;
                		}
                		System.out.println(); 
                    	switch(choice2) {
                    	case 1:
                    		System.out.println("Enter what replaces the first name: ");
                    		sc.nextLine();
                    		String Fname5 = sc.nextLine().toUpperCase();
                    		ab.findContactByLastName(Lname4, ab).setFirstName(Fname5);
                    		break;
                    	case 2:
                    		System.out.println("Enter what replaces the last name: ");
                    		sc.nextLine();
                    		String Lname5 = sc.nextLine().toUpperCase();
                    		ab.findContactByLastName(Lname4, ab).setLastName(Lname5);
                    		break;
                    	case 3:
                    		System.out.println("Enter what replaces the address: ");
                    		sc.nextLine();
                    		String addr5 = sc.nextLine().toUpperCase();
                    		ab.findContactByLastName(Lname4, ab).setAddress(addr5);
                    		break;
                    	case 4:
                    		System.out.println("Enter what replaces the phone number: ");
                    		sc.nextLine();
                    		String Pnum5 = sc.nextLine().toUpperCase();
                    		ab.findContactByLastName(Lname4, ab).setPhoneNumber(Pnum5);
                    		break;
                    	}
                    
                    break;
                case 4: //DELETE CONTACT
                	System.out.println("Enter the last name of the contact you want to delete: ");
                    String Lname3 = sc.nextLine().toUpperCase();
                    if(ab.hasMultipleContacts(Lname3, ab)) {
                        System.out.println("There is more than one contact that share that last name.\n"+
                                            "Enter the first name of the contact you want to delete:");
                        String Fname3 = sc.nextLine().toUpperCase();
                        if(ab.findContactByFirstName(Fname3, Lname3, ab) == null) {
                            System.out.println("First name's contact not found!");
                        }
                        else {
                            System.out.println("Contact deleted!");
                            ab.deleteContact(ab.findContactByFirstName(Fname3, Lname3, ab), ab);
                        }
                    }
                    else if (ab.findContactByLastName(Lname3, ab) == null) {
                    	System.out.println("Contact not found!");
                    }
                    else
                    	ab.deleteContact(ab.findContactByLastName(Lname3, ab), ab);
                    	System.out.println("Contact deleted!");
                    break;
                case 5: //DISPLAY CURRENT CONTACT
                	if(ab.getCurrentPos() == null)
                		System.out.println("There is no current contact.");
                	else {
                		System.out.println("This is the current contact:");
                		ab.printContact(ab.getCurrentPos());
                	}
                    break;
                case 6:  System.out.println("!!Thank you and Good Bye!!\n"); break;
            }
        }
        sc.close();
    }
    public static int menu()
    {
        int choice = 99;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number for the Operation you wish to perform:");
        System.out.println("1. Add Contact\n"+
                           "2. Find Contact\n"+
                           "3. Edit Contact\n"+
                           "4. Delete Contact\n"+
                           "5. Display Current Contact\n"+
                           "6. Exit\n");
        System.out.println("Enter Choice: ");
        try 
        {
            choice = sc2.nextInt();
            while(choice < 1 || choice > 6)
            {
                System.out.println("Please enter a valid menu choice: ");
                
                choice = sc2.nextInt();
            }
        }
        catch(java.util.InputMismatchException e)
        {
            System.out.println("!!Non Integer entered!!");
			sc2.next();
			choice=99;
		}
		System.out.println(); 
		return choice;
	}
}
