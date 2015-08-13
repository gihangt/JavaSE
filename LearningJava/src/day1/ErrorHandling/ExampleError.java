package day1.ErrorHandling;

public class ExampleError {

	public static void main(String[] args) {
		int c, a ,b;
		c = 0;
		a = 2;
		b = 3;
		
		try {
			int ab = a/c;
			System.out.println(ab);
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
