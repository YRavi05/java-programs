package myCodes;
		/** Static:
		 * 	not an object specific
		 * 	static method belongs to class not belongs to object thats why we can't override static
		 * 	non static variable can't be called inside static variable but static variable can called inside non static method
 			Static methods in Java cannot be overridden. This is because static methods are not associated with the instance
		 * 	we can change static variable's value. 
		 * 	it will update the places where we used static variable with the recently changed value
		 * 	static variable or method will not need object to be called. 
		 * 
		 * 	three ways we can write it:
		 * 	s1.teacher ="xyz;
		 * 	student.teacher = "abc;
		 *  or else static block: static{
		 *  string teacher = "mno";
		 *  } --- it will not change value until we made changes in static block 
		 */

class DemoStatic1{
	String name;
	int age;
	static String teacher;
	
	public void show() {
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
		System.out.println("teacher : "+teacher);
	}
	static {
		teacher = "Aslan"; // static block will not require object
	}
}
public class DemoStatic {

	public static void main(String[] args) {
			DemoStatic1 ds = new DemoStatic1();
			ds.name = "Lucy";
			ds.age = 10;
			DemoStatic1 ds1 = new DemoStatic1();
			ds1.name = "Susan";
			ds1.age = 10;
			ds.show();
			ds1.show();
	}

}
