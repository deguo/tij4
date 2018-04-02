package ch13strings;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * Then, when you have located the shrubbery, you must cut down the mightiest tree in the forest... with... a herring!
 * Then, when you have found the banana, you must cut down the mightiest banana in the forest... with... a banana!
 * </pre>
 */
public class D14_Replacing {
	static String s = D13_Splitting.knights;

	public static void main(String[] args) {
		print(s.replaceFirst("f\\w+", "located"));
		print(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
