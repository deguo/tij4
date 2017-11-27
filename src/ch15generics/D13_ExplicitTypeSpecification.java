package ch15generics;

import ch14typeinfo.pets.*;
import java.util.*;
import commons.util.*;

public class D13_ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) {
	}

	public static void main(String[] args) {
		f(New.<Person, List<Pet>>map());
	}
}