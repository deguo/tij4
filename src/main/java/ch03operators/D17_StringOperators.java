package ch03operators;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * x, y, z 012
 * 0 x, y, z
 * x, y, z (summed) = 3
 * 0
 * </pre>
 */
public class D17_StringOperators {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		print(s + x + y + z);
		print(x + " " + s); // Converts x to a String
		s += "(summed) = "; // Concatenation operator
		print(s + (x + y + z));
		print("" + x); // Shorthand for Integer.toString()
	}
}
