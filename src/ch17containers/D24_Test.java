package ch17containers;

/**
 * Framework for performing timed tests of containers.
 */
public abstract class D24_Test<C> {
	String name;

	public D24_Test(String name) {
		this.name = name;
	}

	// Override this method for different tests.
	// Returns actual number of repetitions of test.
	abstract int test(C container, D24_TestParam tp);
}