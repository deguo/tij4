package ch13strings;

import java.util.regex.*;
import static commons.util.Print.*;

/**
 * Allows you to easily try out regular expressions.<br>
 * {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }
 * 
 * <pre>
 * Output:
 * Input: "abcabcabcdefabc"
 * Regular expression: "abcabcabcdefabc"
 * Match "abcabcabcdefabc" at positions 0-14
 * Regular expression: "abc+"
 * Match "abc" at positions 0-2
 * Match "abc" at positions 3-5
 * Match "abc" at positions 6-8
 * Match "abc" at positions 12-14
 * Regular expression: "(abc)+"
 * Match "abcabcabc" at positions 0-8
 * Match "abc" at positions 12-14
 * Regular expression: "(abc){2,}"
 * Match "abcabcabc" at positions 0-8
 * </pre>
 */
public class D16_TestRegularExpression {
	public static void main(String[] args) {
		if (args.length < 2) {
			print("Usage:\njava D16_TestRegularExpression " + "characterSequence regularExpression+");
			System.exit(0);
		}
		print("Input: \"" + args[0] + "\"");
		for (String arg : args) {
			print("Regular expression: \"" + arg + "\"");
			Pattern p = Pattern.compile(arg);
			Matcher m = p.matcher(args[0]);
			while (m.find()) {
				print("Match \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1));
			}
		}
	}
}