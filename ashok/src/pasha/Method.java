package pasha;

public class Method {
	int a = 10, b= 20, c;
	
	public void sum() {
		c = a+b;
		System.out.println(c);
	}
	public void sub() {
		c = a-b;
		System.out.println(c);
	}
	public void sum1(int a, int b) {
		c =a + b;
		System.out.println(c);
	}
	public void sub1(int a , int b) {
		 c=a+b;
		 System.out.println(c);
	}
	public void sub2(int a, int b) {
		c= b+a;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Method meth = new Method(); 
		meth.sub();
		meth.sum();
		meth.sub1(20, 30);
		meth.sum1(30, 50);
		
		
	}
}
