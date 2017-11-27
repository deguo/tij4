package ch15generics;

import java.util.*;

public class D48_SuperTypeWildcards {
	static void writeTo(List<? super Apple> apples) {
		apples.add(new Apple());
		apples.add(new Jonathan());
		// apples.add(new Fruit()); // Error
	}
}