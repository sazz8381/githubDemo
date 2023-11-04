package pasha;

public class ConstructorExample3 {
	String Name;
	int Age;
	String location;
	
	public ConstructorExample3(String Name, int Age, String location) {
		this.Name = Name;
		this.Age = Age;
		this.location = location;
	}
	public void DisplayMeth() {
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Location: "+location);
	}
	
	public static void main(String[] args) {
		ConstructorExample3 cons = new ConstructorExample3("Ashu", 30, "latur");
		cons.DisplayMeth();
		System.out.println("U***********************");
		ConstructorExample3 cons1 = new ConstructorExample3("Sarfaraz", 24, "pune");
		cons1.DisplayMeth();
}
}