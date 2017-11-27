package ch15generics;

/**
 * <pre>
 * Output:
 * DerivedGS.set(Derived)
 * GenericSetter.set(Base)
 * </pre>
 */

class GenericSetter<T> { // Not self-bounded
	void set(T arg) {
		System.out.println("GenericSetter.set(Base)");
	}
}

class DerivedGS extends GenericSetter<Base> {
	void set(Derived derived) {
		System.out.println("DerivedGS.set(Derived)");
	}
}

public class D74_PlainGenericInheritance {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs = new DerivedGS();
		dgs.set(derived);
		dgs.set(base); // Compiles: overloaded, not overridden!
	}
}