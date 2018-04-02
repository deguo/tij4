package ch03operators;

import java.util.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output: (55% match)
 * Hello, it's:
 * Wed Oct 05 14:39:05 MDT 2005
 * </pre>
 */

public class D01_HelloDate {
	public static void main(String[] args) {
		print("Hello, it's: ");
		print(new Date());
	}
}