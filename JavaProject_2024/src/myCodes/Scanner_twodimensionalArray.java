package myCodes;

import java.util.Scanner;

public class Scanner_twodimensionalArray {

	public static void main(String[] args) {
		
		/** printing empty string based on user given rows and columns size.
		 * 	Things to remember:
		 *  Array is an object so its default value is 0 --- printing 0
		 *  output:
		 *  enter no of rows
			2
			enter no of columns
			2
			0 0 
			0 0 
		 */
//		Scanner sc = new Scanner(System.in); // declaring scanner
//		System.out.println("enter no of rows"); 
//		int row = sc.nextInt(); // getting user input for row size
//		System.out.println("enter no of columns");
//		int col = sc.nextInt(); // getting user input for column size
//		
//		int a[][] = new int[row][col]; // initialization of array and storing user inputs of row and column in to an array
//		for(int i = 0; i<a.length; i++) { // loop for  rows
//			for(int j = 0; j<a[i].length; j++) { // loop for columns
//				System.out.print(a[i][j] + " "); // printing row and column with space
//			}
//			System.out.println();// making new line to print values in a table structure
//		}
		
		
		/** printing values from user input to an array
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int row = sc.nextInt();
		System.out.println("enter no of columns");
		int col = sc.nextInt();
		
		int a[][] = new int[row][col];
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length;j++) {
				System.out.println("Enter value for row" + i + " and " + "column" + j + " ");
				a[i][j] = sc.nextInt(); // getting user input for values in an array
			}
		}
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
