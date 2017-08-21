package ch05initialization.exercise;

/**
 * Exercise 11
 * 
 * <pre>
 * Modify Exercise 10 so your
 * finalize() will always be called.
 * 
 * Output:
 * finalize() called
 * </pre>
 */
public class E11_FinalizeAlwaysCalled {
	protected void finalize() {
		System.out.println("finalize() called");
	}

	public static void main(String args[]) {
		new E11_FinalizeAlwaysCalled();
		System.gc();
		System.runFinalization();
	}
}