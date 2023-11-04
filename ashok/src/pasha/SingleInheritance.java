package pasha;

public class SingleInheritance {
	public static void main(String[] args) {
		EmpDetails empdetails = new EmpDetails() {
		empdetails.Display();
	}
		}
	class Employee{
		String Name ="Ashu";
		float sal= 50.000f;
	}
	class EmpDetails extends Employee {
		String Designation = "QA";
		float Bonus = 35.000f;
		
		
	
	
	public void Display() {
		System.out.println("Name:" +Name);
		System.out.println("salary:" +sal);
		System.out.println("Designatition:" +Designation);
		System.out.println("Bonus:" +Bonus);
	}
}
}
