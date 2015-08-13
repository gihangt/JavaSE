package day1.ThrowsEx;



public class MyClass {
	int c = 0;
	public int cal(int a, int b) throws Exception{
		try {
			int c = a/ b;
			return c;
		} catch (Exception e) {
			throw new Exception("Please check the numbers"); 
		}
		
		
		
	}
}
