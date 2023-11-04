package pasha;

import java.util.Scanner;

public class Gradeof_students {

	public static void main(String[] args) {
		Gradeof_students student = new Gradeof_students();
		student.getgrade();
	}

	public static void getgrade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("You your subject Name:");
		String subject = sc.next();
		System.out.println("enter your Subject marks:");
		int marks = sc.nextInt();
		System.out.println("your subject name" + subject);

		if (marks == 35) {
			System.out.println("Grade C");
		} else if (marks >= 36 && marks <= 55) {
			System.out.println("Grade B");
		} else if (marks >= 56 && marks <= 74) {
			System.out.println("Grade B+");
		} else if (marks >= 75 && marks <= 98) {
			System.out.println("Grade A+");
		} else {
			System.out.println("Failed");
		}
	}
}
