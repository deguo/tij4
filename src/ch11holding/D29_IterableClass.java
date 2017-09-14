package ch11holding;

import java.util.*;

/**
 * Anything Iterable works with foreach.
 * 
 * <pre>
 * Output:
 * And that is how we know the Earth to be banana-shaped.
 * </pre>
 */
public class D29_IterableClass implements Iterable<String> {
	protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			public boolean hasNext() {
				return index < words.length;
			}

			public String next() {
				return words[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (String s : new D29_IterableClass())
			System.out.print(s + " ");
	}
}