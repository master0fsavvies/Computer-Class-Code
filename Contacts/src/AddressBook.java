/*
      CS282-1913 – Spring 2023
               Lab 6 - Phone Book

               John Nix

               4/8/23

               A phone book which can store individual's first and last names, addresses, and phone numbers.

         */
public class AddressBook 
{
	private static class  Node
	{
		private Contact contact;
		private Node tail;
		
		public Node(Contact c,Node t)
		{
			contact = c;
			tail = t;	
		}
		
		public Contact getContact()
		{
			return contact;
		}
		
		public Node getTail()
		{
			return tail;
		}
		
		public void setContact(Contact c)
		{
			contact = c;
		}
		
		public void setTail(Node t)
		{
			tail = t;
		}
		
		
	}
	
	private Node head;
	private Node currentPos;
	private int size;
	
	public void LinkedList()
	{
		head=null;
		currentPos=head;
		size = 0;
	}
	
	public boolean isEmpty() 
	{
		return head == null;
	}
	
	public void addItem(Contact c)		//REQUIRED
	{
		
		head = new Node(c,head);
		
		if(currentPos == null)
			currentPos =head;
		size++;
		
		Node temp = new Node(c,head);
		head =temp;
	}
	
	public Contact getCurrentPos()
	{
		return currentPos.getContact();
	}
	
	public void setStart()
	{
		currentPos=head;
	}
	
	public boolean next()//returns false when end of list
	{
		if(isEmpty())
		{
			return false;
		}
		if(currentPos.tail==null)
		{
			return false;
		}
		currentPos=currentPos.tail;
		return true;
		
	}
	
	public Contact deleteAtHead()
	{
		Contact contact;
		if(isEmpty())
			return null;
		
		contact =head.getContact();
		
		if(head.tail == null) //only a head, no other nodes.
			head = null;
		else
		{
			head=head.tail;
		}
		return contact;
	}
	
	
	public Contact deleteCurrentPos()
	{
		Contact contact;
		
		if (currentPos==null)
			return null;
		
		contact = currentPos.getContact();
		
		if(currentPos == head)
			head=currentPos.tail;
		else 
		{
			Node before = head;
			
			while(before.tail != currentPos)
				before=before.tail;
			before.tail = currentPos.tail;
			
		}
		
		return contact;
	}
	public void printContacts() { 		//PRINTS ALL CONTACTS
		if (head == null) {
	        System.out.println("The contact list is empty.");
	        return;
	    }
		Node node = head;
	    while (node != null) {
	        Contact contact = node.getContact();
	        System.out.println("First name: " + contact.getFirstName());
	        System.out.println("Last name: " + contact.getLastName());
	        System.out.println("Address: " + contact.getAddress());
	        System.out.println("Phone number: " + contact.getPhoneNumber());
	        System.out.println(); // print a blank line for formatting
	        node = node.getTail();
	    }
	}
	public void printContact(Contact contact) {			//PRINTS GIVEN CONTACT
	   System.out.println("First name: " + contact.getFirstName());
	   System.out.println("Last name: " + contact.getLastName());
	   System.out.println("Address: " + contact.getAddress());
	   System.out.println("Phone number: " + contact.getPhoneNumber());
	   System.out.println(); // print a blank line for formatting
	}
	public Contact findContactByLastName(String lastName, AddressBook ab) {		//REQUIRED
	    ab.setStart();
	    while (ab.next()) {
	        Contact contact = ab.getCurrentPos();
	        if (contact.getLastName().equalsIgnoreCase(lastName)) {
	            return contact;
	        }
	    }
	    return null;
	}
	public Contact findContactByFirstName(String firstName, String lastName, AddressBook ab) {
		ab.setStart();
	    while (ab.next()) {
	        Contact contact = ab.getCurrentPos();
	        if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
	            return contact;
	        }
	    }
	    return null;
	}
	public boolean hasMultipleContacts(String lastName, AddressBook ab) {		//RETURNS TRUE IF MULTIPLE LAST NAMES
		int count = 0;
	    setStart();
	    while (next()) {
	        Contact contact = getCurrentPos();
	        if (contact.getLastName().equalsIgnoreCase(lastName)) {
	            count++;
	            if (count > 1) {
	                return true;
	            }
	        }
	    }
	    return false;
	}
	public void deleteContact(Contact x, AddressBook y) {		//REQUIRED
		y.setStart();
	    while (y.next()) {
	        Contact contact = y.getCurrentPos();
	        if (contact.getFirstName().equalsIgnoreCase(x.getFirstName()) && contact.getLastName().equalsIgnoreCase(x.getLastName())) {
	            y.deleteCurrentPos();
	            return;
	        }
	    }
	}
	public void MakeEmpty() {         //REQUIRED
		head = null;
	}
	public void sortByLastName() {
	    boolean sorted = false;
	    while (!sorted) {
	        sorted = true;
	        Node node = head;
	        while (node.getTail() != null) {
	            Contact contact1 = node.getContact();
	            Contact contact2 = node.getTail().getContact();
	            if (contact1.getLastName().compareTo(contact2.getLastName()) > 0) {
	                // Swap the contacts
	                node.setContact(contact2);
	                node.getTail().setContact(contact1);
	                sorted = false;
	            }
	            node = node.getTail();
	        }
	    }
	}
}