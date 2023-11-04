package pasha;

public class AsConstructor {
	String Name;
	int Age;
	String Address;
	static String Branch ="CES" ;
	AsConstructor(String name, int age, String address){
		Name = name;
		Age = age;
		Address = address;
		
	}{
		System.out.println("default Constructor");
	}
	
	public void displayDetails() {
		System.out.println("Name:" +Name);
		System.out.println("Age:" +Age);
		System.out.println("Address:" +Address);
		System.out.println("Branch: " +Branch);
		System.out.println("***************");
	}
	
	public static void main(String[] args) {
		AsConstructor cons = new AsConstructor("Ashu",22,"Latur");
		cons.displayDetails();
		AsConstructor cons1 = new AsConstructor("Sarfaraz",24,"pune");
		cons1.displayDetails();
	}
}
