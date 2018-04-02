package ch10innerclasses;

/**
 * Qualifying access to the outer-class object.
 * 
 * <pre>
 * Output:
 * D04_DotThis.f()
 * </pre>
 */
public class D04_DotThis {
	void f() {
		System.out.println("D04_DotThis.f()");
	}

	public class Inner {
		public D04_DotThis outer() {
			return D04_DotThis.this;
			// A plain "this" would be Inner's "this"
		}
	}

	public Inner inner() {
		return new Inner();
	}

	public static void main(String[] args) {
		D04_DotThis dt = new D04_DotThis();
		Inner dti = dt.inner();
		dti.outer().f();
	}
}