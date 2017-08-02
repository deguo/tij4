package ch02object.exercise;

/**
 * Exercise 1
 * 
 * <pre>
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 * </pre>
 * 
 * Output: i = 0 c = [ ]
 * 
 */
public class E01_DefaultInitialization {
	int i;
	char c;

	public E01_DefaultInitialization() {
		System.out.println("i = " + i);
		System.out.println("c = [" + c + ']');
	}

	public static void main(String[] args) {
		new E01_DefaultInitialization();
	}
}