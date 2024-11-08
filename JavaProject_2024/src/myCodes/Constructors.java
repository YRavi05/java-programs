package myCodes;
 				
public class Constructors {
	/** Constructor:
	 * 	constructor is similar to method but have no return type
	 * 	constructor name should be as same as class name
	 * 	constructor used to allocate memory and initialize object
	 * 
	 *  constructor types: default and parameterized constructor, default constructor will not have parameters
	 *  it will execute at the time of object creation even if we have default constructor created or not. 
	 *  if created then executes and print else it will allocate memory to the variables created in class.
	 *  we can initialize variables inside constructor if we have variables declared inside class
	 *  if default constructor created explicitly by user and it is parameterized then we should pass values inside constructor while object creation
	 *  
	 *  Constructor Overloading:
	 *  same constructor name but we have to differentiate it with parameters
	 *  Example: abcd() - default, abcd(int a, int b) - parameterized, abcd(double a, double b), abcd(int a, int b, int c)
	 *  but we have to create objects and methods as same no of constructors created to execute constructors. 
	 *  single constructor will execute only one constructor so we have to create objects irrespective of constructors created
	 *  
	 *  note:
	 *  local variable only can access inside methods, variables created inside constructor will not access inside method
	 *  parameters should be same data type either int a, int b or float a, float b, or double a, double b
	 *  methods also we have to create irrespective of no of constructors created
	 */
	
	
	int n1; // instance variable (or) global, class variable . variable declaration
	int n2;
	int result;
	
	double l;
	double k;
	double score;
	
	Constructors(int a, int b){ // parameterized constructor. parameters a and b
		n1 = a; // storing a in n1
		n2 = b; // storing b in n2
	}
	
	Constructors(){
		System.out.println("Constructor overloading");
	}
	
	Constructors(double c, double d){
		l = c;
		k = d;
	}
	void show() { // method
		result = n1+n2; //storing sum of n1 and n2 in result
		System.out.println("Result : " +result );
	}
	
	void score() {
		score = l+k;
		System.out.println("score : " + score);
	}

	public static void main(String[] args) {
		Constructors c = new Constructors(20, 900);// passing value because default constructor created above and passed parameters
		c.show(); // method calling
		Constructors c1 = new Constructors(2.5,4.90);
		c1.score();
	}

}
