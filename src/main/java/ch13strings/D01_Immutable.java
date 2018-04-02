package ch13strings;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * howdy
 * HOWDY
 * howdy
 * </pre>
 */
public class D01_Immutable {
	public static String upcase(String s) {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q = "howdy";
		print(q); // howdy
		String qq = upcase(q);
		print(qq); // HOWDY
		print(q); // howdy
	}
}