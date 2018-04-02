package ch10innerclasses;

/**
 * An anonymous inner class that performs initialization. A briefer version of
 * D08_Parcel5.java.
 */
public class D13_Parcel9 {
	// Argument must be final to use inside
	// anonymous inner class:
	public D07_Destination destination(final String dest) {
		return new D07_Destination() {
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		D13_Parcel9 p = new D13_Parcel9();
		D07_Destination d = p.destination("Tasmania");
	}
}