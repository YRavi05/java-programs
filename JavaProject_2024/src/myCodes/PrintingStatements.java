package myCodes;

public class PrintingStatements {
	public static void main(String[] args) {
		System.out.println("Mini");// print and comes to next line
		System.out.print("Yamini");// print and staying in smae time
		/** for System.out.printf(); -----> we have to use type specifier or control statement
		 * here for whole number primitive data types type specifier would be %d
		 * for float and double we have %f type specifier
		 * must to note: we should give type specifier into double quotes like "%d" 
		 * also we have to give comma , between type specifier and variable
		 */
		int a = 5;
		double b =99.0;
		System.out.printf("%d", a);// works like print but requires type specifier
		System.out.println(" ");
		System.out.printf("%f", b);
	}
}
