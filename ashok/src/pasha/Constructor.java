package pasha;

public class Constructor {
	int a,b;

	public Constructor(int i, int j) {
		a = i;
		b =j;
		System.out.println("a: "+a+"b: "+b);
	}
	public Constructor() {
		System.out.println("a: "+a+"b: "+b);
	}
	
	public static void main(String[] args) {
		Constructor con =new Constructor(12,45);
		Constructor con1 =new Constructor(20,40);
	}
}
