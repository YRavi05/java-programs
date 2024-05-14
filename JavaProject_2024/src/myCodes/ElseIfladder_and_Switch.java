package myCodes;

public class ElseIfladder_and_Switch {

	public static void main(String[] args) {
		/** else if ladder we can use if we have multiple choices
		 * first if true it will skip remaining options 
		 * first if false it will skip first if and goes to else if
		 * all if and else if ---> false , else will execute directly
		 * Example comparison of two numbers
		 */
		
		// else if ladder
		/**int a = 10;
		int b = 10;
		if(a>b) {
			System.out.println("a is greater than b is true");
		}
		else if(a<b) {
			System.out.println("b is greater than a is true");
		}
		else if(a!=b) {
			System.out.println(" a is not equal to b");
		}
		else {
			System.out.println("a is equal to b");
		}*/
		
		
		/** Switch statement:
		 * switch will check for multiple options 
		 * consider we have switch board having 5 switches , we have each switch for each specific operations
		 * so which switch we are going to turn on it will do the corresponding work
		 */
		
		String switchBoard= "fan";
		switch(switchBoard) {
		case "tube light":
			System.out.println("tub light on");
			break; // is important if we  want to skip other cases to be executed
		case "fan":
			System.out.println("fan on");
			break;
		case "night lamp":
			System.out.println("night lamp on");
			break;
		case "charger":
			System.out.println("charger on");
		default: // default will execute if all cases not met the requirement
			System.out.println("power off");
		}
		System.out.println("switch worked");
	}
	

}
