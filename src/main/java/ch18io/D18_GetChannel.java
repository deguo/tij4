package ch18io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

/**
 * Getting channels from streams
 * 
 * <pre>
 * Output:
 * Some text Some more
 * </pre>
 */
public class D18_GetChannel {
	private static final int BSIZE = 1024;

	public static void main(String[] args) throws Exception {
		// Write a file:
		FileChannel fc = new FileOutputStream("data.txt").getChannel();
		fc.write(ByteBuffer.wrap("Some text ".getBytes()));
		fc.close();
		// Add to the end of the file:
		fc = new RandomAccessFile("data.txt", "rw").getChannel();
		fc.position(fc.size()); // Move to the end
		fc.write(ByteBuffer.wrap("Some more".getBytes()));
		fc.close();
		// Read the file:
		fc = new FileInputStream("data.txt").getChannel();
		ByteBuffer buff = ByteBuffer.allocate(BSIZE);
		fc.read(buff);
		buff.flip();
		while (buff.hasRemaining())
			System.out.print((char) buff.get());
	}
}