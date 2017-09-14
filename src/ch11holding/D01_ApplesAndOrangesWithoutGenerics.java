package ch11holding;

import java.util.*;

/**
 * Simple container example (produces compiler warnings).<br>
 * {ThrowsException}
 * 
 * <pre>
 * (Execute to see output)
 * </pre>
 */
class Apple {
	private static long counter;
	private final long id = counter++;

	public long id() {
		return id;
	}
}

class Orange {
}

public class D01_ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++)
			apples.add(new Apple());
		// Not prevented from adding an Orange to apples:
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++);
			//! ((Apple) apples.get(i)).id();
		// Orange is detected only at run time
	}
}