// Inheriting an inner class.
package ch10innerclasses;

class WithInner {
	class Inner {
	}
}

public class D28_InheritInner extends WithInner.Inner {
	// ! D28_InheritInner() {} // Won't compile
	D28_InheritInner(WithInner wi) {
		wi.super();
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
		D28_InheritInner ii = new D28_InheritInner(wi);
	}
}