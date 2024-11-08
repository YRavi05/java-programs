package myCodes;

public class Loops_or_IterativeStatements {

	public static void main(String[] args) {
		/** for loop: it will execute till the limited condition mentioned in loop (entry check)
		 *  important 3 steps:
		 *  initialization of variable
		 *  condition
		 *  increment or decrement
		 *  a = 0, a<=5 true print a add a+1
		 *  a = 1, a<=5 true print a add a+1...... 2, 3, 4, 5, if 6 condition fail---> loop termed
		 */
		
		for(int a = 0; a<=5; a++) { // a= 0 a less or equal to 5 condition true print a then add a + 1
			System.out.println(a);
		}
		
		/** while loop: works same like for loop (entry check)
		 * syntax: initialization, while(condition){syso} increment or decrement
		 */
		
		int a = 0;
		while(a<=5) {
			System.out.println("welcome " +a);
			a++;
		}
		
		/** do while loop: it will execute first without checking condition (exit check)
		 * example: student allowed to miss id for the first time but not encourage the same second time
		 * syntax: initialization, do block{ syso; increment} while(condition);
		 * (reason for ; after while condition it will not have while block) in do while loop
		 */
		
		int b = 0;
		do {
			System.out.println("allow " + b);
			b++;
		} while(b<=5);
		
	}

}
