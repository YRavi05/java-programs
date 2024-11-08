package myCodes;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		/** scanner class belongs to java.util.Scanner
		 * scanner will require input stream that is in from System class(System.in) while creating object of scanner
		 * scanner class require object
		 * scanner class have methods regards data type
		 * for printing char value we have to use next(). charAt(0) method
		 * scanner has resource that is object of scanner so we have to close resource the method is s.close();
		 * 
		 * difference between next and nextLine method is:
		 * next will ignore words after space in a string
		 * nextLine will consider space and prints the entire string
		 */
		
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter name : ");
//		String name = s.next();
//		System.out.println(name);
//		
//		System.out.println("Enter Age :");
//		int age = s.nextInt();
//		System.out.println(age);
//		
//		System.out.println("enter grade :");
//		char grade = s.next().charAt(2);
//		System.out.println(grade);
//		
//		System.out.println("enter address :");
//		String address = s.nextLine();
//		System.out.println(address);
//		
		/** scanner code to get input for array
		 */
		//way 1:
//		Scanner s1 = new Scanner(System.in);
//		int[] a = new int[5];
//		a[0] = s1.nextInt();
//		a[1] = s1.nextInt();
//		a[2] = s1.nextInt();
//		a[3] = s1.nextInt();
//		a[4] = s1.nextInt();
//		
//		for(int i = 0; i<a.length; i++){
//		    System.out.println(a[i]);
//		}
		
		//way 2:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int n = sc.nextInt();// length of array n=6
		System.out.println("enter values "+ n);
		int[] a = new int[n]; // new array creation with array length n
		for(int i=0; i<n; i++) // creating i variable for iteration and storing values
		{
			a[i] = sc.nextInt(); //getting input a[0],a[1],a[2],a[3]...a[5] will breaks loop
		}
		for(int i=0; i<n; i++) // till length n we can print array value
		{
		System.out.println(a[i]);// printing array
		}
	}

}
