package ch15generics;

/**
 * {CompileTimeError} (Won't compile)
 */

/*
class Manipulator<T> {
	private T obj;

	public Manipulator(T x) {
		obj = x;
	}

	// Error: cannot find symbol: method f():
	public void manipulate() {
		obj.f();
	}
}

public class D24_Manipulation {
	public static void main(String[] args) {
		D24_HasF hf = new D24_HasF();
		Manipulator<D24_HasF> manipulator = new Manipulator<D24_HasF>(hf);
		manipulator.manipulate();
	}
}*/
