package myCodes;
			/** VARARGS: Variable length arguments
			 * 	it will accept 0 to more values.
			 *  and it will work like an array.it's variable will have elements like an array iterate in for each loop.
			 *  as because we varargs working like an array we have to use for each loop here.
			 *  it will consider last value as varargs. if we pass some other variable that should give before varargs. 
			 *  it will assign first value in add method taken by first variable.
			 *  Syntax: public int add(int ... a){ }
			 *  Rule: varargs should be last parameter of method.
			 *  purpose: it will reduce method creation multiple times as method overloading as we are performing operations
			 */
public class Variable_length_Arguments {
			int sum; // instance variable should be declared in varargs here we haven't initialize sum so sum = 0.
		public int add(int ... a) {
			 for(int val:a)
				 sum = sum + val; // here input values in main method starts from 3 assigning to val and it will added to sum 
			 					  // 0=3 = 3, again 4 will assign to val so sum now = 3 , sum = sum+ val so 3 +4 = 7
				 return sum;
		}
	public static void main(String[] args) {
		Variable_length_Arguments va = new Variable_length_Arguments();
		int c = va.add(3,4);
		System.out.println(c);
	}

}
