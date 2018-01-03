package ch18io;

import java.io.*;
import commons.util.*;
import static commons.util.Print.*;

/**
 * Sample use of Directory utilities.
 * 
 * <pre>
 * Output: (Sample)
 * [.\xfiles]
 * .\TestEOF.class
 * .\TestEOF.java
 * .\TransferTo.class
 * .\TransferTo.java
 * ----------------------
 * .\TestEOF.java
 * .\TransferTo.java
 * .\xfiles\ThawAlien.java
 * ======================
 * .\FreezeAlien.class
 * .\GZIPcompress.class
 * .\ZipCompress.class
 * </pre>
 */
public class D04_DirectoryDemo {
	public static void main(String[] args) {
		// All directories:
		PPrint.pprint(Directory.walk(".").dirs);
		// All files beginning with 'T'
        for (File file : Directory.local(".", "T.*"))
			print(file);
		print("----------------------");
		// All Java files beginning with 'T':
		for (File file : Directory.walk(".", "T.*\\.java"))
			print(file);
		print("======================");
		// Class files containing "Z" or "z":
		for (File file : Directory.walk(".", ".*[Zz].*\\.class"))
			print(file);
	}
}