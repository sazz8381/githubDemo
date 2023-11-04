package pasha;

import java.util.Scanner;

public class table {
	public static void main(String[] args) {
		int a, b, c, d;

		System.out.println("Enter Range of numbeers to print value: ");

		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		

		for (c = a; c <= b; c++) {
			System.out.println("Multiplication table of " + c);

			for (d = 1; d <= 10; d++) {
				System.out.println(c + "*" + d + "=" + (c * d));
			}
		}

	}
}
