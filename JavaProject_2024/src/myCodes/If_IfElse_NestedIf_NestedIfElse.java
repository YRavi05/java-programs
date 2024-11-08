package myCodes;

public class If_IfElse_NestedIf_NestedIfElse {

	public static void main(String[] args) {
		/** Conditional statements
		 * If only have the condition else will not have condition
		 * Syntax: if() {
		 * } 
		 * else{
		 * }
		 * Simple if will have if block only ----> if() {}
		 * 
		 * if else (only 2 possibilities (this or that) eg. even or odd, eligible or not eligible to vote):
		 * if else will have if and else block ---> if() {} else{ } 
		 * 
		 * nested if and nested if else will have multiple possibilities means outer if and inner if should be true
		 * and it will have outer if and inner if also outer else inner else
		 * example: student should have been passed in exams (mark>=35) also he should have scored more than 80 (mark>=80)
		 * if preliminary condition passed then it will check inner if is true else inner else will execute
		 * if outer if is not true then outer else will get execute.
		 */
		
		//simple if
		/**
		 * int a = 5; 
		 * int b = 6; 
		 * if(a<=b)
		 *  {
		 *   System.out.println("True");
			}
		 */
		
		// if else odd or even
		/**
		 * int num = 5;
		 *  if(num%2==0) 
		 *  { System.out.println("even"); 
		 *  } else {
		 * System.out.println("odd"); }
		 */
		
		//nested if and nested if else
		int mark; // first have to declare because we are going to use this variable multiple time so not provided data
		mark= 30;
		if(mark>=35) { // outer if(preliminary condition) --> true will go inner if 
			System.out.println("passed");
			if(mark>=80) { //inner if ---> true execute if block else inner else will execute
				System.out.println("eligible");
			}
			else { // inner else ---> inner if true (skip) not true (execution)
				System.out.println("passed but not eligible");
			}
		} // outer if block endds here
		else { //outer else if outer if not true
			System.out.println("not passed");
		}
		
	}

}
