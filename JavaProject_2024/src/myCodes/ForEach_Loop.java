package myCodes;

import java.util.Scanner;

public class ForEach_Loop {

	public static void main(String[] args) {
		/** for each loop will not have any condition
		 *  can use it when we wish to print all elements of an array
		 *  can't use it if we wish to print specific elements of an array 
		 *  (Example: only 3 elements in an array to print) ----> to this scenario we can use normal for loop
		 *  for collections we will use for each loop
		 *  we can't use scanner in for each loop so we have to pass array elements while declaration
		 *  for two dimensional array we will use outer and inner for each loop
		 */
		
		//Array:
		int a [] = {1,2,3};
		for(int val : a) {
			System.out.println(val + " ");
		}
		
		//Two Dimensional Array
		System.out.println("two dimensional array");
		int b[][] = {{1,2,3},{4,5,6}};
		for(int arr[] :b) { //storing array b in another array
			for(int val: arr) {
				System.out.print(val+ " ");
			}
			System.out.println();
		}
	}

}
