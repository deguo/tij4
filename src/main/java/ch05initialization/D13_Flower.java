package ch05initialization;

import static commons.util.Print.*;

/**
 * Calling constructors with "this"
 * 
 * <pre>
 * Output:
 * Constructor w/ int arg only, petalCount= 47
 * String & int args
 * default constructor (no args)
 * petalCount = 47 s = hi
 * </pre>
 */
public class D13_Flower {
	int petalCount = 0;
	String s = "initial value";

	D13_Flower(int petals) {
		petalCount = petals;
		print("Constructor w/ int arg only, petalCount= " + petalCount);
	}

	D13_Flower(String ss) {
		print("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}

	D13_Flower(String s, int petals) {
		this(petals);
		// ! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		print("String & int args");
	}

	D13_Flower() {
		this("hi", 47);
		print("default constructor (no args)");
	}

	void printPetalCount() {
		// ! this(11); // Not inside non-constructor!
		print("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		D13_Flower x = new D13_Flower();
		x.printPetalCount();
	}
}