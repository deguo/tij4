package ch10innerclasses;

/**
 * Using "instance initialization" to perform construction on an anonymous inner
 * class.
 * 
 * <pre>
 * Output:
 * Over budget!
 * </pre>
 */
public class D15_Parcel10 {
	public D07_Destination destination(final String dest, final float price) {
		return new D07_Destination() {
			private int cost;
			// Instance initialization for each object:
			{
				cost = Math.round(price);
				if (cost > 100)
					System.out.println("Over budget!");
			}
			private String label = dest;

			public String readLabel() {
				return label;
			}
		};
	}

	public static void main(String[] args) {
		D15_Parcel10 p = new D15_Parcel10();
		D07_Destination d = p.destination("Tasmania", 101.395F);
	}
}