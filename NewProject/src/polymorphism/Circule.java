package polymorphism;

public class Circule implements IFigure{

	private final static double PI = 3.1416; // Constant
	private double radius;
	
	public Circule(double enteredRadius) {
		radius = enteredRadius;
	}
	
	@Override
	public double getArea() {
		double area = PI*radius*radius;
		return area;
	}

	@Override
	public double getPerimeter() {
		double perimeter = 2*PI*radius;
		return perimeter;
	}

}
