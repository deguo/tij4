package ch04control;

/**
 * <pre>
 * Output:
 * A n   A f r i c a n   S w a l l o w
 * </pre>
 */
public class D06_ForEachString {
	public static void main(String[] args) {
		for (char c : "An African Swallow".toCharArray())
			System.out.print(c + " ");
	}
}