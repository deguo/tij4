package ch10innerclasses;

/**
 * Returning a reference to an inner class.
 * 
 * <pre>
 * Output:
 * Tasmania
 * </pre>
 */
public class D02_Parcel2 {
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

	public Destination to(String s) {
		return new Destination(s);
	}

	public Contents contents() {
		return new Contents();
	}

	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		D02_Parcel2 p = new D02_Parcel2();
		p.ship("Tasmania");
		D02_Parcel2 q = new D02_Parcel2();
		// Defining references to inner classes:
		Contents c = q.contents();
		Destination d = q.to("Borneo");
	}
}