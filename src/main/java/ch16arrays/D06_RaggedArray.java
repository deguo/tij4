package ch16arrays;

import java.util.*;

/**
 * <pre>
 * Output:
 * [[], [[0], [0], [0, 0, 0, 0]], [[], [0, 0], [0, 0]], [[0, 0, 0], [0], [0, 0, 0, 0]], [[0, 0, 0], [0, 0, 0], [0], []], [[0], [], [0]]]
 * </pre>
 */
public class D06_RaggedArray {
	public static void main(String[] args) {
		Random rand = new Random(47);
		// 3-D array with varied-length vectors:
		int[][][] a = new int[rand.nextInt(7)][][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[rand.nextInt(5)][];
			for (int j = 0; j < a[i].length; j++)
				a[i][j] = new int[rand.nextInt(5)];
		}
		System.out.println(Arrays.deepToString(a));
	}
}