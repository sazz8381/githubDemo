package pasha;

public class ConstructorT {
	int a, b;

	ConstructorT() {
		System.out.println("default");
	}

	ConstructorT(int a) {
		System.out.println("1st Parameter");
	}

	ConstructorT(int a, int b) {
		System.out.println("2nd Parameter");
	}

	ConstructorT(int a, int b, int c) {
		System.out.println("3rd Parameter");
	}

	public static void main(String[] args) {
		ConstructorT cons = new ConstructorT();
		ConstructorT cons1 = new ConstructorT();
		ConstructorT cons2 = new ConstructorT(20, 30, 50);
		ConstructorT cons3 = new ConstructorT(30);
		ConstructorT cons4 = new ConstructorT(20, 30);
	}

}
