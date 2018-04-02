package ch10innerclasses;

/**
 * Creating inner classes.
 * 
 * <pre>
 * Output:
 * Tasmania
 * </pre>
 */
public class D01_Parcel1 {
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

	// Using inner classes looks just like
	// using any other class, within D01_Parcel1:
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println(d.readLabel());
	}

	public static void main(String[] args) {
		D01_Parcel1 p = new D01_Parcel1();
		p.ship("Tasmania");
	}
}