package ch14typeinfo;

import ch14typeinfo.interfacea.*;

/**
 * Sneaking around an interface.
 * 
 * <pre>
 * Output:
 * B
 * </pre>
 */
class B implements A {
	public void f() {
	}

	public void g() {
	}
}

public class D25_InterfaceViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// a.g(); // Compile error
		System.out.println(a.getClass().getName());
		if (a instanceof B) {
			B b = (B) a;
			b.g();
		}
	}
}