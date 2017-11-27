package ch15generics;

import java.lang.reflect.*;

public class D40_GenericArrayWithTypeToken<T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public D40_GenericArrayWithTypeToken(Class<T> type, int sz) {
		array = (T[]) Array.newInstance(type, sz);
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	// Expose the underlying representation:
	public T[] rep() {
		return array;
	}

	public static void main(String[] args) {
		D40_GenericArrayWithTypeToken<Integer> gai = new D40_GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		// This now works:
		Integer[] ia = gai.rep();
	}
}