package quiz3.quiz3;

public class Triangle extends GeometricObject {
	//encapsulate class with default sides 1.0
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	//no arg constructor for default Triangle 
	public Triangle() {
	}

	//constructor for three sides; throw exception if one side
	// is >= the sum of the other two
	//or if one of the values equals zero
	public Triangle(double side1, double side2, double side3) throws TriangleException {
		if (side1 >= side2 + side3 || side2 >= side1 + side3
				|| side3 >= side1 + side2
				|| side1 * side2 * side3 == 0) {
			throw new TriangleException();
		}
		else {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
	}
	
	//generated getters (accessor methods) for each side
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	//area method will take s (half of perimeter) and performs the area equation
	public double getArea() {
		double s = (getPerimeter() / 2);
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}

	//adds all sides
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	//description
	public String toString() {
		return "Your triangle has side 1 = " + side1 + 
				"units, side 2 = " + side2 + 
				"units, and side 3 = " + side3 + "units. The area is " + (getArea()) + 
				"units, and the perimeter is " + (getPerimeter()) + "units.";
	}
}