package ch12exceptions;

import static commons.util.Print.*;

/**
 * Demonstrating the Exception Methods.
 * 
 * <pre>
 * Output:
 * Caught Exception
 * getMessage():My Exception
 * getLocalizedMessage():My Exception
 * toString():java.lang.Exception: My Exception
 * printStackTrace():
 * java.lang.Exception: My Exception
 * at D06_ExceptionMethods.main(D06_ExceptionMethods.java:8)
 * </pre>
 */
public class D06_ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			print("Caught Exception");
			print("getMessage():" + e.getMessage());
			print("getLocalizedMessage():" + e.getLocalizedMessage());
			print("toString():" + e);
			print("printStackTrace():");
			e.printStackTrace(System.out);
		}
	}
}