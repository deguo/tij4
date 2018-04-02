package ch20annotations;

import commons.atunit.*;
import commons.util.*;

/**
 * Creating non-embedded tests.
 * 
 * <pre>
 * Output:
 * annotations.D14_AtUnitComposition
 * . _methodOne
 * . _methodTwo This is methodTwo
 * 
 * OK (2 tests)
 * </pre>
 */
public class D14_AtUnitComposition {
	D12_AtUnitExample1 testObject = new D12_AtUnitExample1();

	@Test
	boolean _methodOne() {
		return testObject.methodOne().equals("This is methodOne");
	}

	@Test
	boolean _methodTwo() {
		return testObject.methodTwo() == 2;
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D14_AtUnitComposition");
	}
}