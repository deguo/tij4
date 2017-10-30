package ch12exceptions;

/**
 * Creating your own exceptions.
 * 
 * <pre>
 * Output:
 * Throw SimpleException from f()
 * Caught it!
 * </pre>
 */

class SimpleException extends Exception {
}

public class D01_InheritingExceptions {
	public void f() throws SimpleException {
		System.out.println("Throw SimpleException from f()");
		throw new SimpleException();
	}

	public static void main(String[] args) {
		D01_InheritingExceptions sed = new D01_InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			System.out.println("Caught it!");
		}
	}
}