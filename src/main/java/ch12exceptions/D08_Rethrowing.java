package ch12exceptions;

/**
 * Demonstrating fillInStackTrace()
 * 
 * <pre>
 * Output:
 * originating the exception in f()
 * Inside g(),e.printStackTrace()
 * java.lang.Exception: thrown from f()
 *         at D08_Rethrowing.f(D08_Rethrowing.java:7)
 *         at D08_Rethrowing.g(D08_Rethrowing.java:11)
 *         at D08_Rethrowing.main(D08_Rethrowing.java:29)
 * main: printStackTrace()
 * java.lang.Exception: thrown from f()
 *         at D08_Rethrowing.f(D08_Rethrowing.java:7)
 *         at D08_Rethrowing.g(D08_Rethrowing.java:11)
 *         at D08_Rethrowing.main(D08_Rethrowing.java:29)
 * originating the exception in f()
 * Inside h(),e.printStackTrace()
 * java.lang.Exception: thrown from f()
 *         at D08_Rethrowing.f(D08_Rethrowing.java:7)
 *         at D08_Rethrowing.h(D08_Rethrowing.java:20)
 *         at D08_Rethrowing.main(D08_Rethrowing.java:35)
 * main: printStackTrace()
 * java.lang.Exception: thrown from f()
 *         at D08_Rethrowing.h(D08_Rethrowing.java:24)
 *         at D08_Rethrowing.main(D08_Rethrowing.java:35)
 * </pre>
 */
public class D08_Rethrowing {
	public static void f() throws Exception {
		System.out.println("originating the exception in f()");
		throw new Exception("thrown from f()");
	}

	public static void g() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}

	public static void h() throws Exception {
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw (Exception) e.fillInStackTrace();
		}
	}

	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main: printStackTrace()");
			e.printStackTrace(System.out);
		}
	}
}