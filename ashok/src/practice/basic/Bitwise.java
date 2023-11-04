package practice.basic;

public class Bitwise {
	int a=100, b=20, c=30;
	public static void main(String[] args) {
		Bitwise bit = new Bitwise();
		
		bit.checknum1();
		bit.checknum2();
	}
	public void checknum1() {
		if (a>b & a>c) {
			System.out.println("checknum - Ais greater");
		}
	}
	public void checknum2() {
		if (a>b | a>c) {
			System.out.println("checknum - B is greater");
		}
	}
}
