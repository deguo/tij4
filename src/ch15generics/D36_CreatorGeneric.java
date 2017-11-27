package ch15generics;

/**
 * <pre>
 * Output:
 * X
 * </pre>
 */
abstract class GenericWithCreate<T> {
	final T element;

	GenericWithCreate() {
		element = create();
	}

	abstract T create();
}

class X {
}

class Creator extends GenericWithCreate<X> {
	X create() {
		return new X();
	}

	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}

public class D36_CreatorGeneric {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}