package ch13strings;

import java.util.*;

/**
 * <pre>
 * Output:
 * 12
 * 42
 * 78
 * 99
 * 42
 * </pre>
 */
public class D27_ScannerDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		scanner.useDelimiter("\\s*,\\s*");
		while (scanner.hasNextInt())
			System.out.println(scanner.nextInt());
	}
}