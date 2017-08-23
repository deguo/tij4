package ch07reusing;

import static commons.util.Print.*;

/**
 * Constructor calls during inheritance.
 * 
 * <pre>
 * Output:
 * Art constructor
 * Drawing constructor
 * D04_Cartoon constructor
 * </pre>
 */
class Art {
	Art() {
		print("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		print("Drawing constructor");
	}
}

public class D04_Cartoon extends Drawing {
	public D04_Cartoon() {
		print("D04_Cartoon constructor");
	}

	public static void main(String[] args) {
		D04_Cartoon x = new D04_Cartoon();
	}
}