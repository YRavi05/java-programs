package myCodes;
			/** Day 5: 
			 * Encapsulation
			 * polymorphism
			 * Variable length arguments VARARGS
			 */
class DemoEncapsulation{// class 1 
	/** Encapsulation:
	 * 	Binding Data members and methods into a single entity
	 * 	to implement encapsulation we should use getters and setters
	 * 	best practice to achieve encapsulation always make data members as private and methods as public
	 * 	purpose: we can avoid security issues like user can change actual value of data members so confidential data can be modified and access by someone.
	 * 	get will fetch value we can access. wherein set will update value.
	 */
	
	private int voterId = 3456788;
	
	public int getVoterID() {
		return voterId;
	}
	
	public void setVoterID(int voterId) {// we can use new local variable here in parenthesis or we can use this keyword
		System.out.println("changed Voter Id to ");
		this.voterId = voterId;
	}
}
public class Encapsulation_12_05_24 { // class 2
			
	public static void main(String[] args) {
			DemoEncapsulation de = new DemoEncapsulation();
			de.setVoterID(38576427);
			int val = de.getVoterID();
			System.out.println(val);// or we can use syso(de.getVoterID()) without any variable created like val above;
	}

}
