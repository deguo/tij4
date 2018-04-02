package ch12exceptions;

import java.io.*;

public class D24_MainException {
	// Pass all exceptions to the console:
	public static void main(String[] args) throws Exception {
		// Open the file:
		FileInputStream file = new FileInputStream("D24_MainException.java");
		// Use the file ...
		// Close the file:
		file.close();
	}
}