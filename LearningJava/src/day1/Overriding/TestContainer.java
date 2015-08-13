package day1.Overriding;

public class TestContainer {

	public static void main(String[] args) {
		Container c1 = new CylinderContainer();
		double c1Volume = c1.CalculateVolume(10, 10);
        System.out.println("Cylinder Container Volume = "+ " "+c1Volume);
        
        c1 = new SquireContainer();
        double s1Volume = c1.CalculateVolume(10, 10);
        System.out.println("Squire Container Volume = " +" "+s1Volume);
	}

}
