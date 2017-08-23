package ch07reusing;

/**
 * Inheritance & upcasting.
 */
class Instrument {
	public void play() {
	}

	static void tune(Instrument i) {
		// ...
		i.play();
	}
}

// D13_Wind objects are instruments
// because they have the same interface:
public class D13_Wind extends Instrument {
	public static void main(String[] args) {
		D13_Wind flute = new D13_Wind();
		Instrument.tune(flute); // Upcasting
	}
}