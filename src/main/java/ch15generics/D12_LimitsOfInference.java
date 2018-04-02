package ch15generics;

import ch14typeinfo.pets.*;
import commons.util.New;

import java.util.*;

public class D12_LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
	}

	public static <K, V> void main(String[] args) {
		// 这里与think in java里面有出入，可以正常编译
		f(New.map()); // Does not compile
	}
}