package ch20annotations;

import java.util.*;
import commons.atunit.*;
import commons.util.*;

/**
 * <pre>
 * Output:
 * annotations.HashSetTest
 *   . initialization
 *   . _remove
 *   . _contains
 * OK (3 tests)
 * </pre>
 */
public class D16_HashSetTest {
	HashSet<String> testObject = new HashSet<String>();

	@Test
	void initialization() {
		assert testObject.isEmpty();
	}

	@Test
	void _contains() {
		testObject.add("one");
		assert testObject.contains("one");
	}

	@Test
	void _remove() {
		testObject.add("one");
		testObject.remove("one");
		assert testObject.isEmpty();
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D16_HashSetTest");
	}
}