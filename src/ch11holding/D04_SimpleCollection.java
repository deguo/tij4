package ch11holding;

import java.util.*;

/**
 * <pre>
 * Output:
 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
 * </pre>
 */
public class D04_SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			c.add(i); // Autoboxing
		for (Integer i : c)
			System.out.print(i + ", ");
	}
}