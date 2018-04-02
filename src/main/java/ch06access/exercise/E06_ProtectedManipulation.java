package ch06access.exercise;

/**
 * Exercise 6
 * 
 * <pre>
 * Create one class with protected data, and a
 * second class in the same file with a method
 * that manipulates that protected data.
 *
 * Output:
 * wp.i = 47
 * </pre>
 */
class WithProtected {
	protected int i;
}

public class E06_ProtectedManipulation {
	public static void main(String args[]) {
		WithProtected wp = new WithProtected();
		wp.i = 47;
		System.out.println("wp.i = " + wp.i);
	}
}