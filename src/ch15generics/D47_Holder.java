package ch15generics;

/**
 * <pre>
 * Output: (Sample)
 * java.lang.ClassCastException: Apple cannot be cast to Orange true
 * </pre>
 */
public class D47_Holder<T> {
	private T value;

	public D47_Holder() {
	}

	public D47_Holder(T val) {
		value = val;
	}

	public void set(T val) {
		value = val;
	}

	public T get() {
		return value;
	}

	public boolean equals(Object obj) {
		return value.equals(obj);
	}

	public static void main(String[] args) {
		D47_Holder<Apple> Apple = new D47_Holder<Apple>(new Apple());
		Apple d = Apple.get();
		Apple.set(d);
		// D47_Holder<Fruit> Fruit = Apple; // Cannot upcast
		D47_Holder<? extends Fruit> fruit = Apple; // OK
		Fruit p = fruit.get();
		d = (Apple) fruit.get(); // Returns 'Object'
		try {
			Orange c = (Orange) fruit.get(); // No warning
		} catch (Exception e) {
			System.out.println(e);
		}
		// fruit.set(new Apple()); // Cannot call set()
		// fruit.set(new Fruit()); // Cannot call set()
		System.out.println(fruit.equals(d)); // OK
	}
}