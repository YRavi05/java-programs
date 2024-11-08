package myCodes;

import java.util.Iterator;
		/** Day 4 - 11.05.24
		 *  Patterns
		 *  constructors
		 */
public class PatternPrograms_11_05 {

		/** Patterns : we use always Nested Loop.
		 *  why: we are printing on pattern multiple time 
		 *  always patters will have rows and columns
		 *  i denotes rows j denotes column in below program
		 *  rows columns index starts from 0 and  length starts from 1
		 *  hence length - 1 = index
		 *  
		 *  Coding Standard:
		 *  we should not use <= or >= in loops we should only use either < or > alone.
		 */
	public static void main(String[] args) {
		// normal square:
		for(int i = 0; i<4; i++) { // row
			for(int j = 0; j<5; j++) { // column
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("hollow sqaure");
		
		/** hollow square will have pattern from 0th row to last row
		 *  0th column to last column
		 *  * * * ----> 0 row 0 column will be like 0row ==0, 0column == 0.
		 	*   *
			* * *
			last row and last column
			so last row and last column will be like lastrow == no of rows -1, lastcol == no of columns -1.
			
			why we are using OR condition here is either one condition should be true then it will print * else it will print empty space
		 */	
		
		int row = 5;
		int column = 6;
		for(int k = 0; k<row; k++) {
			for(int l = 0; l<column; l++) {
				if(k==0 || k==row-1 || l==0 || l==column-1) {
					System.out.print("*"); // if above condition true then it will print * when either row or column should be 0 or row -1
				}
				else {
					System.out.print(" "); // if condition fails 
					//example l==1 or l==2... k==1, k==2... until column or rows length becoming true it will print space
				}
			}
			System.out.println();
		}
		/** *
		 *  * * 
		 *  * * *
		 *  here we know row no' and that is constant in loop 
		 *  we have no idea about columns no's so no of column depends o row no'
		 *  condition like j<=i 
		 */	
		System.out.println();
		int c1 = 3;
		for(int a=0; a<=c1; a++) {// 0,1,2,3 
			for(int b =0; b<=a; b++) { //if b<=a then 0<=0 -> true, 1<=0 - false(exits loop and goes to outer loop) now 0<=1 -> true like wise it wil print above pattern if we want to print numbers instead of * we can print b
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
