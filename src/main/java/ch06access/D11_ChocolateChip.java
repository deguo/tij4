package ch06access;

import ch06access.dessert.*;

/**
 * Can't use package-local member from another package.
 * 
 * <pre>
 * Output:
 * Cookie constructor
 * D11_ChocolateChip constructor
 * </pre>
 */
public class D11_ChocolateChip extends Cookie {
	public D11_ChocolateChip() {
		System.out.println("D11_ChocolateChip constructor");
	}

	public void chomp() {
		// ! bite(); // Can't local bite
	}

	public static void main(String[] args) {
		D11_ChocolateChip x = new D11_ChocolateChip();
		x.chomp();
	}
}