package ch09interfaces.music4;

import ch08polymorphism.music.Note;
import static commons.util.Print.*;

/**
 * Abstract classes and methods.
 * 
 * <pre>
 * Output:
 * Wind.play() MIDDLE_C
 * Percussion.play() MIDDLE_C
 * Stringed.play() MIDDLE_C
 * Brass.play() MIDDLE_C
 * Woodwind.play() MIDDLE_C
 * </pre>
 */
abstract class Instrument {
	private int i; // Storage allocated for each

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	}
}

class Percussion extends Instrument {
	public void play(Note n) {
		print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
	}
}

class Stringed extends Instrument {
	public void play(Note n) {
		print("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
	}
}

class Brass extends Wind {
	public void play(Note n) {
		print("Brass.play() " + n);
	}

	public void adjust() {
		print("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		print("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}

public class D01_Music4 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument i : e)
			tune(i);
	}

	public static void main(String[] args) {
		// Upcasting during addition to the array:
		Instrument[] orchestra = { new Wind(), new Percussion(), new Stringed(), new Brass(), new Woodwind() };
		tuneAll(orchestra);
	}
}