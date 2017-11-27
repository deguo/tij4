package ch15generics;

/**
 * <pre>
 * Output:
 * java.lang.String
 * java.lang.Integer
 * java.lang.Double
 * java.lang.Float
 * java.lang.Character
 * D10_GenericMethods
 * </pre>
 */
public class D10_GenericMethods {
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		D10_GenericMethods gm = new D10_GenericMethods();
		gm.f("");
		gm.f(1);
		gm.f(1.0);
		gm.f(1.0F);
		gm.f('c');
		gm.f(gm);
	}
}