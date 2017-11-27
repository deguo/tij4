package ch15generics;

public class D38_GenericArray<T> {
	private T[] array;

	@SuppressWarnings("unchecked")
	public D38_GenericArray(int sz) {
		array = (T[]) new Object[sz];
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	// Method that exposes the underlying representation:
	public T[] rep() {
		return array;
	}

	public static void main(String[] args) {
		D38_GenericArray<Integer> gai = new D38_GenericArray<Integer>(10);
		// This causes a ClassCastException:
		// ! Integer[] ia = gai.rep();
		// This is OK:
		Object[] oa = gai.rep();
	}
}