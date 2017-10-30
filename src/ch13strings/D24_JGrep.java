package ch13strings;

import java.util.regex.*;
import commons.util.*;

/**
 * A very simple version of the "grep" program.<br>
 * {Args: D24_JGrep.java "\\b[Ssct]\\w+"}<br>
 * 输入参数为：JGrep.java "\\b[Ssct]\\w+"，没有任何输出；<br>
 * 应该输入参数为：JGrep JGrep.java "\b[Ssct]\w+"；<br>
 * 命令行传入的时候，用\b就能保证传入\b字符串，<br>
 * 而java代码因为\本身是特殊字符，所以需要转义，即用"\\b"来表示\b字符串
 * 
 * <pre>
 * Output: (Sample)
 * 0: strings: 4
 * 1: simple: 10
 * 2: the: 28
 * 3: Ssct: 26
 * 4: class: 7
 * 5: static: 9
 * 6: String: 26
 * 7: throws: 41
 * 8: System: 6
 * 9: System: 6
 * 10: compile: 24
 * 11: through: 15
 * 12: the: 23
 * 13: the: 36
 * 14: String: 8
 * 15: System: 8
 * 16: start: 31
 * </pre>
 */
public class D24_JGrep {
	public static void main(String[] args) throws Exception {
		if (args.length < 2) {
			System.out.println("Usage: java D24_JGrep file regex");
			System.exit(0);
		}
		Pattern p = Pattern.compile(args[1]);
		// Iterate through the lines of the input file:
		int index = 0;
		Matcher m = p.matcher("");
		for (String line : new TextFile(args[0])) {
			m.reset(line);
			while (m.find())
				System.out.println(index++ + ": " + m.group() + ": " + m.start());
		}
	}
}