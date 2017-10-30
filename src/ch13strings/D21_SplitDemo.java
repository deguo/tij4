package ch13strings;

import java.util.regex.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * [This, unusual use, of exclamation, points]
 * [This, unusual use, of exclamation!!points]
 * </pre>
 */
public class D21_SplitDemo {
	public static void main(String[] args) {
		String input = "This!!unusual use!!of exclamation!!points";
		print(Arrays.toString(Pattern.compile("!!").split(input)));
		// Only do the first three:
		print(Arrays.toString(Pattern.compile("!!").split(input, 3)));
	}
}