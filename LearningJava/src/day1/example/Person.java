package day1.example;

public class Person {
	String firstName;
	String lastName;
	String address;
	
	public Person(String firstName,String lastName,String address){
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}
	
	public String toString(){
		return this.firstName +" " + this.lastName;
	}
	
	
}
