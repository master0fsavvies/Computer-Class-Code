/*
      CS282-1913 – Spring 2023
               Lab 4 recursion

               John Nix

               3/3/2023

               Exercise A: Implement a recursive function to find the sum of digits of a given number. 

         */
import java.util.*;
public class Lab4 {
	public static void main(String[] args) {
		int Exit = 0;
		int input = 99;
		Scanner sc = new Scanner(System.in);
		while(input != Exit) {
			System.out.println("\nEnter an interger to get the sum of each number, or use " 
					+ Exit + " to quit:");
			try {
				input = sc.nextInt();
			}
			catch(java.util.InputMismatchException e)
			{
				System.out.println("!!Non Integer entered!!");
				input = 99;
			}
			if(input > 0)
				System.out.println("Sum of digits: " + sumOfDigits(input));
			else if(input < 0){
				System.out.println("!!Can't use negative numbers!!");
				input = 99;
			}
		}
		System.out.println("End of Program.");
		sc.close();
	}
	
	public static int sumOfDigits(int n) {
		String nString = String.valueOf(n);
		int[] Array = new int[nString.length()];
		for (int i = 0; i < nString.length(); i++) {
			Array[i] = Character.getNumericValue(nString.charAt(i));
		}
		try{
			return sumOfDigits2(Array, nString.length());
		}
		catch(java.util.InputMismatchException e)
		{
			return 0;
		}
	}
	public static int sumOfDigits2(int[] Array, int n) {
		if(n == 0) {
			return 0;
		}
		else {
			return (sumOfDigits2(Array, n-1) + Array[n-1]);
		}
	}
}
