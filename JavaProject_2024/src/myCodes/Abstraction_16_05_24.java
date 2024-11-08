package myCodes;
		/** Abstraction
		 *  Inner Class
		 *  Inner class in Abstraction
		 */
abstract class Abs{
	int a;
	int b;
	public abstract void add();
}
class PartialAbs extends Abs{
	public void add() {
		System.out.println(a+b);
	}
}
public class Abstraction_16_05_24 {

	public static void main(String[] args) {
		PartialAbs pa = new PartialAbs();
		pa.add();

	}

}
