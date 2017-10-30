package ch12exceptions;

/**
 * Rethrow a different object from the one that was caught.
 * 
 * <pre>
 * Output:
 * originating the exception in f()
 * Caught in inner try, e.printStackTrace()
 * OneException: thrown from f()
 * at D09_RethrowNew.f(D09_RethrowNew.java:15)
 * at D09_RethrowNew.main(D09_RethrowNew.java:20)
 * Caught in outer try, e.printStackTrace()
 * TwoException: from n er try
  * at D09_RethrowNew.main(D09_RethrowNew.java:25)
 * </pre>
 * 
 */
class OneException extends Exception {
	public OneException(String s) {
		super(s);
	}
}

class TwoException extends Exception {
	public TwoException(String s) {
		super(s);
	}
}

public class D09_RethrowNew {
	public static void f() throws OneException {
		System.out.println("originating the exception in f()");
		throw new OneException("thrown from f()");
	}

	public static void main(String[] args) {
		try {
			try {
				f();
			} catch (OneException e) {
				System.out.println("Caught in inner try, e.printStackTrace()");
				e.printStackTrace(System.out);
				throw new TwoException("from inner try");
			}
		} catch (TwoException e) {
			System.out.println("Caught in outer try, e.printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}