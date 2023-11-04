package pasha;

public class FIbonnaciSeries {
	public static void main(String[] args) {
		int f1=1, f2=1, f3;
		System.out.println(f1);
		System.out.println(f2);
		
		for(int i=2;i<=10;i++) {
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
	}
}
