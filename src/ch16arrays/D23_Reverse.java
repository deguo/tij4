package ch16arrays;

import java.util.*;
import commons.util.*;
import static commons.util.Print.*;

/**
 * The Collections.reverseOrder() Comparator
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
 * [[i = 98, j = 61], [i = 93, j = 61], [i = 88, j = 28]
 * , [i = 68, j = 0], [i = 61, j = 29], [i = 58, j = 55]
 * , [i = 51, j = 89], [i = 22, j = 7], [i = 20, j = 58]
 * , [i = 16, j = 40], [i = 11, j = 22], [i = 9, j = 78]
 * ]
 * </pre>
 */
public class D23_Reverse {
	public static void main(String[] args) {
		D22_CompType[] a = Generated.array(new D22_CompType[12], D22_CompType.generator());
		print("before sorting:");
		print(Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		print("after sorting:");
		print(Arrays.toString(a));
	}
}