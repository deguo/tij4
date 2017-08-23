package ch08polymorphism;

/**
 * Static methods are not polymorphic.
 * 
 * <pre>
 * Output:
 * Base staticGet()
 * Derived dynamicGet()
 * </pre>
 */
class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class D07_StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // Upcast
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}