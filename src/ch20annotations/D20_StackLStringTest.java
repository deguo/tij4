package ch20annotations;

import commons.atunit.*;
import commons.util.*;

/**
 * Applying @Unit to generics.
 * 
 * <pre>
 * Output:
 * annotations.StackLStringTest
 * . _push
 * . _pop
 * . _top
 * OK (3 tests)
 * </pre>
 */
public class D20_StackLStringTest extends D20_StackL<String> {
	@Test
	void _push() {
		push("one");
		assert top().equals("one");
		push("two");
		assert top().equals("two");
	}

	@Test
	void _pop() {
		push("one");
		push("two");
		assert pop().equals("two");
		assert pop().equals("one");
	}

	@Test
	void _top() {
		push("A");
		push("B");
		assert top().equals("B");
		assert top().equals("B");
	}

	public static void main(String[] args) throws Exception {
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D20_StackLStringTest");
	}
}