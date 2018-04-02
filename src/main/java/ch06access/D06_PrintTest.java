package ch06access;

import static commons.util.Print.*;

/**
 * Uses the static printing methods in Print.java.
 * 
 * <pre>
 * Output:
 * Available from now on!
 * 100
 * 100
 * 3.14159
 * </pre>
 */
public class D06_PrintTest {
	public static void main(String[] args) {
		print("Available from now on!");
		print(100);
		print(100L);
		print(3.14159);
	}
}