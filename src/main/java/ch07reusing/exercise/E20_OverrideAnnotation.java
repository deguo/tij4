package ch07reusing.exercise;

import static commons.util.Print.*;

// {CompileTimeError}
/**
 * Exercise 20
 * 
 * <pre>
 * Show that the @Override annotation solves the
 * problem from the "final and private" section.
 * </pre>
 */
class WithFinals {
	// Identical to "private" alone:
	private final void f() {
		print("WithFinals.f()");
	}

	// Also automatically "final":
	private void g() {
		print("WithFinals.g()");
	}
}

class OverridingPrivateE20 extends WithFinals {
	// !@Override
	private final void f() {
		print("OverridingPrivateE20.f()");
	}

	// !@Override
	private void g() {
		print("OverridingPrivateE20.g()");
	}
}

class OverridingPrivate2E20 extends OverridingPrivateE20 {
	// !@Override
	public final void f() {
		print("OverridingPrivate2E20.f()");
	}

	// !@Override
	public void g() {
		print("OverridingPrivate2E20.g()");
	}
}

public class E20_OverrideAnnotation {
	public static void main(String[] args) {
		OverridingPrivate2E20 op2 = new OverridingPrivate2E20();
		op2.f();
		op2.g();
	}
}