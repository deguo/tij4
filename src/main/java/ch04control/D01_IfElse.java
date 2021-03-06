package ch04control;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * 1
 * -1
 * 0
 * </pre>
 */
public class D01_IfElse {
	static int result = 0;

	static void test(int testval, int target) {
		if (testval > target)
			result = +1;
		else if (testval < target)
			result = -1;
		else
			result = 0; // Match
	}

	public static void main(String[] args) {
		test(10, 5);
		print(result);
		test(5, 10);
		print(result);
		test(5, 5);
		print(result);
	}
}