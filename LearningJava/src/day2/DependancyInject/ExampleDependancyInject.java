package day2.DependancyInject;

public class ExampleDependancyInject {
	public static void main(String[] args) {
		Trangle t1 = new Trangle();
		drawing drawing = new drawing();
		drawing.setShape(t1);
		drawing.drawShape();
		
	    Circle c1 = new Circle();
	    drawing.setShape(c1);
	    drawing.drawShape();
	}
}
