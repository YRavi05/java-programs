package myCodes;
		/** Day 6:
		 *  Inheritance
		 *  Method Overriding
		 *  This Keyword, Final Keyword, Super Keyword
		 *  Static Block
		 *  Methods
		 */
		

		/** Inheritance:
		 *  Accessing Data Members and Methods of a Base class in Sub class
		 *  
		 *  can be achieved by Extends keyword.
		 *  only one object creation is enough that too created in child to access parent and child methods and data members
		 *  
		 *  Types:
		 *  Single --- 1 base 1 sub
		 *  MultiLevel --- 1 grandparent 1 parent 1 child
		 *  Hierarchical --- 1 parent 2 child
		 *  Multiple --- dose not support directly as 2 parent 1 child. interface can achieve this concept in java
		 *  Hybrid --- combination of hierarchical and single. java dose not support this directly
		 */
	

		// Single:
class AParent{ // parent
	int a ;
	void display() {
		System.out.println("display parent");
	}
}

class AChild extends AParent{ // child 
	int b;
	void show() {
		System.out.println("display child");
	}
}

		// Multi Level:
class BGrandP{
	void grandparant() {
		System.out.println("grand parent");
	}
}

class BParent extends BGrandP{ // parent can access grand parent
	void parent() {
		System.out.println("parent");
	}
}

class BChild extends BParent{ // child can access parent as well as grand parent
	void child() {
		System.out.println("child");
	}
}

			//Hierarchical:
class CParent{
	void parent1() {
		System.out.println("only one parent");
	}
}

class CChild1 extends CParent{
	void child1() {
		System.out.println("first child");
	}
}

class CChild2 extends CParent{ // here 2 child can't communicate or access each other methods and data members in any way
	void child2() {
		System.out.println("second child child");
	}
}
public class Inheritance_Concepts_13_05_24 {
			
	public static void main(String[] args) {
		/** Single Main Method
		 * AChild ac = new AChild(); // creation of child object
		 * ac.a = 10; // accessing parent data member
		 * System.out.println(ac.a); 
		 * ac.b = 20; // accessing child data member
		 * System.out.println(ac.b); 
		 * ac.display(); //accessing parent method
		 * ac.show(); //accessing child method
		 */
		
		/** Multi Level Main Method
		 * BChild bc = new BChild(); 
		 * bc.grandparant(); 
		 * bc.parent(); 
		 * bc.child();
		 */
		
		/** Hierarchical Main Method
		 * CChild1 cc1 = new CChild1(); // creation of first child object 
		 * cc1.parent1();
		 * cc1.child1();
		 * 
		 * CChild2 cc2 = new CChild2(); // creation of second child object
		 * cc2.parent1(); 
		 * cc2.child2();
		 */
	}

}
