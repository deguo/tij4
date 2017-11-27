package ch15generics;

class Hamster extends D63_ComparablePet implements Comparable<D63_ComparablePet> {
	public int compareTo(D63_ComparablePet arg) {
		return 0;
	}
}

// Or just:

class Gecko extends D63_ComparablePet {
	public int compareTo(D63_ComparablePet arg) {
		return 0;
	}
}