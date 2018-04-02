package ch16arrays;

import java.util.*;
import commons.util.*;
import static commons.util.Print.*;

/**
 * Implementing Comparable in a class.
 * 
 * <pre>
 * Output:
 * before sorting:
 * [[i = 58, j = 55], [i = 93, j = 61], [i = 61, j = 29]
 * , [i = 68, j = 0], [i = 22, j = 7], [i = 88, j = 28]
 * , [i = 51, j = 89], [i = 9, j = 78], [i = 98, j = 61]
 * , [i = 20, j = 58], [i = 16, j = 40], [i = 11, j = 22]
 * ]
 * after sorting:
 * [[i = 9, j = 78], [i = 11, j = 22], [i = 16, j = 40]
 * , [i = 20, j = 58], [i = 22, j = 7], [i = 51, j = 89]
 * , [i = 58, j = 55], [i = 61, j = 29], [i = 68, j = 0]
 * , [i = 88, j = 28], [i = 93, j = 61], [i = 98, j = 61]
 * ]
 * </pre>
 */
public class D22_CompType implements Comparable<D22_CompType> {
	int i;
	int j;
	private static int count = 1;

	public D22_CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}

	public String toString() {
		String result = "[i = " + i + ", j = " + j + "]";
		if (count++ % 3 == 0)
			result += "\n";
		return result;
	}

	public int compareTo(D22_CompType rv) {
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}

	private static Random r = new Random(47);

	public static Generator<D22_CompType> generator() {
		return new Generator<D22_CompType>() {
			public D22_CompType next() {
				return new D22_CompType(r.nextInt(100), r.nextInt(100));
			}
		};
	}

	public static void main(String[] args) {
		D22_CompType[] a = Generated.array(new D22_CompType[12], generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a);
		print("after sorting:");
		print(Arrays.toString(a));
	}
}