package day1.example;

public class MyFirstClass {

	public static void main(String[] args) {
		Person p1 = new Person("Gihan","Gunarathna","183 Albert Street");
		System.out.println(p1.firstName);
		System.out.println(p1);
		
		Calculation cal = new Calculation(2,3,4);
		int value =cal.Multiply();
		System.out.println(value);
		
		ArrayClass a1 = new ArrayClass();
		int [] array = a1.getA();
		for(int a :array){
			System.out.println(a);
		}
	}
	
	

}
