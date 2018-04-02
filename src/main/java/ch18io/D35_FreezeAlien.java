package ch18io;

import java.io.*;

/**
 * Create a serialized output file.
 */
public class D35_FreezeAlien {
	public static void main(String[] args) throws Exception {
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("X.file"));
		D35_Alien quellek = new D35_Alien();
		out.writeObject(quellek);
	}
}