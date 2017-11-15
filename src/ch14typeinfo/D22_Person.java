package ch14typeinfo;

import commons.util.*;

/**
 * A class with a Null Object.
 */
class D22_Person {
	public final String first;
	public final String last;
	public final String address;

	// etc.
	public D22_Person(String first, String last, String address) {
		this.first = first;
		this.last = last;
		this.address = address;
	}

	public String toString() {
		return "D22_Person: " + first + " " + last + " " + address;
	}

	public static class NullPerson extends D22_Person implements Null {
		private NullPerson() {
			super("None", "None", "None");
		}

		public String toString() {
			return "NullPerson";
		}
	}

	public static final D22_Person NULL = new NullPerson();
}