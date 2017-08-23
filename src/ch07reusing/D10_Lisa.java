package ch07reusing;

/**
 * {CompileTimeError} (Won't compile)
 */
class D10_Lisa extends Homer {
	// @Override
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}
