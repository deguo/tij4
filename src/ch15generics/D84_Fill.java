package ch15generics;

import java.util.*;

/**
 * Generalizing the D08_FilledList idea<br>
 * {main: FillTest}<br>
 * Doesn't work with "anything that has an add()." There is no "Addable"
 * interface so we are narrowed to using a Collection. We cannot generalize
 * using generics in /this case.
 * 
 * <pre>
 * Output:
 * Contract 0
 * Contract 1
 * Contract 2
 * TitleTransfer 3
 * TitleTransfer 4
 * </pre>
 */
public class D84_Fill {
	public static <T> void fill(Collection<T> collection, Class<? extends T> classToken, int size) {
		for (int i = 0; i < size; i++)
			// Assumes default constructor:
			try {
				collection.add(classToken.newInstance());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}
}

class Contract {
	private static long counter = 0;
	private final long id = counter++;

	public String toString() {
		return getClass().getName() + " " + id;
	}
}

class TitleTransfer extends Contract {
}

class FillTest {
	public static void main(String[] args) {
		List<Contract> contracts = new ArrayList<Contract>();
		D84_Fill.fill(contracts, Contract.class, 3);
		D84_Fill.fill(contracts, TitleTransfer.class, 2);
		for (Contract c : contracts)
			System.out.println(c);
		D83_SimpleQueue<Contract> contractQueue = new D83_SimpleQueue<Contract>();
		// Won't work. fill() is not generic enough:
		// D84_Fill.fill(contractQueue, Contract.class, 3);
	}
}