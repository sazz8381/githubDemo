package pasha;

public class MethodEX {
	String F_name = "Abdul";
	String L_name = "Soudagar";
	String Address = "Cloth Lane";
	int Aadhar = 2519;
	String Pan = "KQPPS";
	
	public static void main(String[] args) {
		MethodEX met = new MethodEX();
		met.display();
		
	}
	public void display() {
		System.out.println("Name of Father: "+F_name);
		System.out.println("L_name of father: "+L_name);
		System.out.println("Address of Father: "+Address);
		System.out.println("AAdhar Number: "+Aadhar);
		System.out.println("pan: "+Pan);
	}
	}
