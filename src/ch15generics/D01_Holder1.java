package ch15generics;

class Automobile {
}

public class D01_Holder1 {
	private Automobile a;

	public D01_Holder1(Automobile a) {
		this.a = a;
	}

	Automobile get() {
		return a;
	}
}