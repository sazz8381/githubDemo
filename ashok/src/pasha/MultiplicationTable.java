package pasha;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		int n, c;
		System.out.println("enter the multiplication value");

		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		System.out.println("Multiplication table of " + n + " is :-");

		for (c = 1; 1 <= 10; c++)
			System.out.println(n + "*" + c + " = " + (n * c));
	}
}
