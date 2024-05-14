package myCodes;

/** class - blueprint
 *  it will have methods and variables(data members) in it 
 *  
 *  object - physical entity that follows blueprint
 *  use: can able to access methods and properties of class
 */

class DemoofClass{ // class 1
	// class = data members(variable) + methods
	String furnitureName;   // data members
	long furniturePrice;
	
	void details() { // methods
		System.out.println("Furniture Name : " + furnitureName);
		System.out.println("Furniture price : " + furniturePrice);
	}

public class Class_and_Objects { // class 2
	public static void main(String[] args) {
		DemoofClass d1 = new DemoofClass();// object to access methods and data members from a class
		d1.furnitureName = "bed"; // accessing data member
		d1.furniturePrice =25000l;
		DemoofClass d2 = new DemoofClass();
		d2.furnitureName = "table";
		d2.furniturePrice = 15000;
		d1.details(); // method call 
		d2.details();
	}
}
}
