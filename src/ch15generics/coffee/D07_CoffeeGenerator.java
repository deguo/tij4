package ch15generics.coffee;

import java.util.*;
import commons.util.*;

/**
 * Generate different types of Coffee:
 * 
 * <pre>
 * Output:
 * Americano 0
 * Latte 1
 * Americano 2
 * Mocha 3
 * Mocha 4
 * Breve 5
 * Americano 6
 * Latte 7
 * Cappuccino 8
 * Cappuccino 9
 * </pre>
 */
public class D07_CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class, };
	private static Random rand = new Random(47);

	public D07_CoffeeGenerator() {
	}

	// For iteration:
	private int size = 0;

	public D07_CoffeeGenerator(int sz) {
		size = sz;
	}

	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
			// Report programmer errors at run time:
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return D07_CoffeeGenerator.this.next();
		}

		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	};

	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	public static void main(String[] args) {
		D07_CoffeeGenerator gen = new D07_CoffeeGenerator();
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		for (Coffee c : new D07_CoffeeGenerator(5))
			System.out.println(c);
	}
}