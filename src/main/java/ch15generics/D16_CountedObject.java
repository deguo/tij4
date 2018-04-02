package ch15generics;

public class D16_CountedObject {
	private static long counter = 0;
	private final long id = counter++;

	public long id() {
		return id;
	}

	public String toString() {
		return "D16_CountedObject " + id;
	}
}