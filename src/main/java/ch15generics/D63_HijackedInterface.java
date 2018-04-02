package ch15generics;

/**
 * {CompileTimeError} (Won't compile)
 */

/*
class Cat extends D63_ComparablePet implements Comparable<Cat> {
	// Error: Comparable cannot be inherited with
	// different arguments: <Cat> and <Pet>
	public int compareTo(Cat arg) {
		return 0;
	}
}
*/