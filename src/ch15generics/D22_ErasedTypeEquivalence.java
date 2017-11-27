package ch15generics;

import java.util.*;

/**
 * <pre>
 * Output:
 * true
 * </pre>
 */
public class D22_ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);
	}
}