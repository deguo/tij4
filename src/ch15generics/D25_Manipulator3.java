package ch15generics;

class D25_Manipulator3 {
	private D24_HasF obj;

	public D25_Manipulator3(D24_HasF x) {
		obj = x;
	}

	public void manipulate() {
		obj.f();
	}
}