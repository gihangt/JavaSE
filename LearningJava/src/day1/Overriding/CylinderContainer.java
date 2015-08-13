package day1.Overriding;

public class CylinderContainer extends Container {

	@Override
	public double caculateArea(double length) {
		double area;
		area = Math.PI*(length/2)*(length/2);
		return area;
	}

}
