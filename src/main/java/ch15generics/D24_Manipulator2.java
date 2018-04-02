package ch15generics;

class D24_Manipulator2<T extends D24_HasF> {
	private T obj;

	public D24_Manipulator2(T x) {
		obj = x;
	}

	public void manipulate() {
		obj.f();
	}
}