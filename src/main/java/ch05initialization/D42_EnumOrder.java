package ch05initialization;

/**
 * <pre>
 * Output:
 * NOT, ordinal 0
 * MILD, ordinal 1
 * MEDIUM, ordinal 2
 * HOT, ordinal 3
 * FLAMING, ordinal 4
 * </pre>
 */
public class D42_EnumOrder {
	public static void main(String[] args) {
		for (D40_Spiciness s : D40_Spiciness.values())
			System.out.println(s + ", ordinal " + s.ordinal());
	}
}
