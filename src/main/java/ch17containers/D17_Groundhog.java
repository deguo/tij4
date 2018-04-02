package ch17containers;

/**
 * Looks plausible, but doesn't work as a HashMap key.
 */
public class D17_Groundhog {
	protected int number;

	public D17_Groundhog(int n) {
		number = n;
	}

	public String toString() {
		return "Groundhog #" + number;
	}
}