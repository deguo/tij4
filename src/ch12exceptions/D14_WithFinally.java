package ch12exceptions;

/**
 * Finally Guarantees cleanup.
 * 
 * <pre>
 * Output:
 * on
 * off
 * </pre>
 */
public class D14_WithFinally {
	static D13_Switch sw = new D13_Switch();

	public static void main(String[] args) {
		try {
			sw.on();
			// Code that can throw exceptions...
			D13_OnOffSwitch.f();
		} catch (D13_OnOffException1 e) {
			System.out.println("D13_OnOffException1");
		} catch (D13_OnOffException2 e) {
			System.out.println("D13_OnOffException2");
		} finally {
			sw.off();
		}
	}
}