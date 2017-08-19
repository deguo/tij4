package ch05initialization;

/**
 * Simple use of the "this" keyword.
 * 
 * <pre>
 * Output:
 * i = 3
 * </pre>
 */
public class D11_Leaf {
	int i = 0;

	D11_Leaf increment() {
		i++;
		return this;
	}

	void print() {
		System.out.println("i = " + i);
	}

	public static void main(String[] args) {
		D11_Leaf x = new D11_Leaf();
		x.increment().increment().increment().print();
	}
}