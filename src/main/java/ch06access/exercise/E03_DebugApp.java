package ch06access.exercise;

import static ch06access.exercise.debug.E03_Debug.*;

/**
 * Exercise 3
 * 
 * <pre>
 * Create two packages: debug and debugoff,
 * containing an identical class with a debug()
 * method. The first version displays its String
 * argument to the console, the second does nothing.
 * Import the class into a test program
 * using a static import line, and demonstrate
 * the conditional compilation effect.
 *
 * Output:
 * Message: DEBUG VERSION
 * </pre>
 */

public class E03_DebugApp {
	public static void main(String[] args) {
		debug("DEBUG VERSION");
	}

}
