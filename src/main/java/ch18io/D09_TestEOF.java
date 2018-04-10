package ch18io;

import java.io.*;

/**
 * Testing for end of file while reading a byte at a time.
 *
 * <pre>
 * (Execute to see output)
 * </pre>
 */
public class D09_TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/main/java/ch18io/D09_TestEOF.java")));
        while (in.available() != 0)
            System.out.print((char) in.readByte());
    }
}