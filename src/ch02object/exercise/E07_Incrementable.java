package ch02object.exercise;

/**
 * Exercise 7
 *
 * <pre>
 * Turn the Incrementable code fragments into a
 * working program.
 * </pre>
 */
class StaticTest {
	static int i = 47;
}

public class E07_Incrementable {
	static void increment() {
		StaticTest.i++;
	}

	public static void main(String[] args) {
		E07_Incrementable sf = new E07_Incrementable();
		sf.increment();
		E07_Incrementable.increment();
		increment();
	}
}
