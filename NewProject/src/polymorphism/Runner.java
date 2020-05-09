package polymorphism;

public class Runner {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(2.7, 1.5);
		Circule circule = new Circule(3.4);
		
		draw(rectangle);
		draw(circule);
		
		//You could add other figures without changing draw method
	}

	private static void draw(IFigure figure) {
		String message = String.format("I am drawing wondefyl %s with perimeter: %.2f and area: %.2f\n",
				figure.getClass().getName().substring(13),
				figure.getArea(),
				figure.getPerimeter());
		System.out.printf(message);
	}
}