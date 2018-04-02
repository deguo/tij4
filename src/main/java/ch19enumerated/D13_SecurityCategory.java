package ch19enumerated;

import commons.util.*;

/**
 * More succinct subcategorization of enums.
 * 
 * <pre>
 * Output:
 * BOND: MUNICIPAL
 * BOND: MUNICIPAL
 * STOCK: MARGIN
 * STOCK: MARGIN
 * BOND: JUNK
 * STOCK: SHORT
 * STOCK: LONG
 * STOCK: LONG
 * BOND: MUNICIPAL
 * BOND: JUNK
 * </pre>
 */
enum D13_SecurityCategory {
	STOCK(Security.Stock.class), BOND(Security.Bond.class);
	Security[] values;

	D13_SecurityCategory(Class<? extends Security> kind) {
		values = kind.getEnumConstants();
	}

	interface Security {
		enum Stock implements Security {
			SHORT, LONG, MARGIN
		}

		enum Bond implements Security {
			MUNICIPAL, JUNK
		}
	}

	public Security randomSelection() {
		return Enums.random(values);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			D13_SecurityCategory category = Enums.random(D13_SecurityCategory.class);
			System.out.println(category + ": " + category.randomSelection());
		}
	}
}