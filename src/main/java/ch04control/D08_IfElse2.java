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
public class D08_IfElse2 {
	static int test(int testval, int target) {
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0; // Match
	}

	public static void main(String[] args) {
		print(test(10, 5));
		print(test(5, 10));
		print(test(5, 5));
	}
}