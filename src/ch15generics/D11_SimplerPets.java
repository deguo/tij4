package ch15generics;

import ch14typeinfo.pets.*;
import java.util.*;
import commons.util.*;

public class D11_SimplerPets {
	public static void main(String[] args) {
		Map<Person, List<? extends Pet>> petPeople = New.map();
		// Rest of the code is the same...
	}
}