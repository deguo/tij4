package ch13strings;

import java.util.*;

/**
 * Accidental recursion.<br>
 * {RunByHand}
 */
public class D06_InfiniteRecursion {
	public String toString() {
		// return " D06_InfiniteRecursion address: " + this + "\n";
		return " D06_InfiniteRecursion address: " + super.toString() + "\n";
	}

	public static void main(String[] args) {
		List<D06_InfiniteRecursion> v = new ArrayList<D06_InfiniteRecursion>();
		for (int i = 0; i < 10; i++)
			v.add(new D06_InfiniteRecursion());
		System.out.println(v);
	}
}