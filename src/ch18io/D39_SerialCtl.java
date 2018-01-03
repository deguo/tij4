package ch18io;

import java.io.*;

/**
 * Controlling serialization by adding your own writeObject() and readObject()
 * methods.
 * 
 * <pre>
 * Output:
 * Before:
 * Not Transient: Test1
 * Transient: Test2
 * After:
 * Not Transient: Test1
 * Transient: Test2
 * </pre>
 */
public class D39_SerialCtl implements Serializable {
	private String a;
	private transient String b;

	public D39_SerialCtl(String aa, String bb) {
		a = "Not Transient: " + aa;
		b = "Transient: " + bb;
    }

	public String toString() {
		return a + "\n" + b;
	}

	private void writeObject(ObjectOutputStream stream) throws IOException {
		stream.defaultWriteObject();
		stream.writeObject(b);
	}

	private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
		b = (String) stream.readObject();
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		D39_SerialCtl sc = new D39_SerialCtl("Test1", "Test2");
		System.out.println("Before:\n" + sc);
		ByteArrayOutputStream buf = new ByteArrayOutputStream();
		ObjectOutputStream o = new ObjectOutputStream(buf);
		o.writeObject(sc);
		// Now get it back:
		ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(buf.toByteArray()));
		D39_SerialCtl sc2 = (D39_SerialCtl) in.readObject();
		System.out.println("After:\n" + sc2);
	}
}