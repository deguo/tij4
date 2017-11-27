package ch15generics;

class D26_ReturnGenericType<T extends D24_HasF> {
	private T obj;

	public D26_ReturnGenericType(T x) {
		obj = x;
	}

	public T get() {
		return obj;
	}
}