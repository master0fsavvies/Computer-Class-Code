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
public class Queue 
{
	public static int MaxSize = 50;
	private String[] container = new String[MaxSize];
	private int count;//keeps track of number of integers in stack
	private int front;
	private int back;
	
	public Queue()
	{
		count = 0;
		front = -1;
		back=-1;
		
	}
	public boolean isEmpty()
	{
		if(count == 0)
			return true;
		return false;
	}
	public boolean isFull()
	{
		if(count>=MaxSize)
			return true;
		return false;
	}
	public boolean enqueue(String i)
	{
		if(isFull())
			return false;//fail
		if(back==-1)
		{
			front=0;
			back=0;
		}
		else 
			back++;
		back = back % MaxSize;
		container[back] = i;
		count++;
		return true;
	}
	public String dequeue()
	{
		if (isEmpty())
			return null;
		String temp = container[front++];
		front = front % MaxSize;
		if(--count<=0)
		{
			front=-1;
			back=-1;
		}
		return temp;
	}
	public String checkNext() {
		if (isEmpty())
			return null;
		return container[front];
	}
}