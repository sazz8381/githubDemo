package pasha;

public class SwitchExample {
	
	public static void main(String[] args) {
		SwitchExample Switch = new SwitchExample();
		Switch.switchTest();
		}
	public void switchTest() {
		int a = 4;
		switch(a){
		case 1:{
			System.out.println("value of A is: 1");
			break;
		}
		case 2:{
			System.out.println("value of B is: 2");
			break;
		}
		case 3:{
			System.out.println("value of C is: 3");
			break;
		}
		case 4:{
			System.out.println("value of D is: 4");
			break;
		}
		case 5:
		default:{
			System.out.println("The value is not defined");
			break;
		}
		}
	}
}
