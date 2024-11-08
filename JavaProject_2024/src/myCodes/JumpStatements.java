package myCodes;

public class JumpStatements {

	public static void main(String[] args) {
		/** jump statements:
		 *  break and continue
		 *  used in for loop and to give condition we can use if
		 *  break: once control or loop reach break it will come out of entire loop
		 *  continue: once control or loop reach continue it will only skip the current iteration 
		 */
		
		// break example:
		
		for(int a = 1; a<=5; a++) {
			if(a==3) {
				break; // will terminate entire loop if a = 3 so execute loop twice only
			}
			System.out.println("greetings "+a);
		}
		
		for(int b = 1; b<=5; b++) {
			if(b==3) {
				continue; // skip iteration if b = 3 except 3, 1245 executes.
			}
			System.out.println("smile " +b);
		}
	}

}
