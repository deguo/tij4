package ch15generics;

public class D03_Holder3<T> {
	private T a;

	public D03_Holder3(T a) {
		this.a = a;
	}

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}

	public static void main(String[] args) {
		D03_Holder3<Automobile> h3 = new D03_Holder3<Automobile>(new Automobile());
		Automobile a = h3.get(); // No cast needed
		// h3.set("Not an Automobile"); // Error
		// h3.set(1); // Error
	}
}