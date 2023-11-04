package pasha;

import java.util.Scanner;

public class Reversenum {
	public static void main(String args[]) {
		int x=0, y=0, z=0;
		System.out.println("Enter three integers ");
		Scanner in = new Scanner(System.in);
		x = in.nextInt();//5
		y = in.nextInt();//10
		z = in.nextInt();//15
		if (x > y && x > z)
			System.out.println("First number is largest.");
		else if (y > x && y > z)
			System.out.println("Second number is largest.");
		else if (z > x && z > y)
			System.out.println("Third number is largest.");
		else
			System.out.println("Entered numbers are not distinct.");
	}
}

	


