package ch18io;

import java.util.concurrent.*;
import java.io.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * Demonstrates the "transient" keyword.
 * 
 * <pre>
 * Output: (Sample)
 * logon a = logon info:
 * username: Hulk
 * date: Sat Nov 19 15:03:26 MST 2005
 * password: myLittlePony
 * Recovering object at Sat Nov 19 15:03:28 MST 2005
 * logon a = logon info:
 * username: Hulk
 * date: Sat Nov 19 15:03:26 MST 2005
 * password: null
 * </pre>
 */
public class D38_Logon implements Serializable {
	private Date date = new Date();
	private String username;
	private transient String password;

	public D38_Logon(String name, String pwd) {
		username = name;
		password = pwd;
	}

	public String toString() {
		return "logon info: \n   username: " + username + "\n   date: " + date + "\n   password: " + password;
	}

	public static void main(String[] args) throws Exception {
		D38_Logon a = new D38_Logon("Hulk", "myLittlePony");
		print("logon a = " + a);
		ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
		o.writeObject(a);
		o.close();
		TimeUnit.SECONDS.sleep(1); // Delay
		// Now get them back:
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
		print("Recovering object at " + new Date());
		a = (D38_Logon) in.readObject();
		print("logon a = " + a);
	}
}