package ch15generics;

public class D69_SelfBoundingMethods {
	static <T extends SelfBounded<T>> T f(T arg) {
		return arg.set(arg).get();
	}

	public static void main(String[] args) {
		A a = f(new A());
	}
}