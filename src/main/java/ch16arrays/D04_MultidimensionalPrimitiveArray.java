package ch16arrays;

import java.util.*;

/**
 * Creating multidimensional arrays.
 * 
 * <pre>
 * Output:
 * [[1, 2, 3], [4, 5, 6]]
 * </pre>
 */
public class D04_MultidimensionalPrimitiveArray {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, }, { 4, 5, 6, }, };
		System.out.println(Arrays.deepToString(a));
	}
}