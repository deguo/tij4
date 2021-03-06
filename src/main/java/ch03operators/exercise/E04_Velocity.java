package ch03operators.exercise;

/**
 * Exercise 4
 * 
 * <pre>
 * {Args: 30.5 3.2}
 * 
 * Write a program that calculates velocity
 * using a constant distance and a constant time.
 * 
 * Output:
 * Velocity = 9.53125 m/s
 * </pre>
 */

public class E04_Velocity {
	public static void main(String[] args) {
		if (args.length < 2) {
			System.err.println("Usage: java E04_Velocity distance time");
			System.exit(1);
		}
		float distance = Float.parseFloat(args[0]);
		float time = Float.parseFloat(args[1]);
		System.out.print("Velocity = ");
		System.out.print(distance / time);
		// Change the next line if you want to use a different
		// unit for 'distance'
		System.out.println(" m/s");
	}
}
