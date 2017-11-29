package ch16arrays;

import java.util.*;

/**
 * Creating multidimensional arrays.
 * 
 * <pre>
 * Output:
 * [[0, 0, 0], [0, 1, 2], [0, 2, 4]]
 * </pre>
 */
public class D09_AssemblingMultidimensionalArrays {
	public static void main(String[] args) {
		Integer[][] a;
		a = new Integer[3][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new Integer[3];
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = i * j; // Autoboxing
		}
		System.out.println(Arrays.deepToString(a));
	}
}