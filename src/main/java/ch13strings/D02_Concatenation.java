package ch13strings;

/**
 * <pre>
 * Output:
 * abcmangodef47
 * </pre>
 */
public class D02_Concatenation {
	public static void main(String[] args) {
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
	}
}