package myCodes;

public class ArithmeticOperators_and_TypeCasting {
	
	/** Day 2 ---- 9.5.2024
	 *  Arithmetic Operators, Class and Objects, Control Statements (if, if else, else if ladder, nested if, switch)
	 *  Loops (for, while, do while)
	 *  Jump Statements (break, continue, default)
	 *  Scanner, command line arguments (int a = Integer.parseInt(args[0])), java filename value of variable (ex  java Mini 5)
	 *  Arrays , Array inputs from user using scanner
	 */

	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int f = a/b; // Quotient
		int g = a%b; // reminder
		System.out.println("addition: " + c);
		System.out.println("Subtraction: " + d);
		System.out.println("multiplication: " + e);
		System.out.println("division: " + f);
		System.out.println("modulus: " + g);
		
		float h = (float)a/b; // Type Casting
		System.out.println("typecasting: " + h);
		
		/** PreIncreament ++n PostIncreament n++, PreDecrement --n and PostDecrement n--
		 * ++n will add +1 to n then print n
		 * n++ will print n and then add+1 to n
		 * --n will minus -1 from n then print n
		 * n-- will print n first then minus -1 from n
		 */
		
		int n = 5;
		int poin = n++; 
		System.out.println("n++ " +poin); //5
		System.out.println(n); //6
		
		int prein = ++n;
		System.out.println("++n " +prein);// 7
		System.out.println(n);// 7
		
		int podec = n--;
		System.out.println("n-- " +podec);// 7
		System.out.println(n); //6
		
		int predec = --n;
		System.out.println("--n " +predec); //5
		System.out.println(n);	//5
	}

}
