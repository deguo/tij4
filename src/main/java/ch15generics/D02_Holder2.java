package ch15generics;

public class D02_Holder2 {
	private Object a;

	public D02_Holder2(Object a) {
		this.a = a;
	}

	public void set(Object a) {
		this.a = a;
	}

	public Object get() {
		return a;
	}

	public static void main(String[] args) {
		D02_Holder2 h2 = new D02_Holder2(new Automobile());
		Automobile a = (Automobile) h2.get();
		h2.set("Not an Automobile");
		String s = (String) h2.get();
		h2.set(1); // Autoboxes to Integer
		Integer x = (Integer) h2.get();
	}
}