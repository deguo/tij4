package ch08polymorphism;

import static commons.util.Print.*;

/**
 * Order of constructor calls.
 * 
 * <pre>
 * Output:
 * Meal()
 * Lunch()
 * PortableLunch()
 * Bread()
 * Cheese()
 * Lettuce()
 * D08_Sandwich()
 * </pre>
 **/
class Meal {
	Meal() {
		print("Meal()");
	}
}

class Bread {
	Bread() {
		print("Bread()");
	}
}

class Cheese {
	Cheese() {
		print("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		print("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		print("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		print("PortableLunch()");
	}
}

public class D08_Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public D08_Sandwich() {
		print("D08_Sandwich()");
	}

	public static void main(String[] args) {
		new D08_Sandwich();
	}
}