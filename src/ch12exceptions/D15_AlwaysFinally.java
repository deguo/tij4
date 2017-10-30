package ch12exceptions;

import static commons.util.Print.*;

/**
 * Finally is always executed.
 * 
 * <pre>
 * Output:
 * Entering first try block
 * Entering second try block
 * finally in 2nd try block
 * Caught FourException i 1st try block
 * finally in 1st try blok
 * </pre>
 */
class FourException extends Exception {
}

public class D15_AlwaysFinally {
	public static void main(String[] args) {
		print("Entering first try block");
		try {
			print("Entering second try block");
			try {
				throw new FourException();
			} finally {
				print("finally in 2nd try block");
			}
		} catch (FourException e) {
			System.out.println("Caught FourException in 1st try block");
		} finally {
			System.out.println("finally in 1st try block");
		}
	}
}