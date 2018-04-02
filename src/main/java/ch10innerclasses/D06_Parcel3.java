package ch10innerclasses;

/**
 * Using .new to create instances of inner classes.
 */
public class D06_Parcel3 {
	class Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	class Destination {
		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	public static void main(String[] args) {
		D06_Parcel3 p = new D06_Parcel3();
		// Must use instance of outer class
		// to create an instance of the inner class:
		Contents c = p.new Contents();
		Destination d = p.new Destination("Tasmania");
	}
}