package ch07reusing;

import static commons.util.Print.*;

/**
 * Constructor initialization with composition.
 * 
 * <pre>
 * Output:
 * Inside D02_Bath()
 * Soap()
 * s1 = Happy
 * s2 = Happy
 * s3 = Joy
 * s4 = Joy
 * i = 47
 * toy = 3.14
 * castille = Constructed
 * </pre>
 */
class Soap {
	private String s;

	Soap() {
		print("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class D02_Bath {
	private String // Initializing at point of definition:
	s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	public D02_Bath() {
		print("Inside D02_Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}

	// Instance initialization:
	{
		i = 47;
	}

	public String toString() {
		if (s4 == null) // Delayed initialization:
			s4 = "Joy";
		return "s1 = " + s1 + "\n" + "s2 = " + s2 + "\n" + "s3 = " + s3 + "\n" + "s4 = " + s4 + "\n" + "i = " + i + "\n"
				+ "toy = " + toy + "\n" + "castille = " + castille;
	}

	public static void main(String[] args) {
		D02_Bath b = new D02_Bath();
		print(b);
	}
}
