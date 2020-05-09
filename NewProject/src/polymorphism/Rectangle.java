package polymorphism;

public class Rectangle implements IFigure
{
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public double getArea() {
		double area = a*b;
		return area;
	}
	@Override
	public double getPerimeter() {
		double perimeter = 2*(a + b);
		return perimeter;
	}
}
