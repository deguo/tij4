package ch13strings;

/**
 * <pre>
 * Output:
 * true
 * true
 * true
 * true
 * </pre>
 */
public class D15_Rudolph {
	public static void main(String[] args) {
		for (String pattern : new String[] { "Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
			System.out.println("Rudolph".matches(pattern));
	}
}