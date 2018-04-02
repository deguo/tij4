package ch15generics;

import java.lang.reflect.*;
import java.util.*;

/**
 * <pre>
 * Output:
 * [null, null, null, null, null, null, null, null, null]
 * </pre>
 */
public class D28_ArrayMaker<T> {
	private Class<T> kind;

	public D28_ArrayMaker(Class<T> kind) {
		this.kind = kind;
	}

	@SuppressWarnings("unchecked")
	T[] create(int size) {
		return (T[]) Array.newInstance(kind, size);
	}

	public static void main(String[] args) {
		D28_ArrayMaker<String> stringMaker = new D28_ArrayMaker<String>(String.class);
		String[] stringArray = stringMaker.create(9);
		System.out.println(Arrays.toString(stringArray));
	}
}