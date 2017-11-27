package ch15generics;

import commons.util.*;

/**
 * Generate a D08_Fibonacci sequence.
 * 
 * <pre>
 * Output:
 * 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
 * </pre>
 */
public class D08_Fibonacci implements Generator<Integer> {
	private int count = 0;

	public Integer next() {
		return fib(count++);
	}

	private int fib(int n) {
		if (n < 2)
			return 1;
		return fib(n - 2) + fib(n - 1);
	}

	public static void main(String[] args) {
		D08_Fibonacci gen = new D08_Fibonacci();
		for (int i = 0; i < 18; i++)
			System.out.print(gen.next() + " ");
	}
}