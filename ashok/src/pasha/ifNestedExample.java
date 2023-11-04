package pasha;

import java.util.Scanner;

public class ifNestedExample {
	int age;
	String nationality;
	
	public static void main(String[] args) {
		ifNestedExample nest = new ifNestedExample();
		nest.agecheck();
	}
	public void agecheck() {
		
		Scanner input= new Scanner(System.in);
		System.out.println("ENter your age:");
		age= input.nextInt();
		System.out.println("Enter yor Nationality:");
		nationality = input.next();
		input.close();
		if (age>=18) {
			if (nationality.equals("Indian")) {
				System.out.println("you are eligble for voting");
				System.out.println("you can vote");
		}
		else
			System.out.println("your voting creteria did not match A indian:");
		}
	
	else 
		System.out.println("you are not and indaian and you are indian");
}
}