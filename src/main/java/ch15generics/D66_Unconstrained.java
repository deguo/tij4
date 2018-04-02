package ch15generics;

/**
 * <pre>
 * Output:
 * Other
 * </pre>
 */

class Other {
}

class BasicOther extends D65_BasicHolder<Other> {
}

public class D66_Unconstrained {
	public static void main(String[] args) {
		BasicOther b = new BasicOther(), b2 = new BasicOther();
		b.set(new Other());
		Other other = b.get();
		b.f();
	}
}