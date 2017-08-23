package ch07reusing;

import static commons.util.Print.*;

/**
 * Inheritance syntax & properties.
 * 
 * <pre>
 * Output:
 * Cleanser dilute() apply() D03_Detergent.scrub() scrub() foam()
 * Testing base class:
 * Cleanser dilute() apply() scrub()
 * </pre>
 */
class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	}

	public void dilute() {
		append(" dilute()");
	}

	public void apply() {
		append(" apply()");
	}

	public void scrub() {
		append(" scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		print(x);
	}
}

public class D03_Detergent extends Cleanser {
	// Change a method:
	public void scrub() {
		append(" D03_Detergent.scrub()");
		super.scrub(); // Call base-class version
	}

	// Add methods to the interface:
	public void foam() {
		append(" foam()");
	}

	// Test the new class:
	public static void main(String[] args) {
		D03_Detergent x = new D03_Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		print(x);
		print("Testing base class:");
		Cleanser.main(args);
	}
}