package day1.Overriding;

public class SquireContainer extends Container {

	@Override
	public double caculateArea(double length) {
		double area = length * length;
		return area;
	}

}
