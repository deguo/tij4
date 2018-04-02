package ch18io;

import java.io.*;

/** (Execute to see output) */
public class D07_MemoryInput {
	public static void main(String[] args) throws IOException {
		StringReader in = new StringReader(D06_BufferedInputFile.read("src/ch18io/D07_MemoryInput.java"));
		int c;
		while ((c = in.read()) != -1)
			System.out.print((char) c);
	}
}