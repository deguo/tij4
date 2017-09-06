package ch10innerclasses;

/**
 * With concrete or abstract classes, inner classes are the only way to produce
 * the effect of "multiple implementation inheritance."
 */
class D {
}

abstract class E {
}

class Z extends D {
	E makeE() {
		return new E() {
		};
	}
}

public class D23_MultiImplementation {
	static void takesD(D d) {
	}

	static void takesE(E e) {
	}

	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}