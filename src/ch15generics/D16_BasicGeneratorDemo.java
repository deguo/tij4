package ch15generics;

import commons.util.*;

/**
 * <pre>
 * Output:
 * D16_CountedObject 0
 * D16_CountedObject 1
 * D16_CountedObject 2
 * D16_CountedObject 3
 * D16_CountedObject 4
 * </pre>
 */
public class D16_BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<D16_CountedObject> gen = BasicGenerator.create(D16_CountedObject.class);
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
	}
}