package ch20annotations;

import commons.atunit.*;

public class D01_Testable {
	public void execute() {
		System.out.println("Executing..");
	}

	@Test
	void testExecute() {
		execute();
	}
}