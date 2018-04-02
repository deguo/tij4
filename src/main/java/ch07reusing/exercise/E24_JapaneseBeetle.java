package ch07reusing.exercise;

import static commons.util.Print.print;

/**
 * Exercise 24
 * 
 * <pre>
 * In Beetle.java, inherit a specific type of
 * beetle from class Beetle, following the same
 * format as the existing classes. Trace and
 * explain the output.
 *
 * Output:
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * static JapaneseBeetle.x3 initialized
 * i = 9, j = 0
 * Beetle.k initialized
 * k = 47
 * j = 39
 * JapaneseBeetle.m initialized
 * m = 47
 * j = 39
 * </pre>
 */
class Insect {
	private int i = 9;
	protected int j;

	Insect() {
		print("i = " + i + ", j = " + j);
		j = 39;
	}

	private static int x1 = printInit("static Insect.x1 initialized");

	static int printInit(String s) {
		print(s);
		return 47;
	}
}

class D19_Beetle extends Insect {
	private int k = printInit("D19_Beetle.k initialized");

	public D19_Beetle() {
		print("k = " + k);
		print("j = " + j);
	}

	private static int x2 = printInit("static D19_Beetle.x2 initialized");

	public static void main(String[] args) {
		print("D19_Beetle constructor");
		D19_Beetle b = new D19_Beetle();// 注释该行查看区别
	}
}

class JapaneseBeetle extends D19_Beetle {
	int m = printInit("JapaneseBeetle.m initialized");

	JapaneseBeetle() {
		print("m = " + m);
		print("j = " + j);
	}

	static int x3 = printInit("static JapaneseBeetle.x3 initialized");
}

public class E24_JapaneseBeetle {
	public static void main(String args[]) {
		new JapaneseBeetle();
	}
}