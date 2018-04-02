package ch18io;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;

/**
 * Copying a file using channels and buffers <br>
 * {Args: ChannelCopy.java test.txt}
 */
public class D19_ChannelCopy {
	private static final int BSIZE = 1024;

	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("arguments: sourcefile destfile");
			System.exit(1);
		}
		FileChannel in = new FileInputStream(args[0]).getChannel(), out = new FileOutputStream(args[1]).getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
		while (in.read(buffer) != -1) {
			buffer.flip(); // Prepare for writing
			out.write(buffer);
			buffer.clear(); // Prepare for reading
		}
	}
}