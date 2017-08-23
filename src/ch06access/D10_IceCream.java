package ch06access;

/**
 * Demonstrates "private" keyword.
 */
class Sundae {
	private Sundae() {
	}

	static Sundae makeASundae() {
		return new Sundae();
	}
}

public class D10_IceCream {
	public static void main(String[] args) {
		// ! Sundae x = new Sundae();
		Sundae x = Sundae.makeASundae();
	}
}