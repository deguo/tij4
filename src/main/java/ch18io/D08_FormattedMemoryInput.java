package ch18io;

import java.io.*;

/** (Execute to see output) */

public class D08_FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(
					D06_BufferedInputFile.read("src/ch18io/D08_FormattedMemoryInput.java").getBytes()));
			while (true)
				System.out.print((char) in.readByte());
		} catch (EOFException e) {
			System.err.println("End of stream");
		}
	}
}