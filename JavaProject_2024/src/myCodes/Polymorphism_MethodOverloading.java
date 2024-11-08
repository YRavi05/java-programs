package myCodes;
		
		/** Ploymorphism:
		 *  same action in multiple ways.
		 *  Types:
		 *  1. Method Over loading - compile time polymorphism - static binding:
		 *  Same method name with different signature of parameters.
		 *  2. Method Overriding - run time polymorphism - Dynamic binding:
		 */

class MethodOverloading{
	int val1;
	double val2;
	int score;
	
	void result() {
		System.out.println("score : " + val1*val2);
	}
	
	void result(int a, int b) {
		val1 = a;
		val1 = b;
		score = a+b;	
		System.out.println("Score 2 : " + score);
	}
	
	void result(double a, double b) {
		val1 = (int) a;
		val2 =  b;
		score = (int) (a-b);
		System.out.println("Score 3 : " + score);
	}

	void result(int a, double b) {
		val1 = a;
		val2 = b;
		score = (int) (a/b);
		System.out.println("Score 4 : " + score);
	}
}

public class Polymorphism_MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.result();
		mo.result(5, 6);
		mo.result(20.7, 5.8);
		mo.result(5, 15.9);
	}

}
