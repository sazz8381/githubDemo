package pasha;

public class ExampleoConstructor {
	int a, b;
	
	ExampleoConstructor(int a, int b){
		this.a=a;
		this.b=b;
			
	}
	public void Display() {
		System.out.println("a value:"+a);
		System.out.println("b value: "+b);
	}
	public static void main(String[] args) {
		ExampleoConstructor cons = new ExampleoConstructor(67,2543);
		cons.Display();
	}
}
