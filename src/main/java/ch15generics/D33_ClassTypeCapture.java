package ch15generics;

/**
 * <pre>
 * Output:
 * true
 * true
 * false
 * true
 * </pre>
 */
class Building {
}

class House extends Building {
}

public class D33_ClassTypeCapture<T> {
	Class<T> kind;

	public D33_ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}

	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}

	public static void main(String[] args) {
		D33_ClassTypeCapture<Building> ctt1 = new D33_ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building()));
		System.out.println(ctt1.f(new House()));
		D33_ClassTypeCapture<House> ctt2 = new D33_ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building()));
		System.out.println(ctt2.f(new House()));
	}
}