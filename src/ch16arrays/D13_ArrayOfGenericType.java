package ch16arrays;

/**
 * Arrays of generic types won't compile.
 */
public class D13_ArrayOfGenericType<T> {
	T[] array; // OK

	@SuppressWarnings("unchecked")
	public D13_ArrayOfGenericType(int size) {
		// ! array = new T[size]; // Illegal
		array = (T[]) new Object[size]; // "unchecked" Warning
	}
	// Illegal:
	// ! public <U> U[] makeArray() { return new U[10]; }
}