package pasha;

import java.util.Scanner;

public class QuaterOfMonth2 {
	public static void main(String[] args) {
		QuaterOfMonth2 quo = new QuaterOfMonth2();
		quo.quaterofMonth();
	}
	public void quaterofMonth() {
		String sazz = " ";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Month of Quater:");
		sazz = input.next();
		
		switch(sazz) {
		case "January","Febuary","March","April"->System.out.println("1 st Quater");
		case "May","June","July","August"->System.out.println("2 nd Quater");
		case "September","Octomber","November","December"->System.out.println("3 th Quater");
		default -> System.out.println("NO Month present:");
			
		}
	}
}
