package ch15generics;

import java.util.*;

/**
 * Autoboxing compensates for the inability to use primitives in generics.
 * 
 * <pre>
 * Output:
 * 0 1 2 3 4
 * </pre>
 */

public class D55_ListOfInt {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++)
			li.add(i);
		for (int i : li)
			System.out.print(i + " ");
	}
}