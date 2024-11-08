package myCodes;

public class TwoDimensionalArray_10_05_24 {
			/** Day 3 ---- 10.05.2024
			 * 	Two Dimensional or multidimensional array.
			 * 	User input for two dimensional Array -- Scanner_twodimensionalArray
			 *  for each loop
			 *  jagged array
			 */
	public static void main(String[] args) {
		
		/** Array of Arrays - each array element will hold by an array - {{1,2,3},{4,5,6},{7,8,9}} 
		 * 	Dimensional Array will be in Table format
		 * 			Column1		column2		column3
		 * 	row1		1			2			3  --- a[0][0] = 1, a[0][1] = 2, a[0][2] = 3
		 * 	row2		4			5			6  --- a[1][0] = 4, a[1][1] = 5, a[1][2] = 6
		 * 	row3		7			8			9  --- a[2][0] = 7, a[2][1] = 8, a[2][2] = 9
		 * 
		 *  int a[][] = new int[3][3] --- first [] is row, second [] is column. 3 denotes size of row and column
		 *  
		 *  if we give input beyond size is will throw ArrayIndexOutOfBoundException
		 *  
		 *  rows & column are matrices, we can perform add, multiple, transpose, diagonal element sum operations.
		 *  
		 *  Things to keep in mind:
		 *  1. Prints: a[i][j] ---> two dimensional array (example ; a[0][0], a[0][1], a[0][2]....) a[i] fixed till length exceeds, a[j] will change accordingly
		 *  	a[i] - Row, a[j] - column
		 *  
		 *  2. outer for loop for rows, and inner for loop for columns i<a.length --- outer loop, j<a[i].length --- inner loop
		 *  	j<a[i].length --- here a[i] is a[0] (checks first index of row that is 1 in an above array )
		 *  
		 *  3. outer loop will be constant till length of row exceeds it will check with inner loop as it is not constant --- 0, 1, 2
		 *  	checks like 0,1, 0,2, 0,3
		 *  
		 *  4. inner loop will execute first as it is checking by changing column value (as per value in index). 
		 *  	if length will exceed (condition j<a[i].length) and it term loop goes back to outer loop.
		 *  	(example: 0<3 true, 1<3 true, 2<3 true, 3<3 false --termination will happen)
		 *  
		 *  5. index starts from 0, length starts from 1. if length = 3 index will be 0,1,2 length will be 1,2,3
		 *  
		 *  6. syso(a[i][j]) - print array values line by line in console. syso.print(a[i][j]+ " ") - print array values side by side
		 *  	outside inner loop and inside outer loop syso()--- empty printing statement - prints array values like table in console. as new line created.
		 *  	here 3<3 in inner loop exceeds so it is moving to outer loop. syso of outer loop is creating new line then going inside inner loop by checking condition printing values till length exceed and comes to outer print.
		 *  
		 *  7. why inner loop --- it is tow dimensional array outer loop points row, inner points column
		 *  
		 *  8. for(int i = 0) we have to give 1 if it is only finding max of array
		 */
			
		//simple Array:
		
		//int a[][] = new int[3][3]; // array declaration with size
		// System.out.println(a[0][0]); // printing a[0]row [0]column
		int a [][] = {{1,2,3},{4,5,6},{7,8,9}}; // array declaration with value denotes size
		for(int i = 0;i<a.length;i++) {
			for(int j = 0; j<a[i].length; j++) {
				//System.out.println(a[i][j]);// prints line by line
				System.out.print(a[i][j] +" ");// print side by side with space coz we used print only and space
			}
			System.out.println(); // prints array in table structure by creating new line. 
			
		}
	}

}
