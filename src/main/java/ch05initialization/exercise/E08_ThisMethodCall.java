package ch05initialization.exercise;

/**
 * Exercise 8
 * 
 * <pre>
 * Create a class with two methods. Within the
 * first method call the second method twice to
 * see it work, the first time without using this,
 * and the second time using this.
 * (You should not use this form in practice.)
 *
 * Output:
 * b() called
 * b() called
 * </pre>
 */
public class E08_ThisMethodCall {
	public void a() {
		b();
		this.b();
	}

	public void b() {
		System.out.println("b() called");
	}

	public static void main(String args[]) {
		new E08_ThisMethodCall().a();
	}
}