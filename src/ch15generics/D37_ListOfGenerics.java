package ch15generics;

import java.util.*;

public class D37_ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();

	public void add(T item) {
		array.add(item);
	}

	public T get(int index) {
		return array.get(index);
	}
}