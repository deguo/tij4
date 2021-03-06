package ch03operators;

import static commons.util.Print.*;

/**
 * Demonstrates the ++ and -- operators.
 * 
 * <pre>
 * Output:
 * i : 1
 * ++i : 2
 * i++ : 2
 * i : 3
 * --i : 2
 * i-- : 2
 * i : 1
 * </pre>
 */

public class D06_AutoInc {
	public static void main(String[] args) {
		int i = 1;
		print("i : " + i);
		print("++i : " + ++i); // Pre-increment
		print("i++ : " + i++); // Post-increment
		print("i : " + i);
		print("--i : " + --i); // Pre-decrement
		print("i-- : " + i--); // Post-decrement
		print("i : " + i);
	}
}
