package ch17containers;

import java.util.*;
import commons.util.*;

/**
 * <pre>
 * Output:
 * [strange, women, lying, in, ponds, distributing, swords, is, no, basis, for, a, system, of, government]
 * </pre>
 */

class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds " + "distributing swords is no basis for a system of "
			+ "government").split(" ");
	private int index;

	public String next() {
		return foundation[index++];
	}
}

public class D02_CollectionDataTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(), 15));
		// Using the convenience method:
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}