package ch03operators;

import static net.mindview.util.Print.*;

/**
 * Passing objects to methods may not be what you're used to.
 * 
 * <pre>
 * Output:
 * 1: x.c: a
 * 2: x.c: z
 * </pre>
 */
class Letter {
	char c;
}

public class PassObject {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		print("1: x.c: " + x.c);
		f(x);
		print("2: x.c: " + x.c);
	}
}
