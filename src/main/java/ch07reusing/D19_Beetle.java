package ch07reusing;

import static commons.util.Print.*;

/**
 * The full process of initialization.
 * 
 * <pre>
 * Output:
 * static Insect.x1 initialized
 * static D19_Beetle.x2 initialized
 * D19_Beetle constructor
 * i = 9, j = 0
 * D19_Beetle.k initialized
 * k = 47
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

public class D19_Beetle extends Insect {
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