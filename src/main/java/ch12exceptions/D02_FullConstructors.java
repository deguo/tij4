package ch12exceptions;

/**
 * <pre>
 * Output:
 * Throwing MyException from f()
 * MyException
 *        at D02_FullConstructors.f(D02_FullConstructors.java:11)
 *        at D02_FullConstructors.main(D02_FullConstructors.java:19)
 * Throwing MyException from g()
 * MyException: Originated in g()
 *        at D02_FullConstructors.g(D02_FullConstructors.java:15)
 *        at D02_FullConstructors.main(D02_FullConstructors.java:24)
 * </pre>
 */
class MyException extends Exception {
	public MyException() {
	}

	public MyException(String msg) {
		super(msg);
	}
}

public class D02_FullConstructors {
	public static void f() throws MyException {
		System.out.println("Throwing MyException from f()");
		throw new MyException();
	}

	public static void g() throws MyException {
		System.out.println("Throwing MyException from g()");
		throw new MyException("Originated in g()");
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
		try {
			g();
		} catch (MyException e) {
			e.printStackTrace(System.out);
		}
	}
}