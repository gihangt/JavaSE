package day1.CalculateSalary;

public class Department {
	private String name;
	
	
	public Department(String name){
		this.name = name;
		
	}
	
	public double getSalary(String depName){
		if(depName == "HR"){
			return 40000;
		} else if(depName =="IT"){
			return 80000;
		} else{
			return 55000;
		}
	}
	
	public String getName() {
		return name;
	}

	public double getBones(double salary){
		if(salary < 55000){
			return 1000;
		} else if(salary >= 55000){
			return 3000;
		} else {
			return 5000;
		}
	}
	

	
}
