
package ch08polymorphism.music;

/**
 * Inheritance & upcasting.
 * 
 * <pre>
 * Output:
 * Wind.play() MIDDLE_C
 * </pre>
 */
public class D01_Music {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
	}
}