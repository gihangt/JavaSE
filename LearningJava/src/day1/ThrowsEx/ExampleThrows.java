package day1.ThrowsEx;

public class ExampleThrows {

	public static void main(String[] args) {
		
		MyClass m1 = new MyClass();
		try {
			int value = m1.cal(0, 0);
			System.out.println(value);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		

	}

}
