package ch15generics;

import java.util.*;

public class D29_ListMaker<T> {
	List<T> create() {
		return new ArrayList<T>();
	}

	public static void main(String[] args) {
		D29_ListMaker<String> stringMaker = new D29_ListMaker<String>();
		List<String> stringList = stringMaker.create();
	}
}