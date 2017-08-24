package ch07reusing.exercise;

// {CompileTimeError}
/**
 * Exercise 21
 * 
 * <pre>
 * Create a class with a final method. Inherit
 * from that class and attempt to override that
 * method.
 * </pre>
 */
class WithFinalMethod {
	final void f() {
	}
}

public class E21_FinalMethod extends WithFinalMethod {
	// !void f() {}

	public static void main(String args[]) {
	}
}