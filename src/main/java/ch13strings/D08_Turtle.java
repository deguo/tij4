package ch13strings;

import java.io.*;
import java.util.*;

/**
 * <pre>
 * Output:
 * Tommy The D08_Turtle is at (0,0)
 * Terry The D08_Turtle is at (4,8)
 * Tommy The D08_Turtle is at (3,4)
 * Terry The D08_Turtle is at (2,5)
 * Tommy The D08_Turtle is at (3,3)
 * Terry The D08_Turtle is at (3,3)
 * </pre>
 */
public class D08_Turtle {
	private String name;
	private Formatter f;

	public D08_Turtle(String name, Formatter f) {
		this.name = name;
		this.f = f;
	}

	public void move(int x, int y) {
		f.format("%s The D08_Turtle is at (%d,%d)\n", name, x, y);
	}

	public static void main(String[] args) {
		PrintStream outAlias = System.out;
		D08_Turtle tommy = new D08_Turtle("Tommy", new Formatter(System.out));
		D08_Turtle terry = new D08_Turtle("Terry", new Formatter(outAlias));
		tommy.move(0, 0);
		terry.move(4, 8);
		tommy.move(3, 4);
		terry.move(2, 5);
		tommy.move(3, 3);
		terry.move(3, 3);
	}
}