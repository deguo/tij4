package ch05initialization;

import java.util.*;
import static commons.util.Print.*;

/**
 * Creating arrays with new.
 * 
 * <pre>
 * Output:
 * length of a = 18
 * [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * </pre>
 */
public class D28_ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		print("length of a = " + a.length);
		print(Arrays.toString(a));
	}
}