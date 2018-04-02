package ch15generics;

import java.util.*;

/**
 * <pre>
 * Output:
 * [Hello, Hello, Hello, Hello]
 * </pre>
 */
public class D30_FilledListMaker<T> {
	List<T> create(T t, int n) {
		List<T> result = new ArrayList<T>();
		for (int i = 0; i < n; i++)
			result.add(t);
		return result;
	}

	public static void main(String[] args) {
		D30_FilledListMaker<String> stringMaker = new D30_FilledListMaker<String>();
		List<String> list = stringMaker.create("Hello", 4);
		System.out.println(list);
	}
}