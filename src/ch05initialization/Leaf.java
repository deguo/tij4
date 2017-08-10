package ch05initialization;

/**
 * Simple use of the "this" keyword.
 * 
 * <pre>
 * Output:
 * i = 3
 * </pre>
 */
public class Leaf {
	int i = 0;

	Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		Leaf x = new Leaf();
		x.increment().increment().increment().print();
	}
}