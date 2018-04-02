package ch15generics;

/**
 * <pre>
 * Output:
 * Integer
 * Object
 * Double
 * </pre>
 */
public class D54_CaptureConversion {
	static <T> void f1(D47_Holder<T> holder) {
		T t = holder.get();
		System.out.println(t.getClass().getSimpleName());
	}

	static void f2(D47_Holder<?> holder) {
		f1(holder); // Call with captured type
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		D47_Holder raw = new D47_Holder<Integer>(1);
		// f1(raw); // Produces warnings
		f2(raw); // No warnings
		D47_Holder rawBasic = new D47_Holder();
		rawBasic.set(new Object()); // Warning
		f2(rawBasic); // No warnings
		// Upcast to D47_Holder<?>, still figures it out:
		D47_Holder<?> wildcarded = new D47_Holder<Double>(1.0);
		f2(wildcarded);
	}
}