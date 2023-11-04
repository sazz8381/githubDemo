package pasha;

import java.util.Scanner;

public class WeekDays {
	public static void main(String[] args) {
		WeekDays Days = new WeekDays();
		Days.findDaysOfWeek();
	}
	public void findDaysOfWeek() {
		String day = "Monday";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your Day: ");
		 day =input.next();
		
		
		switch(day) {
		case "Monday","Tuesday":{
			System.out.println("Earlier Week Days");
			break;
		}
		case "WednesDay","Thursday":{
			System.out.println("Mid-Week Days");
			break;
		}
		case "Friday","Saturday","Sunday":{
			System.out.println("Weekends");
			break;
		}
		default:{
			System.out.println("No Day Present!!");
		}
		}
		
		
	}
	
}
