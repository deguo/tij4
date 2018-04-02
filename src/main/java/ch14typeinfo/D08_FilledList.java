package ch14typeinfo;

import java.util.*;

/**
 * <pre>
 * Output:
 * [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
 * </pre>
 */

class CountedInteger {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return Long.toString(id);
	}
}

public class D08_FilledList<T> {
	private Class<T> type;

	public D08_FilledList(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++)
				result.add(type.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static void main(String[] args) {
		D08_FilledList<CountedInteger> fl = new D08_FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
}