package ch05initialization.exercise;

// 
/**
 * Exercise 20
 * 
 * <pre>
 * Create a main() that uses varargs instead
 * of the ordinary main() syntax. Print all the
 * elements in the resulting args array. Test it
 * with various numbers of command-line
 * arguments.
 *
 * {Args: These, are, some, strings}
 * 
 * Output:
 These,
 are,
 some,
 strings
 * </pre>
 */
public class E20_VarargMain {
	public static void main(String... args) {
		E19_VarargStringArray.printStrings(args);
	}
}