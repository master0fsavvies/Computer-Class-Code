/** Interface **/
public interface Polygon {
	public double area();
	public double perimeter();
}


class Triangle implements Polygon {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	@Override
	public double area() {
		double temp = (side1 + side2 + side3) / 2;
		return Math.sqrt((temp)*(temp - side1)*(temp - side2)*(temp-side3));
	}
	@Override
	public double perimeter() {
		return side1 + side2 + side3;
	}
}
class IsoscelesTriangle extends Triangle {
	public IsoscelesTriangle(double side1, double side2) {
		super(side1, side2, side2);
	}
}
class EquilateralTriangle extends Triangle {
	public EquilateralTriangle(double side) {
		super(side, side, side);
	}
}


class Quadrilateral implements Polygon {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	public Quadrilateral(double side1, double side2, double side3, double side4) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
	}
	@Override
	public double area() {
		return 0.0;
	}
	@Override
	public double perimeter() {
		return side1+ side2 + side3 + side4;
	}
}
class Square extends Quadrilateral {
	private double side1;
	public Square(double side1) {
		super(side1, side1, side1, side1);
		this.side1 = side1;
	} 
	@Override
	public double perimeter() {
		return (side1 * 4);
	}
	@Override
	public double area() {
		return (side1 * side1);
	}
}
class Rectangle extends Quadrilateral {
	private double length;
	private double width;
	public Rectangle(double length, double width){
		super(length, width, length, width);
		this.length = length;
		this.width = width;
	}
	@Override
	public double area() {
		return length * width;
	}
	@Override
	public double perimeter() {
		return length + length + width + width;
	}
}
class Pentagon implements Polygon {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double side5;
	public Pentagon(double side1, double side2, double side3, double side4, double side5) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
	}
	@Override
	public double area() {
		return 0;
	}
	@Override
	public double perimeter() {
		return side1 + side2 + side3 + side4 + side5;
	}
}
class EquilateralPentagon extends Pentagon {
	private double side1;
	public EquilateralPentagon(double side1, double side2, double side3, double side4, double side5) {
		super(side1, side2, side3, side4, side5);
		this.side1 = side1;
	}
	@Override
	public double area() {
		return (5.0 / 4.0) * (side1 * side1) * Math.tan(Math.toRadians(3.0 * Math.PI / 10.0));
	}
}
class Hexagon implements Polygon {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double side5;
	private double side6;
	public Hexagon(double side1, double side2, double side3, double side4, double side5, double side6) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
	}
	@Override
	public double area() {
		return 1.5 * Math.sqrt(3) * (side1 * side1);//Note: only use for equilateral
	}
	@Override
	public double perimeter() {
		return side1 + side2 + side3 + side4 + side5 + side6;
	}
}
class Octagon implements Polygon {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	private double side5;
	private double side6;
	private double side7;
	private double side8;
	public Octagon(double side1, double side2, double side3, double side4, double side5, double side6, double side7, double side8) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.side4 = side4;
		this.side5 = side5;
		this.side6 = side6;
		this.side7 = side7;
		this.side8 = side8;
	}
	@Override
	public double area() {
		return 2.0 * side1 * side1 * (1.0 / Math.tan(Math.PI / 8.0)); //Note: only use for equilateral
	}
	@Override
	public double perimeter() {
		return side1 + side2 + side3 + side4 + side5 + side6 + side7 + side8;
	}
}
