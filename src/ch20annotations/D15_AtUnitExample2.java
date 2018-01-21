package ch20annotations;

import java.io.*;
import commons.atunit.*;
import commons.util.*;

/**
 * Assertions and exceptions can be used in @Tests.
 * 
 * <pre>
 * Output:
 * annotations.AtUnitExample2
 * . assertExample
 * . assertFailureExample java.lang.AssertionError: What a surprise!
 * (failed)
 * . exceptionExample java.io.FileNotFoundException: nofile.txt (The system cannot find the file specified)
 * (failed)
 * . assertAndReturn This is methodTwo
 * 
 * (4 tests)
 * 
 * >>> 2 FAILURES <<<
 * annotations.AtUnitExample2: assertFailureExample
 * annotations.AtUnitExample2: exceptionExample
 * </pre>
 */
public class D15_AtUnitExample2 {
	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@Test
	void assertExample() {
		assert methodOne().equals("This is methodOne");
	}

	@Test
	void assertFailureExample() {
		assert 1 == 2 : "What a surprise!";
	}

	@Test
	void exceptionExample() throws IOException {
		new FileInputStream("nofile.txt"); // Throws
	}

	@Test
	boolean assertAndReturn() {
		// Assertion with message:
		assert methodTwo() == 2 : "methodTwo must equal 2";
		return methodOne().equals("This is methodOne");
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java  -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D15_AtUnitExample2");
	}
}