package ch18io;

import java.io.*;

/**
 * Turn System.out into a PrintWriter.
 * 
 * <pre>
 * Output:
 * Hello, world
 * </pre>
 */
public class D15_ChangeSystemOut {
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out, true);
		out.println("Hello, world");
	}
}