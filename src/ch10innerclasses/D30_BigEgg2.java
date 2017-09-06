package ch10innerclasses;

import static commons.util.Print.*;

/**
 * Proper inheritance of an inner class.
 * 
 * <pre>
 * Output:
 * Egg2.Yolk()
 * New Egg2()
 * Egg2.Yolk()
 * D30_BigEgg2.Yolk()
 * D30_BigEgg2.Yolk.f()
 * </pre>
 */
class Egg2 {
	protected class Yolk {
		public Yolk() {
			print("Egg2.Yolk()");
		}

		public void f() {
			print("Egg2.Yolk.f()");
		}
	}

	private Yolk y = new Yolk();

	public Egg2() {
		print("New Egg2()");
	}

	public void insertYolk(Yolk yy) {
		y = yy;
	}

	public void g() {
		y.f();
	}
}

public class D30_BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			print("D30_BigEgg2.Yolk()");
		}

		public void f() {
			print("D30_BigEgg2.Yolk.f()");
		}
	}

	public D30_BigEgg2() {
		insertYolk(new Yolk());
	}

	public static void main(String[] args) {
		Egg2 e2 = new D30_BigEgg2();
		e2.g();
	}
}