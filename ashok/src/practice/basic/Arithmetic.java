package practice.basic;

public class Arithmetic {
	int a = 10, b = 2, c;

	public static void main(String[] args) {

		Arithmetic a1 = new Arithmetic();
		a1.adds();
		Arithmetic a2 = new Arithmetic();
		a2.sub();
	}

	public void adds() {
		c = a + b;
		System.out.println("addition:" + c);
	}
	public void sub() {
		c = a - b;
		System.out.println("substraction:" +c);
	}
}
