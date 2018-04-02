package ch15generics;

public class D68_NotSelfBounded<T> {
	T element;

	D68_NotSelfBounded<T> set(T arg) {
		element = arg;
		return this;
	}

	T get() {
		return element;
	}
}

class A2 extends D68_NotSelfBounded<A2> {
}

class B2 extends D68_NotSelfBounded<A2> {
}

class C2 extends D68_NotSelfBounded<C2> {
	C2 setAndGet(C2 arg) {
		set(arg);
		return get();
	}
}

class D2 {
}

// Now this is OK:
class E2 extends D68_NotSelfBounded<D2> {
}