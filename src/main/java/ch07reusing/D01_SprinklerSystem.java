package ch07reusing;

/**
 * Composition for code reuse.
 * 
 * <pre>
 * Output:
 * WaterSource()
 * valve1 = null valve2 = null valve3 = null valve4 = null
 * i = 0 f = 0.0 source = Constructed
 * </pre>
 */
class WaterSource {
	private String s;

	WaterSource() {
		System.out.println("WaterSource()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class D01_SprinklerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() {
		return "valve1 = " + valve1 + " " + "valve2 = " + valve2 + " " + "valve3 = " + valve3 + " " + "valve4 = "
				+ valve4 + "\n" + "i = " + i + " " + "f = " + f + " " + "source = " + source;
	}

	public static void main(String[] args) {
		D01_SprinklerSystem sprinklers = new D01_SprinklerSystem();
		System.out.println(sprinklers);
	}
}