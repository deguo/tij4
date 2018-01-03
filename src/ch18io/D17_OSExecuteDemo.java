package ch18io;

import commons.util.*;

/**
 * Demonstrates standard I/O redirection.
 * 
 * <pre>
 * Output:
 * Compiled from "OSExecuteDemo.java"
 * public class OSExecuteDemo extends java.lang.Object{
 * public OSExecuteDemo();
 * public static void main(java.lang.String[]);
 * }
 * </pre>
 */
public class D17_OSExecuteDemo {
	public static void main(String[] args) {
		OSExecute.command("javap out/production/tij4/ch18io/D17_OSExecuteDemo");
	}
}