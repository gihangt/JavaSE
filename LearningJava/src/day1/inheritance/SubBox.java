package day1.inheritance;

public class SubBox extends Box{
	public void calculateVolume(double width,double length, double height){
		double volume = width*length*height;
		System.out.println(volume);
	}

	@Override
	public void calculateArea(double width, double length) {
		System.out.println("subClass Cal ="+" "+ (width*length));
	
	}
	
	
}
