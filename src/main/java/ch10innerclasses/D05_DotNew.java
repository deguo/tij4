package ch10innerclasses;

/**
 * Creating an inner class directly using the .new syntax.
 */
public class D05_DotNew {
	public class Inner {
	}

	public static void main(String[] args) {
		D05_DotNew dn = new D05_DotNew();
		Inner dni = dn.new Inner();
	}
}