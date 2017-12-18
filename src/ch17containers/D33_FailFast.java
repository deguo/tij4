package ch17containers;

import java.util.*;

/**
 * Demonstrates the "fail-fast" behavior.
 * 
 * <pre>
 * Output:
 * java.util.ConcurrentModificationException
 * </pre>
 */
public class D33_FailFast {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try {
			String s = it.next();
		} catch (ConcurrentModificationException e) {
			System.out.println(e);
		}
	}
}