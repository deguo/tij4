package ch20annotations;

/**
 * APT-based annotation processing.
 * 
 * <pre>
 * Output:
 * 11*16 = 176
 * </pre>
 */
@D07_ExtractInterface("IMultiplier")
public class D08_Multiplier {
	public int multiply(int x, int y) {
		int total = 0;
		for (int i = 0; i < x; i++)
			total = add(total, y);
		return total;
	}

	private int add(int x, int y) {
		return x + y;
	}

	public static void main(String[] args) {
		D08_Multiplier m = new D08_Multiplier();
		System.out.println("11*16 = " + m.multiply(11, 16));
	}
}