package day1.CalculateSalary;

public class SalaryCal {

	public static void main(String[] args) {
		Person p1 = new Person("Gihan","Gunarathna","IT");
		Person p2 = new Person("Nishni","Thennakoon","Chemestory");
		Person p3 = new Person("Aruna","Gunasignha","HR");
		
		Person[] employees = {p1,p2,p3};
		
		for(Person p : employees){
			double salary;
			double bones;
			double totalSalary;
			
			salary = p.getDep().getSalary(p.getDep().getName());
			bones = p.getDep().getBones(salary);
			totalSalary = salary + bones;
			System.out.println("Name :" +" " + p.getFirstName()+" "+ "Totla Salary :" + " "+ "$"+totalSalary);
			
		}

	}

}
