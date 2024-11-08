package myCodes;

public class DataTypes {
	
	public static void main(String[] args) {
		byte a = 127;
		short b = 3567;
		int c = 567890012;
		long d = 1234567890123456789l;
		float e = 5.6f;
		double f = 5.6;
		/** difference between float and double is precision of values after. 
		 * eg 10/3 will give 3.33333333 in float
		 * 10/3 will give 3.3333333333333333 in double
		 */
		char g = 'a';
		/** default value of boolean is false.
		 */
		boolean h = true;
		
		System.out.println("byte  :" + a);
		System.out.println("short  :" + b);
		System.out.println("int  :" + c);
		System.out.println("long  :" + d);
		System.out.println("float  :" + e);
		System.out.println("double  :" + f);
		System.out.println("char  :" + g);
		System.out.println("boolean  :" + h);
	}

}
