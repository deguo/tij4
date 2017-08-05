package ch03operators;

import static net.mindview.util.Print.*;

/**
 * Rounding floats and doubles.
 * 
 * <pre>
 * Output:
 * Math.round(above): 1
 * Math.round(below): 0
 * Math.round(fabove): 1
 * Math.round(fbelow): 0
 * </pre>
 */

public class RoundingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		print("Math.round(above): " + Math.round(above));
		print("Math.round(below): " + Math.round(below));
		print("Math.round(fabove): " + Math.round(fabove));
		print("Math.round(fbelow): " + Math.round(fbelow));
	}
}
