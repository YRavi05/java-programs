package myCodes;

import java.util.Iterator;

public class Arrays {

	public static void main(String[] args) {
		/** Array : used to store multiple elements
		 * avoids multiple variable creation and printing statements
		 * array is an object bcoz we use new keyword to create array
		 * 
		 * rules: 1. can only store homogeneous data type elements 
		 * example only int, or only string, or only decimal values
		 * 2. size is fixed and should known in advance
		 * 3. can access array elements through array index
		 * 
		 * Declaration:
		 * int a[] = new int[5];
		 */
		
		int[] a = new int[]{1,2,3,4,5};
		
		for(int i =0; i<a.length;i++) { // we can't give i<=a.length here as index starts from 0 length starts from 1
			System.out.println(a[i]);
		}
		
		String[] b = {"a","b","c"};
		
		for(int j =0; j<b.length; j++) { // i =0 why not i=1 if i=1 it will skip index 0 and length 1 element
			System.out.println(b[j]);
		}
		
		
	}

}
