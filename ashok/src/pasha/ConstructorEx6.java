package pasha;

public class ConstructorEx6 {
	int a, b;
	
	ConstructorEx6(){
		System.out.println("default");
	}
	ConstructorEx6(int a){
		System.out.println("1st parameter");
	}
	ConstructorEx6(int a, int b){
		System.out.println("2nd parameter");
	}
	ConstructorEx6(int a, int b, int c){
		System.out.println("3rd Parameter");
	}
	public static void main(String[] args) {
		ConstructorEx6 cons = new ConstructorEx6();
		ConstructorEx6 cons1 = new ConstructorEx6(29,13);
		ConstructorEx6 cons2 = new ConstructorEx6(35);
		ConstructorEx6 cons3 = new ConstructorEx6(56,98,12);
	}
	
}
