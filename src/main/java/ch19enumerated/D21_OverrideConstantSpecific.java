package ch19enumerated;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * NUT: default behavior
 * BOLT: default behavior
 * WASHER: Overridden method
 * </pre>
 */
public enum D21_OverrideConstantSpecific {
	NUT, BOLT, WASHER {
		void f() {
			print("Overridden method");
		}
	};
	void f() {
		print("default behavior");
	}

	public static void main(String[] args) {
		for (D21_OverrideConstantSpecific ocs : values()) {
			printnb(ocs + ": ");
			ocs.f();
		}
	}
}