package ch17containers;

import java.util.*;

/**
 * The Collections.fill() & Collections.nCopies() methods.
 * 
 * <pre>
 * Output: (Sample)
 * [StringAddress@82ba41 Hello, StringAddress@82ba41 Hello, StringAddress@82ba41 Hello, StringAddress@82ba41 Hello]
 * [StringAddress@923e30 World!, StringAddress@923e30 World!, StringAddress@923e30 World!, StringAddress@923e30 World!]
 * </pre>
 */
class StringAddress {
	private String s;

	public StringAddress(String s) {
		this.s = s;
	}

	public String toString() {
		return super.toString() + " " + s;
	}
}

public class D01_FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World!"));
		System.out.println(list);
	}
}