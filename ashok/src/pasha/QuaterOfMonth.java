package pasha;

import java.util.Scanner;

public class QuaterOfMonth {
	public static void main(String[] args) {
		QuaterOfMonth quo = new QuaterOfMonth();
		quo.quaterofMonth();
	}
	public void quaterofMonth() {
		String sazz = " ";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Month of Quater:");
		sazz = input.next();
		
		switch(sazz) {
		case "January","Febuary","March","April":{
			System.out.println("1 st Quater");
			break;
		}
		case "May","June","July","August":{
			System.out.println("2 nd Quater");
			break;
		}
		case "September","Octomber","November","December":{
			System.out.println("3 th Quater");
			break;
		}
		}
	}
}
