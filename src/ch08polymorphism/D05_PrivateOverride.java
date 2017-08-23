package ch08polymorphism;

import static commons.util.Print.*;

/**
 * Trying to override a private method.
 * 
 * <pre>
 * Output:
 * private f()
 * </pre>
 */
public class D05_PrivateOverride {
	private void f() {
		print("private f()");
	}

	public static void main(String[] args) {
		D05_PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends D05_PrivateOverride {
	public void f() {
		print("public f()");
	}
}