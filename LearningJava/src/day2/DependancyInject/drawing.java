package day2.DependancyInject;

public class drawing {

	private Shape shape;
	public void setShape(Shape shape) {
		this.shape = shape;
		
	}

	public void drawShape() {
		this.shape.draw();
		
	}

}
