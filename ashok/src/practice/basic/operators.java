package practice.basic;

public class operators {
	public static void main(String[] args) {
		int a=10, b = 20, c;
		
		c= ++a+b;
		System.out.println(a);
		System.out.println(c);
		
		c=a++ +b;
		System.out.println(a);
		System.out.println(c);
	}
}
