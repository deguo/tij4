package ch03operators.exercise;

import static commons.util.Print.*;

/**
 * Exercise 3
 * 
 * <pre>
 * Create a class containing a float and use it
 * to demonstrate aliasing during method calls.
 * 
 * Output:
 * 1: x.f: 2.0
 * 2: x.f: 1.0
 * </pre>
 */

public class E03_Aliasing2 {
	static void f(Integral y) {
		y.f = 1.0f;
	}

	public static void main(String[] args) {
		Integral x = new Integral();
		x.f = 2.0f;
		print("1: x.f: " + x.f);
		f(x);
		print("2: x.f: " + x.f);
	}
}
