package pasha;

import java.util.Scanner;

public class WhileloopUsingBreak {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("input the integer");
			n = sc.nextInt();
		if (n == 0) {
			break;
		}
		System.out.println("you entered " +n);
		}
	}
}
