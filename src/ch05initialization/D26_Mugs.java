package ch05initialization;

import static commons.util.Print.*;

/**
 * Java "Instance Initialization."
 * 
 * <pre>
 * Output:
 * Inside main()
 * Mug(1)
 * Mug(2)
 * mug1 & mug2 initialized
 * D26_Mugs()
 * new D26_Mugs() completed
 * Mug(1)
 * Mug(2)
 * mug1 & mug2 initialized
 * D26_Mugs(int)
 * new D26_Mugs(1) completed
 * </pre>
 */
class Mug {
	Mug(int marker) {
		print("Mug(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

public class D26_Mugs {
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		print("mug1 & mug2 initialized");
	}

	D26_Mugs() {
		print("D26_Mugs()");
	}

	D26_Mugs(int i) {
		print("D26_Mugs(int)");
	}

	public static void main(String[] args) {
		print("Inside main()");
		new D26_Mugs();
		print("new D26_Mugs() completed");
		new D26_Mugs(1);
		print("new D26_Mugs(1) completed");
	}
}