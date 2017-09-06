package ch10innerclasses;

import static commons.util.Print.*;

/**
 * An inner class cannot be overriden like a method.
 * 
 * <pre>
 * Output:
 * New Egg()
 * Egg.Yolk()
 * </pre>
 */
class Egg {
	private Yolk y;

	protected class Yolk {
		public Yolk() {
			print("Egg.Yolk()");
		}
	}

	public Egg() {
		print("New Egg()");
		y = new Yolk();
	}
}

public class D29_BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			print("D29_BigEgg.Yolk()");
		}
	}

	public static void main(String[] args) {
		new D29_BigEgg();
	}
}