package myCodes;

import java.util.Scanner;

public class JaggedArray {

	public static void main(String[] args) {
		/** Jagged Array:
		 *  no of columns of each row will not be same
		 *  Example: 2, 3
		 *  		 4, 5, 6
		 *  will have rows and columns like two dimensional array
		 *  we are iterating i only so we can check i length so j<a[i].length not j<a[0].length
		 *  
		 *  if we know the row size and not known the column size we have to create each row as an individual object like:
		 *  a[0] = new int[2]; a[1] = new int[4];
		 */
		
		// simple Jagged Array
		
		int a[][] = {{1,2},{3,4,5}};
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		//Jagged Array Using Scanner

		int b[][] = new int[4][];// row length is constant, column length is changing as per our wish
		b[0] = new int[2];// column 0 will have 2 elements
		b[1] = new int[3];
		b[2] = new int[1];
		b[3] = new int[5];
		
		Scanner s = new Scanner(System.in);
		for(int k = 0; k<b.length; k++) {
			for(int l = 0; l<b[k].length; l++) {
				System.out.println("enter row " + k + " and "+ l +" column");
				b[k][l]= s.nextInt();
			}
		}
		for(int k = 0; k<b.length; k++) {
			for(int l = 0; l<b[k].length; l++) {
				System.out.print(b[k][l] + " ");
			}
			System.out.println();
		}
	}

}
