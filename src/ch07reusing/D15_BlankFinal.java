package ch07reusing;

/**
 * "Blank" final fields.
 */
class Poppet {
	private int i;

	Poppet(int ii) {
		i = ii;
	}
}

public class D15_BlankFinal {
	private final int i = 0; // Initialized final
	private final int j; // Blank final
	private final Poppet p; // Blank final reference
	// Blank finals MUST be initialized in the constructor:

	public D15_BlankFinal() {
		j = 1; // Initialize blank final
		p = new Poppet(1); // Initialize blank final reference
	}

	public D15_BlankFinal(int x) {
		j = x; // Initialize blank final
		p = new Poppet(x); // Initialize blank final reference
	}

	public static void main(String[] args) {
		new D15_BlankFinal();
		new D15_BlankFinal(47);
	}
}