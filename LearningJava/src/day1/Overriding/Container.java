package day1.Overriding;

public abstract class Container {
	public double CalculateVolume(double length,double height){
		double volume;
			volume = caculateArea(length)*height;
		return volume;
	}
	
	public abstract double caculateArea(double length);
}
