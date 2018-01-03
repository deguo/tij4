package ch18io;

import java.io.*;

/** (Execute to see output) */
public class D11_FileOutputShortcut {
	static String file = "FileOutputShortcut.out";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(
				new StringReader(D06_BufferedInputFile.read("src/ch18io/D11_FileOutputShortcut.java")));
		// Here's the shortcut:
		PrintWriter out = new PrintWriter(file);
		int lineCount = 1;
		String s;
		while ((s = in.readLine()) != null)
			out.println(lineCount++ + ": " + s);
		out.close();
		// Show the stored file:
		System.out.println(D06_BufferedInputFile.read(file));
	}
}