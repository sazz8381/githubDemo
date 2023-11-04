package pasha;

import java.util.Scanner;

public class WhileloopusingBreakandContinue {
	public static void main(String[] args) {
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Input an Integer");
			n = sc.nextInt();
		
			if(n != 0){
				System.out.println("you Entered "+n);
				continue;
			}
		}
	}
	
}
