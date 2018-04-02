package ch14typeinfo;

import java.lang.reflect.*;
import java.util.regex.*;
import static commons.util.Print.*;

/**
 * Using reflection to show all the methods of a class, even if the methods are
 * defined in the base class.<br>
 * {Args: D18_ShowMethods}
 * 
 * <pre>
 * Output:
 * public static void main(String[])
 * public native int hashCode()
 * public final native Class getClass()
 * public final void wait(long,int) throws InterruptedException
 * public final void wait() throws InterruptedException
 * public final native void wait(long) throws InterruptedException
 * public boolean equals(Object)
 * public String toString()
 * public final native void notify()
 * public final naive void notifyAll()
 * public D18_ShowMethods()
 * </pre>
 */
public class D18_ShowMethods {
	private static String usage = "usage:\n" + "D18_ShowMethods qualified.class.name\n"
			+ "To show all methods in class or:\n" + "D18_ShowMethods qualified.class.name word\n"
			+ "To search for methods involving 'word'";
	private static Pattern p = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
		if (args.length < 1) {
			print(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if (args.length == 1) {
				for (Method method : methods)
					print(p.matcher(method.toString()).replaceAll(""));
				// print(method.toString());
				for (Constructor ctor : ctors)
					print(p.matcher(ctor.toString()).replaceAll(""));
				// print(ctor.toString());
				lines = methods.length + ctors.length;
			} else {
				for (Method method : methods)
					if (method.toString().indexOf(args[1]) != -1) {
						print(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				for (Constructor ctor : ctors)
					if (ctor.toString().indexOf(args[1]) != -1) {
						print(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
					}
			}
		} catch (ClassNotFoundException e) {
			print("No such class: " + e);
		}
	}
}