package ch20annotations;

import commons.atunit.*;
import commons.util.*;

/**
 * <pre>
 * Output:
 * annotations.AtUnitExample3
 *   . initialization
 *   . methodOneTest
 *   . m2 This is methodTwo
 * 
 * OK (3 tests)
 * </pre>
 */
public class D17_AtUnitExample3 {
	private int n;

	public D17_AtUnitExample3(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public String methodOne() {
		return "This is methodOne";
	}

	public int methodTwo() {
		System.out.println("This is methodTwo");
		return 2;
	}

	@TestObjectCreate
	static D17_AtUnitExample3 create() {
		return new D17_AtUnitExample3(47);
	}

	@Test
	boolean initialization() {
		return n == 47;
	}

	@Test
	boolean methodOneTest() {
		return methodOne().equals("This is methodOne");
	}

	@Test
	boolean m2() {
		return methodTwo() == 2;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D17_AtUnitExample3");
	}
}