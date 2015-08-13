package day2.Polymorphism;

public class ExampleDraw {

	public static void main(String[] args) {
		Shape shape = new Trangle();
		shape.draw();
		
	    shape = new Circle();
		shape.draw();

	}

}
