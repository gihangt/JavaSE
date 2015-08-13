package day1.inheritance;

public class TestBox {

	public static void main(String[] args) {
		Box fedex = new Box();
		fedex.calculateArea(10, 30);
		
		SubBox fedex2 = new SubBox();
		fedex2.calculateArea(10, 20);
		fedex2.calculateVolume(10, 20, 30);

	}

}
