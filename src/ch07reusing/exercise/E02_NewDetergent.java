package ch07reusing.exercise;

import ch07reusing.D03_Detergent;

/**
 * Exercise 2
 * 
 * <pre>
 * Inherit a new class from class Detergent.
 * Override scrub() and add a new method called
 * sterilize().
 *
 * Output:
 * Cleanser dilute() NewDetergent.scrub() Detergent.scrub()
 * scrub() sterilize()
 * </pre>
 */
class NewDetergent extends D03_Detergent {
	public void scrub() {
		append(" NewDetergent.scrub()");
		super.scrub(); // Doesn't have to be first
	}

	public void sterilize() {
		append(" sterilize()");
	}
}

public class E02_NewDetergent {
	public static void main(String args[]) {
		NewDetergent nd = new NewDetergent();
		nd.dilute();
		nd.scrub();
		nd.sterilize();
		System.out.println(nd);
	}
}