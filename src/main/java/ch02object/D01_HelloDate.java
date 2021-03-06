package ch02object;

import java.util.*;

/**
 * The first Thinking in Java example program. <br>
 * Displays a string and today's date.
 * 
 * <pre>
 * Output: (55% match)
 * Hello, it's:
 * Wed Oct 05 14:39:36 MDT 2005
 * </pre>
 * 
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class D01_HelloDate {
	/**
	 * Entry point to class & application.
	 * 
	 * @param args
	 *            array of string arguments
	 * @throws exceptions
	 *             No exceptions thrown
	 */
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	}
}