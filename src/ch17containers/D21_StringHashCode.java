package ch17containers;

/**
 * <pre>
 * Output: (Sample)
 * 69609650
 * 69609650
 * </pre>
 */

public class D21_StringHashCode {
	public static void main(String[] args) {
		String[] hellos = "Hello Hello".split(" ");
		System.out.println(hellos[0].hashCode());
		System.out.println(hellos[1].hashCode());
	}
}