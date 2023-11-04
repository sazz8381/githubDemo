package pasha;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StaticInstanceEX {
	String E_name = "ASHU";
	String E_no ="123";
	static String E_COmapny ="DELL";
	

	public static void display(String E_name, String E_no) {
		System.out.println("Employee Name: "+E_name);
		System.out.println("Employee Number: "+E_no);
		System.out.println("Company Name: "+E_COmapny);
	}
	
	public static void main(String[] args) {
		StaticInstanceEX emp = new StaticInstanceEX();
		emp.E_name = "SAzz";
		emp.E_no= "1234";
		display(emp.E_name, emp.E_no);
		System.out.println("********************");
		
		StaticInstanceEX emp1 = new StaticInstanceEX();
		emp1.E_name = "ashu";
		emp1.E_no = "456";
		display(emp1.E_name, emp1.E_no);
	}
}