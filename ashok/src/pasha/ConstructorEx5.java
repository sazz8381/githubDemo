package pasha;

public class ConstructorEx5 {
	String Language;
	
	ConstructorEx5(String Lang){
		Language = Lang;
		System.out.println(Language + " programming language");
		
	}
	public static void main(String[] args) {
		ConstructorEx5 con = new ConstructorEx5("java");
		ConstructorEx5 con1 = new ConstructorEx5("c++");
		ConstructorEx5 con2 = new ConstructorEx5("R");
	}
}
