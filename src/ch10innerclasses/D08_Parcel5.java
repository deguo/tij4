package ch10innerclasses;

/**
 * Nesting a class within a method.
 */
public class D08_Parcel5 {
	public D07_Destination destination(String s) {
		class PDestination implements D07_Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}

			public String readLabel() {
				return label;
			}
		}
		return new PDestination(s);
	}

	public static void main(String[] args) {
		D08_Parcel5 p = new D08_Parcel5();
		D07_Destination d = p.destination("Tasmania");
	}
}