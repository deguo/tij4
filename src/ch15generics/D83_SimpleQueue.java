package ch15generics;

import java.util.*;

/**
 * A different kind of container that is Iterable
 */
public class D83_SimpleQueue<T> implements Iterable<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void add(T t) {
		storage.offer(t);
	}

	public T get() {
		return storage.poll();
	}

	public Iterator<T> iterator() {
		return storage.iterator();
	}
}