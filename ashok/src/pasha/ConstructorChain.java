package pasha;

public class ConstructorChain {
	int a,b;
	ConstructorChain(){
		this(10);
		System.out.println("default");
	}
	ConstructorChain(int a){
		this(30, 20);
		System.out.println("!st Parameter");
	}
	ConstructorChain (int a, int b){
		this(20,30, 40);
		System.out.println("2nd parameter");	
	}
	ConstructorChain (int a, int b, int c){
		System.out.println("3rd parameter");
	}
	
	public static void main(String[] args) {
		ConstructorChain cons = new ConstructorChain();
	}
}