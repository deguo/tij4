package ch15generics;

import java.util.*;

/**
 * Adapt the D08_Fibonacci class to make it Iterable.
 * 
 * <pre>
 * Output:
 * 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
 * </pre>
 */
public class D09_IterableFibonacci extends D08_Fibonacci implements Iterable<Integer> {
	private int n;

	public D09_IterableFibonacci(int count) {
		n = count;
	}

	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}

			public Integer next() {
				n--;
				return D09_IterableFibonacci.this.next();
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (int i : new D09_IterableFibonacci(18))
			System.out.print(i + " ");
	}
}