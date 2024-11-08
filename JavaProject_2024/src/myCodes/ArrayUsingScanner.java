package myCodes;

import java.util.Scanner;

public class ArrayUsingScanner {

	public static void main(String[] args) {
		int[] a = new int[5]; // declaration of array
		Scanner s = new Scanner(System.in); // scanner initialization
		System.out.println("enter array values");
		for(int i =0; i<a.length; i++) { // starting iteration to get user input till array length
			a[i] = s.nextInt(); // input from user
			//System.out.println(a[i]);// it will print after immediately input given by user
		}
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int max = a[0]; // --- assuming 0 index value is maximum
		for(int j = 1; j<a.length;j++) { // --- why int j = 1 (because we assumed 0 index has maximum value so we are comparing that to other index values
			if(max<a[j]) {
				max = a[j];// assigning maximum number to variable max
			}
		}
		System.out.println("maximum number is : " +max);
	}
}
