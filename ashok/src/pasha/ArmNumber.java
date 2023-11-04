package pasha;

public class ArmNumber {
	public static void main(String[] args) {
		int num=55, rem, result=0;
		int valuetocheck=num;
		
		while(num != 0) {
			rem = num%10;
			result = (rem*rem*rem)+result;
			num = num/10;
		}
		if(valuetocheck == result) {
			System.out.println("Its Arm Strong Number");
		}
		else {
			System.out.println("Its Not ArmString Number");
		}
		
	}
}
