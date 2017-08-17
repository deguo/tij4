package ch03operators;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * 900
 * 100
 * 900
 * 100
 * </pre>
 */
public class D16_TernaryIfElse {
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}

	static int standardIfElse(int i) {
		if (i < 10)
			return i * 100;
		else
			return i * 10;
	}

	public static void main(String[] args) {
		print(ternary(9));
		print(ternary(10));
		print(standardIfElse(9));
		print(standardIfElse(10));
	}
}
