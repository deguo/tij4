package ch20annotations;

import java.io.*;
import commons.atunit.*;
import commons.util.*;

/**
 * <pre>
 * Output:
 * annotations.AtUnitExample5
 *   . test1
 * Running cleanup
 *   . test2
 * Running cleanup
 *   . test3
 * Running cleanup
 * OK (3 tests)
 * </pre>
 */
public class D19_AtUnitExample5 {
	private String text;

	public D19_AtUnitExample5(String text) {
		this.text = text;
	}

	public String toString() {
		return text;
	}

	@TestProperty
	static PrintWriter output;
	@TestProperty
	static int counter;

	@TestObjectCreate
	static D19_AtUnitExample5 create() {
		String id = Integer.toString(counter++);
		try {
			output = new PrintWriter("Test" + id + ".txt");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return new D19_AtUnitExample5(id);
	}

	@TestObjectCleanup
	static void cleanup(D19_AtUnitExample5 tobj) {
		System.out.println("Running cleanup");
		output.close();
	}

	@Test
	boolean test1() {
		output.print("test1");
		return true;
	}

	@Test
	boolean test2() {
		output.print("test2");
		return true;
	}

	@Test
	boolean test3() {
		output.print("test3");
		return true;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D19_AtUnitExample5");
	}
}