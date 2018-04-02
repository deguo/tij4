package ch15generics;

import java.util.*;
import commons.util.*;

/**
 * Combining generic types to make complex generic types.
 * 
 * <pre>
 * Output: (75% match)
 * (Vehicle@11b86e7, Amphibian@35ce36, hi, 47)
 * (Vehicle@757aef, Amphibian@d9f9c3, hi, 47)
 * </pre>
 */
public class D20_TupleList<A, B, C, D> extends ArrayList<FourTuple<A, B, C, D>> {
	public static void main(String[] args) {
		D20_TupleList<Vehicle, Amphibian, String, Integer> tl = new D20_TupleList<Vehicle, Amphibian, String, Integer>();
		tl.add(D04_TupleTest.h());
		tl.add(D04_TupleTest.h());
		for (FourTuple<Vehicle, Amphibian, String, Integer> i : tl)
			System.out.println(i);
	}
}