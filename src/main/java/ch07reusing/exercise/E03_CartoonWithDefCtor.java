package ch07reusing.exercise;

import static commons.util.Print.print;

/**
 * Exercise 3
 * 
 * <pre>
 * Even if you don't create a constructor for
 * Cartoon(), the compiler will synthesize a
 * default constructor that calls the base-class
 * constructor. Prove that assertion.
 *
 * Output:
 * Art constructor
 * Drawing constructor
 * </pre>
 */
class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

class CartoonWithDefCtor extends Drawing {
	// ! CartoonWithDefCtor() {
	// ! System.out.println("CartoonWithDefCtor constructor");
	// ! }
}

public class E03_CartoonWithDefCtor {
	public static void main(String args[]) {
		new CartoonWithDefCtor();
	}
}