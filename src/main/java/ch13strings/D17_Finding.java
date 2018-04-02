package ch13strings;

import java.util.regex.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * Evening is full of the linnet s wings
 * Evening vening ening ning ing ng g is is s full full ull ll l of of f the the he e linnet linnet innet nnet net et t s s wings wings ings ngs gs s
 * </pre>
 */
public class D17_Finding {
	public static void main(String[] args) {
		Matcher m = Pattern.compile("\\w+").matcher("Evening is full of the linnet's wings");
		while (m.find())
			printnb(m.group() + " ");
		print();
		int i = 0;
		while (m.find(i)) {
			printnb(m.group() + " ");
			i++;
		}
	}
}
