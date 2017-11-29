package ch16arrays;

import java.util.*;

/**
 * <pre>
 * Output:
 * [[[0, 0, 0, 0], [0, 0, 0, 0]], [[0, 0, 0, 0], [0, 0, 0, 0]]]
 * </pre>
 */

public class D05_ThreeDWithNew {
	public static void main(String[] args) {
		// 3-D array with fixed length:
		int[][][] a = new int[2][2][4];
		System.out.println(Arrays.deepToString(a));
	}
}