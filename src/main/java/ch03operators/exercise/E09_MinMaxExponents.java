package ch03operators.exercise;

import static commons.util.Print.*;

/**
 * Exercise 9
 * 
 * <pre>
 * Display the largest and smallest numbers for
 * both float and double exponential notation.
 * 
 * Output:
 * Float MIN: 1.4E-45
 * Float MAX: 3.4028235E38
 * Double MIN: 4.9E-324
 * Double MAX: 1.7976931348623157E308
 * </pre>
 */
public class E09_MinMaxExponents {
	public static void main(String[] args) {
		print("Float MIN: " + Float.MIN_VALUE);
		print("Float MAX: " + Float.MAX_VALUE);
		print("Double MIN: " + Double.MIN_VALUE);
		print("Double MAX: " + Double.MAX_VALUE);
		float f = -10.6F;
	}
}