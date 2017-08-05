package ch03operators.exercise;

import static net.mindview.util.Print.*;

/**
 * Exercise 8
 * 
 * <pre>
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results.
 * Output:
 * l1: 101111
 * l2: 101111
 * l3: 1111111
 * </pre>
 */
public class E08_LongLiterals {
	public static void main(String[] args) {
		long l1 = 0x2f; // Hexadecimal (lowercase)
		print("l1: " + Long.toBinaryString(l1));
		long l2 = 0X2F; // Hexadecimal (uppercase)
		print("l2: " + Long.toBinaryString(l2));
		long l3 = 0177; // Octal (leading zero)
		print("l3: " + Long.toBinaryString(l3));
	}
}