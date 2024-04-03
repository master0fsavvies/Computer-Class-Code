import java.util.*;
public class InjectiveFunctions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
        do {
            System.out.println("Choose a function to test if injective (one to one) on domain 1-100:");
            System.out.println("1. t: Z -> Z. t(x) = 3x");
            System.out.println("2. t: Z -> Z. t(x) = x^2 [x squared]");
            System.out.println("3. t: Z -> Z. t(x) = 2x - 2");
            System.out.println("4. Exit");
            System.out.println("Enter here: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Testing t(x) = 3x");
                boolean isInjective = true;
                for (int i = 1; i <= 100; i++) {
                    for (int j = i+1; j <= 100; j++) {
                        if (!isInjective1(i, j)) {
                            isInjective = false;
                            break;
                        }
                    }
                }
                if (isInjective) {
                    System.out.println("t(x) = 3x is injective on domains 1-100.");
                } else {
                    System.out.println("t(x) = 3x is not injective.");
                }
            } else if (choice == 2) {
                System.out.println("Testing t(x) = x^2");
                boolean isInjective = true;
                for (int i = 1; i <= 100; i++) {
                    for (int j = i+1; j <= 100; j++) {
                        if (!isInjective2(i, j)) {
                            isInjective = false;
                            break;
                        }
                    }
                }
                if (isInjective) {
                    System.out.println("t(x) = x^2 is injective on domains 1-100.");
                } else {
                    System.out.println("t(x) = x^2 is not injective.");
                }
            } else if (choice == 3) {
                System.out.println("Testing t(x) = 2x - 2");
                boolean isInjective = true;
                for (int i = 1; i <= 100; i++) {
                    for (int j = i+1; j <= 100; j++) {
                        if (!isInjective3(i, j)) {
                            isInjective = false;
                            break;
                        }
                    }
                }
                if (isInjective) {
                    System.out.println("t(x) = 2x - 2 is injective on domains 1-100.");
                } else {
                    System.out.println("t(x) = 2x - 2 is not injective.");
                }
            } else if (choice == 4) {
            	System.out.println("Goodbye world!");
            } else {
            	System.out.println("Please type a number between 1-4");
            }
            
        } while (choice != 4);
        sc.close();
	}
	
	public static boolean isInjective1(int x, int y) {
        return (3*x != 3*y);
    }
	
	public static boolean isInjective2(int x, int y) {
        return (x*x != y*y);
    }
	
	 public static boolean isInjective3(int x, int y) {
	        return (2*x - 2 != 2*y - 2);
	    }
}
