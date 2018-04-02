package ch17containers;

/**
 * A class that's used as a key in a HashMap <br>
 * must override hashCode() and equals().
 */
public class D18_Groundhog2 extends D17_Groundhog {
	public D18_Groundhog2(int n) {
		super(n);
	}

	public int hashCode() {
		return number;
	}

	public boolean equals(Object o) {
		return o instanceof D18_Groundhog2 && (number == ((D18_Groundhog2) o).number);
	}
}