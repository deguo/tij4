package ch12exceptions;

/**
 * Ignoring RuntimeExceptions. {ThrowsException}
 */
public class D11_NeverCaught {
	static void f() {
		throw new RuntimeException("From f()");
	}

	static void g() {
		f();
	}

	public static void main(String[] args) {
		g();
	}
}