package ch15generics;

/**
 * Exploring the meaning of wildcards.
 */
public class D53_Wildcards {
	// Raw argument:
	static void rawArgs(D47_Holder holder, Object arg) {
		// holder.set(arg); // Warning:
		// Unchecked call to set(T) as a
		// member of the raw type D47_Holder
		// holder.set(new D53_Wildcards()); // Same warning

		// Can't do this; don't have any 'T':
		// T t = holder.get();

		// OK, but type information has been lost:
		Object obj = holder.get();
	}

	// Similar to rawArgs(), but errors instead of warnings:
	static void unboundedArg(D47_Holder<?> holder, Object arg) {
		// holder.set(arg); // Error:
		// set(capture of ?) in D47_Holder<capture of ?>
		// cannot be applied to (Object)
		// holder.set(new D53_Wildcards()); // Same error

		// Can't do this; don't have any 'T':
		// T t = holder.get();

		// OK, but type information has been lost:
		Object obj = holder.get();
	}

	static <T> T exact1(D47_Holder<T> holder) {
		T t = holder.get();
		return t;
	}

	static <T> T exact2(D47_Holder<T> holder, T arg) {
		holder.set(arg);
		T t = holder.get();
		return t;
	}

	static <T> T wildSubtype(D47_Holder<? extends T> holder, T arg) {
		// holder.set(arg); // Error:
		// set(capture of ? extends T) in
		// D47_Holder<capture of ? extends T>
		// cannot be applied to (T)
		T t = holder.get();
		return t;
	}

	static <T> void wildSupertype(D47_Holder<? super T> holder, T arg) {
		holder.set(arg);
		// T t = holder.get(); // Error:
      // Incompatible types: found Object, required T

		// OK, but type information has been lost:
		Object obj = holder.get();
	}

	public static void main(String[] args) {
		D47_Holder raw = new D47_Holder<Long>();
		// Or:
		raw = new D47_Holder();
		D47_Holder<Long> qualified = new D47_Holder<Long>();
		D47_Holder<?> unbounded = new D47_Holder<Long>();
		D47_Holder<? extends Long> bounded = new D47_Holder<Long>();
		Long lng = 1L;

		rawArgs(raw, lng);
		rawArgs(qualified, lng);
		rawArgs(unbounded, lng);
		rawArgs(bounded, lng);

		unboundedArg(raw, lng);
		unboundedArg(qualified, lng);
		unboundedArg(unbounded, lng);
		unboundedArg(bounded, lng);

		// Object r1 = exact1(raw); // Warnings:
		// Unchecked conversion from D47_Holder to D47_Holder<T>
		// Unchecked method invocation: exact1(D47_Holder<T>)
		// is applied to (D47_Holder)
		Long r2 = exact1(qualified);
		Object r3 = exact1(unbounded); // Must return Object
		Long r4 = exact1(bounded);

		// Long r5 = exact2(raw, lng); // Warnings:
		// Unchecked conversion from D47_Holder to D47_Holder<Long>
		// Unchecked method invocation: exact2(D47_Holder<T>,T)
		// is applied to (D47_Holder,Long)
		Long r6 = exact2(qualified, lng);
		// Long r7 = exact2(unbounded, lng); // Error:
		// exact2(D47_Holder<T>,T) cannot be applied to
		// (D47_Holder<capture of ?>,Long)
		// Long r8 = exact2(bounded, lng); // Error:
		// exact2(D47_Holder<T>,T) cannot be applied
		// to (D47_Holder<capture of ? extends Long>,Long)

		// Long r9 = wildSubtype(raw, lng); // Warnings:
		// Unchecked conversion from D47_Holder
		// to D47_Holder<? extends Long>
		// Unchecked method invocation:
		// wildSubtype(D47_Holder<? extends T>,T) is
		// applied to (D47_Holder,Long)
		Long r10 = wildSubtype(qualified, lng);
		// OK, but can only return Object:
		Object r11 = wildSubtype(unbounded, lng);
		Long r12 = wildSubtype(bounded, lng);

		// wildSupertype(raw, lng); // Warnings:
		// Unchecked conversion from D47_Holder
		// to D47_Holder<? super Long>
		// Unchecked method invocation:
		// wildSupertype(D47_Holder<? super T>,T)
		// is applied to (D47_Holder,Long)
		wildSupertype(qualified, lng);
		// wildSupertype(unbounded, lng); // Error:
		// wildSupertype(D47_Holder<? super T>,T) cannot be
		// applied to (D47_Holder<capture of ?>,Long)
		// wildSupertype(bounded, lng); // Error:
		// wildSupertype(D47_Holder<? super T>,T) cannot be
		// applied to (D47_Holder<capture of ? extends Long>,Long)
	}
}