package ch18io.xfiles;

import java.io.*;

/**
 * Try to recover a serialized file without the class of object that's stored in
 * that file. <br>
 * {RunByHand}
 * 
 * <pre>
 * Output:
 * class Alien
 * </pre>
 */
public class D35_ThawAlien {
	public static void main(String[] args) throws Exception {
		//ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("..", "X.file")));
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(".", "X.file")));
		Object mystery = in.readObject();
		System.out.println(mystery.getClass());
	}
}