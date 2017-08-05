package ch03operators.exercise;

import static net.mindview.util.Print.*;

/**
 * Exercise 2
 * 
 * <pre>
 * Create a class containing a float and use it to
 * demonstrate aliasing.
 * Output:
 * 1: n1.f: 9.0, n2.f: 47.0
 * 2: n1.f: 47.0, n2.f: 47.0
 * 3: n1.f: 27.0, n2.f: 27.0
 * </pre>
 */
class Integral {
	float f;
}

public class E02_Aliasing {
	public static void main(String[] args) {
		Integral n1 = new Integral();
		Integral n2 = new Integral();
		n1.f = 9f;
		n2.f = 47f;
		print("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
		n1 = n2;
		print("2: n1.f: " + n1.f + ", n2.f: " + n2.f);
		n1.f = 27f;
		print("3: n1.f: " + n1.f + ", n2.f: " + n2.f);
	}
}