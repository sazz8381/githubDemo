package pasha;

import java.util.Scanner;

public class Agechecker {
	static int age;

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Agechecker age = new Agechecker();
		Agechecker.Agechec();
		Agechec();

	}

	public static void Agechec() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("please enter your age:");
		age = input.nextInt();

		if (age >= 18) {
			System.out.println("You are Eligible for voting:");
		} else
			System.out.println("Sorry You are not eligible for voting:");

	}
}
