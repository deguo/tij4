package ch10innerclasses;

/**
 * Returning an instance of an anonymous inner class.
 */
public class D10_Parcel7 {
	public D07_Contents contents() {
		return new D07_Contents() { // Insert a class definition
			private int i = 11;

			public int value() {
				return i;
			}
		}; // Semicolon required in this case
	}

	public static void main(String[] args) {
		D10_Parcel7 p = new D10_Parcel7();
		D07_Contents c = p.contents();
	}
}