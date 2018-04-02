package ch05initialization;

import static commons.util.Print.*;

/**
 * D03_Overloading based on the order of the arguments.
 * 
 * <pre>
 * Output:
 * String: String first, int: 11
 * int: 99, String: Int first
 * </pre>
 */
public class D04_OverloadingOrder {
	static void f(String s, int i) {
		print("String: " + s + ", int: " + i);
	}

	static void f(int i, String s) {
		print("int: " + i + ", String: " + s);
	}

	public static void main(String[] args) {
		f("String first", 11);
		f(99, "Int first");
	}
}