package ch15generics;

/**
 * <pre>
 * Output:
 * DerivedSetter.set(Derived)
 * OrdinarySetter.set(Base)
 * </pre>
 */
class OrdinarySetter {
	void set(Base base) {
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter {
	void set(Derived derived) {
		System.out.println("DerivedSetter.set(Derived)");
	}
}

public class D72_OrdinaryArguments {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
		ds.set(derived);
		ds.set(base); // Compiles: overloaded, not overridden!
	}
}