import java.util.Scanner;
public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Polygon polygon;
		System.out.println("----------- Welcome!");
		int choice = 99;
		while(choice != 6) {
			choice = menu();
			switch(choice) {
			case 1:
				System.out.println("Enter the number for the Operation you wish to preform:");
				System.out.println("1. Make an Equilateral Triangle\n"+
								"2. Make an Isosceles Triangle\n"+
								"3. Make another Triangle\n");
				int choiceT = sc.nextInt();
				if (choiceT == 1) {
					System.out.println("Enter the length for all sides in inches: ");
					double side = sc.nextDouble();
					polygon = new EquilateralTriangle(side);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceT == 2) {
					System.out.println("Enter the length for the single side unequal to the others in inches: ");
					double bottom = sc.nextDouble();
					System.out.println("Enter the length for the other two equal sides in inches: ");
					double sides = sc.nextDouble();
					polygon = new IsoscelesTriangle(bottom, sides);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceT == 3) {
					System.out.println("Enter the first side in inches: ");
					double side1 = sc.nextDouble();
					System.out.println("Enter the second side in inches: ");
					double side2 = sc.nextDouble();
					System.out.println("Enter the third side in inches: ");
					double side3 = sc.nextDouble();
					polygon = new Triangle(side1, side2, side3);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else {
					System.out.println("!!Answer not compatible!!");
				}
				break;
			case 2: 
				System.out.println("Enter the number for the Operation you wish to preform: ");
				System.out.println("1. Make a Square\n"+
								"2. Make a Rectangle\n"+
								"3. Make another Quadrilateral (Area will not be calculated)");
				int choiceQ = sc.nextInt();
				if (choiceQ == 1) {
					System.out.println("Enter the length of each side in inches:");
					double side1 = sc.nextDouble();
					polygon = new Square(side1);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceQ == 2) {
					System.out.println("Enter the length for the length in inches: ");
					double length = sc.nextDouble();
					System.out.println("Enter the length of the width in inches: ");
					double width = sc.nextDouble();
					polygon = new Rectangle(length, width);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				} 
				else if (choiceQ == 3) {
					System.out.println("Enter the length for the first side in inches: ");
					double side1 = sc.nextDouble();
					System.out.println("Enter the length for the second side in inches: ");
					double side2 = sc.nextDouble();
					System.out.println("Enter the length for the third side in inches: ");
					double side3 = sc.nextDouble();
					System.out.println("Enter the length for the fourth side in inches: ");
					double side4 = sc.nextDouble();
					polygon = new Quadrilateral(side1, side2, side3, side4);
					System.out.println("Area: Not calculated");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else {
					System.out.println("!!Answer not compatible!!");
				}
			break;
			case 3: 
				System.out.println("Enter the number for the Operation you wish to preform: "); 
				System.out.println("1. Make an Equilateral Pentagon\n"+
									"2. Make another Pentagon (Area will not be calculated)\n");
				int choiceP = sc.nextInt();
				if (choiceP == 1) {
					System.out.println("Enter the length for all sides in inches: ");
					double side = sc.nextDouble();
					polygon = new EquilateralPentagon(side, side, side, side, side);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceP == 2) {
					System.out.println("Enter the length for the first side in inches: ");
					double side1 = sc.nextDouble();
					System.out.println("Enter the length for the second side in inches: ");
					double side2 = sc.nextDouble();
					System.out.println("Enter the length for the third side in inches: ");
					double side3 = sc.nextDouble();
					System.out.println("Enter the length for the fourth side in inches: ");
					double side4 = sc.nextDouble();
					System.out.println("Enter the length for the fifth side in inches: ");
					double side5 = sc.nextDouble();
					polygon = new Pentagon(side1, side2, side3, side4, side5);
					System.out.println("Area: Not calculated");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else {
					System.out.println("!!Answer not compatible!!");
				}
			break;
			case 4: 
				System.out.println("Enter the number for the Operation you wish to preform"); 
				System.out.println("1. Make an Equilateral Hexagon\n" +
									"2. Make another Hexagon");
				int choiceH = sc.nextInt();
				if (choiceH == 1) {
					System.out.println("Enter the length for all sides in inches: ");
					double side = sc.nextDouble();
					polygon = new Hexagon(side, side, side, side, side, side);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceH == 2) {
					System.out.println("Enter the length for the first side in inches: ");
					double side1 = sc.nextDouble();
					System.out.println("Enter the length for the second side in inches: ");
					double side2 = sc.nextDouble();
					System.out.println("Enter the length for the third side in inches: ");
					double side3 = sc.nextDouble();
					System.out.println("Enter the length for the fourth side in inches: ");
					double side4 = sc.nextDouble();
					System.out.println("Enter the length for the fifth side in inches: ");
					double side5 = sc.nextDouble();
					System.out.println("Enter the length for the sixth side in inches: ");
					double side6 = sc.nextDouble();
					polygon = new Hexagon(side1, side2, side3, side4, side5, side6);
					System.out.println("Area: Not calculated");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else System.out.println("!!Answer not compatible!!");
			break;
			case 5: 
				System.out.println("Enter the number for the Operation you wish to preform");
				System.out.println("1. Make an Equilateral Octagon\n"+
									"2. Make another Octagon");
				int choiceO = sc.nextInt();
				if (choiceO == 1) {
					System.out.println("Enter the length for each side: ");
					double side = sc.nextDouble();
					polygon = new Octagon(side, side, side, side, side, side, side, side);
					System.out.println("Area: " + polygon.area() + " inches.");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else if (choiceO == 2) {
					System.out.println("Enter the length for the first side in inches: ");
					double side1 = sc.nextDouble();
					System.out.println("Enter the length for the second side in inches: ");
					double side2 = sc.nextDouble();
					System.out.println("Enter the length for the third side in inches: ");
					double side3 = sc.nextDouble();
					System.out.println("Enter the length for the fourth side in inches: ");
					double side4 = sc.nextDouble();
					System.out.println("Enter the length for the fifth side in inches: ");
					double side5 = sc.nextDouble();
					System.out.println("Enter the length for the sixth side in inches: ");
					double side6 = sc.nextDouble();
					System.out.println("Enter the length for the seventh side in inches: ");
					double side7 = sc.nextDouble();
					System.out.println("Enter the length for the eigth side in inches: ");
					double side8 = sc.nextDouble();
					polygon = new Octagon(side1, side2, side3, side4, side5, side6, side7, side8);
					System.out.println("Area: Not calculated");
					System.out.println("Perimeter: " + polygon.perimeter() + " inches.");
				}
				else System.out.println("!!Answer not compatible!!");
			break;
			case 6: 
				System.out.println("!!Thank you and Goodbye!!"); 
			break;
			}
		}
		
	}
	public static int menu() {
		int choice = 99;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for the Operation you wish to perform:");
		System.out.println("1. Make a triangle\n"+
				   "2. Make a Quadrilateral\n"+
		           "3. Make a Pentagon\n"+
				   "4. Make a Hexagon\n"+
		           "5. Make an Octagon\n"+
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
