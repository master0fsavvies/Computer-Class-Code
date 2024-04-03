/*
      CS282-1913 – Spring 2023
               Lab 3 Cipher

               John Nix

               2/17/2023

               Make an encryption program which takes a keyword, a variation of
               the Caesar Cipher.

         */
import java.util.*;
public class Cipher {
	protected char[] encoder = new char[26];		//initializes
	protected char[] decoder = new char[26];
	
	
	public Cipher(String keyword) {									//turns keyword into a cipher code
		char[] keywordArray = keyword.toCharArray();
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for(int x = 0; x < keywordArray.length; x++) {
			encoder[x] = keywordArray[x];
		}
		int current = keywordArray.length;
		for (int y = 0; y < 26; y++) {
			char currentC = alphabet[y];
			if (!contains(keywordArray, currentC)) {
				encoder[current] = currentC;
				current++;
			}
		}
		decoder = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		
	}
	public static boolean contains(char[] array, char has) {		//checks if a character is in the array
		for (int z = 0; z < array.length; z++) {
			if (array[z] == has) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
	public String encrypt(String message) {
		return transform(message, encoder); 		// uses encoder array to encrypt message
	}
	
	public String decrypt(String secret) {			// finds char on the encoder array, matches to decoder array
		char[] msg = secret.toCharArray();
		int j = -1;
		for (int k = 0; k < msg.length; k++) {
			char c = Character.toUpperCase(msg[k]);
			if (Character.isLetter(c)) {
				for (int i = 0; i < encoder.length; i++) {
					if (encoder[i] == c) {
						j = i;
					}
				}
				char newChar = decoder[j];
				if (Character.isLowerCase(msg[k])) {
					newChar = Character.toLowerCase(newChar);
				}
				msg[k] = newChar;						// changes to new letter
			}
		}
		return new String(msg);
	}
	
	
	
	private String transform(String original, char[ ] code) {		//use for encryption only
		char[] msg = original.toCharArray();
	    for (int k = 0; k < msg.length; k++) {
	        char c = Character.toUpperCase(msg[k]);
	        if (Character.isLetter(c)) {
	            int j = c - 'A'; // Get the index of the character in the encoder/decoder array
	            char newChar = code[j];
	            if (Character.isLowerCase(msg[k])) {
	                newChar = Character.toLowerCase(newChar);
	            }
	            msg[k] = newChar; // Replace the character in the message
	        }
	    }
	    return new String(msg);
	}
	
	
	
	
	public static void main(String[] args) {		//STARTS HERE <--------------------------------------------------------
		int choice = 99;
		Scanner sc = new Scanner(System.in);
		Cipher cipher = null;
		String coded = " ";
		System.out.println("!! Welcome !!");
		String key = "A";
		while(choice != 9) {
			choice = menu();
			switch(choice) 
			{
				case 1: System.out.println("Enter a Key word >> ");
						String keyCopy = sc.nextLine();
						key = keyCopy;
						cipher = new Cipher(key);
						System.out.println("Encryption code = " + new String(cipher.encoder));
						System.out.println("Decryption code = " + new String(cipher.decoder));
						break;
				case 2: if (cipher != null) {
							System.out.println("Enter a message to encrypt >> ");
							String message = sc.nextLine();
							coded = cipher.encrypt(message);
							System.out.println(" Secret: " + coded);
						} else {System.out.println("Please enter a key via option 1 first");}
						break;
				case 3: if (cipher != null) {System.out.println("Enter a message to decrypt >> ");
							String dmessage = sc.nextLine();
							String answer = cipher.decrypt(dmessage);
							System.out.println("Message: " + answer);
						} else {System.out.println("Please enter a key via option 1 first");}
						break;
				case 4: System.out.println("Enter a valid menu choice."); break;
				case 5: System.out.println("Enter a valid menu choice."); break;
				case 6: System.out.println("Enter a valid menu choice."); break;
				case 7: System.out.println("Enter a valid menu choice."); break;
				case 8: System.out.println("Enter a valid menu choice."); break;
				case 9: System.out.println("End of Program"); sc.close(); break;
			}
		}
		
		
		
		
		
		 
	}
	public static int menu() {
		int choice = 99;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the operation you wish to preform >> ");
		System.out.println("1. Enter Key word\n"+ //takes new key word and re-aligns array
				   "2. Encrypt message\n"+ // takes a message of 140 characters and encrypts message
		           "3. Decrypt message\n"+ //takes an encrypted message of 140 characters and decrypts it
				   "9. Exit Program\n");

		System.out.println("Enter Choice: ");
		try 
		{
			choice = sc.nextInt();
			while(choice < 1 || choice >9)
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
		System.out.println(); 
		return choice;
	}
}

