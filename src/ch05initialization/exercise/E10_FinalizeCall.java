package ch05initialization.exercise;

/**
 * Exercise 10
 * 
 * <pre>
 * Create a class with a finalize() method that
 * prints a message. In main(), create an object
 * of your class. Explain the behavior of your
 * program.
 * </pre>
 */
public class E10_FinalizeCall {
	protected void finalize() {
		System.out.println("finalize() called");
	}

	public static void main(String args[]) {
		new E10_FinalizeCall();
	}
}