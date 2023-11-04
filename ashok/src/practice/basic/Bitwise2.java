package practice.basic;

public class Bitwise2 {
	static int a = 20, b = 39, c = 40;

	public static void main(String[] args) {
		checknum1();
		checknum2();
	}
	public static void checknum1(){
		if(a>b && a>c) {
			System.out.println("A is greater - please check");
		} else {
			System.out.println("c is greater - please check");
		}
	}
	
	public static void checknum2() {
		if (a>b || a>c) {
			System.out.println("A is greater - please check");
		} else {
			System.out.println("c is greater - please chck value");
		}
	}
	}

