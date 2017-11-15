package ch14typeinfo;

import ch14typeinfo.interfacea.*;
import static commons.util.Print.*;

/**
 * Private inner classes can't hide from reflection.
 * 
 * <pre>
 * Output:
 * public C.f()
 * InnerA$C
 * public C.g()
 * package C.u()
 * protected C.v()
 * private C.w()
 * </pre>
 */
class InnerA {
	private static class C implements A {
		public void f() {
			print("public C.f()");
		}

		public void g() {
			print("public C.g()");
		}

		void u() {
			print("package C.u()");
		}

		protected void v() {
			print("protected C.v()");
		}

		private void w() {
			print("private C.w()");
		}
	}

	public static A makeA() {
		return new C();
	}
}

public class D27_InnerImplementation {
	public static void main(String[] args) throws Exception {
		A a = InnerA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// Reflection still gets into the private class:
		D26_HiddenImplementation.callHiddenMethod(a, "g");
		D26_HiddenImplementation.callHiddenMethod(a, "u");
		D26_HiddenImplementation.callHiddenMethod(a, "v");
		D26_HiddenImplementation.callHiddenMethod(a, "w");
	}
}