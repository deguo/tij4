package ch20annotations;

import java.util.*;

/**
 * A stack built on a linkedList.
 */
public class D20_StackL<T> {
	private LinkedList<T> list = new LinkedList<T>();

	public void push(T v) {
		list.addFirst(v);
	}

	public T top() {
		return list.getFirst();
	}

	public T pop() {
		return list.removeFirst();
	}
}