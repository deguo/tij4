package ch12exceptions;

/**
 * Why use finally?
 * 
 * <pre>
 * Output:
 * on
 * off
 * </pre>
 */
public class D13_OnOffSwitch {
	private static D13_Switch sw = new D13_Switch();

	public static void f() throws D13_OnOffException1, D13_OnOffException2 {
	}

	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			f();
			sw.off();
		} catch (D13_OnOffException1 e) {
			System.out.println("D13_OnOffException1");
			sw.off();
		} catch (D13_OnOffException2 e) {
			System.out.println("D13_OnOffException2");
			sw.off();
		}
	}
}