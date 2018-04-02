package ch15generics;

/**
 * <pre>
 * Output:
 * Subtype
 * </pre>
 */

class Subtype extends D65_BasicHolder<Subtype> {
}

public class D65_CRGWithBasicHolder {
	public static void main(String[] args) {
		Subtype st1 = new Subtype(), st2 = new Subtype();
		st1.set(st2);
		Subtype st3 = st1.get();
		st1.f();
	}
}