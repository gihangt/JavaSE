package day1.CalculateSalary;

public class Person {
	private String firstName;
	private String lastName;
	private String department;
	private Department dep;
	
	public Person(String firstName,String lastName,String department){
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		
		dep = new Department(this.department);
		
	}
	
	public String getFirstName(){
		return firstName;
	}

	public Department getDep() {
		return dep;
	}
	
	
}
