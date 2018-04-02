package ch07reusing;

import static commons.util.Print.*;

/**
 * Combining composition & inheritance.
 * 
 * <pre>
 * Output:
 * Custom constructor
 * Utensil constructor
 * Spoon constructor
 * Utensil constructor
 * Fork constructor
 * Utensil constructor
 * Knife constructor
 * Plate constructor
 * DinnerPlate constructor
 * D07_PlaceSetting constructor
 * </pre>
 */
class Plate {
	Plate(int i) {
		print("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	DinnerPlate(int i) {
		super(i);
		print("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		print("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		print("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		print("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		print("Knife constructor");
	}
}

// A cultural way of doing something:
class Custom {
	Custom(int i) {
		print("Custom constructor");
	}
}

public class D07_PlaceSetting extends Custom {
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public D07_PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		print("D07_PlaceSetting constructor");
	}

	public static void main(String[] args) {
		D07_PlaceSetting x = new D07_PlaceSetting(9);
	}
}