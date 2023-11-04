package pasha;

public class ConstructorEx {
	String Name;
	int Age;
	String Location;
	String aadhar;

	public ConstructorEx(String name, int age, String loc, String Adhar) {
		Name = name;
		Age = age;
		Location = loc;
		aadhar = Adhar;	
	}
	public void DisplayDetails() {
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Loc: "+Location);
		System.out.println("Adhar: "+aadhar);
	}
	public static void main(String[] args) {
		ConstructorEx con = new ConstructorEx("asd", 30, "latur", "144");
		con.DisplayDetails();
		System.out.println("******************");
		ConstructorEx con1 = new ConstructorEx("as", 20, "pune", "234");
		con1.DisplayDetails();
	}
}