package ch19enumerated;

import java.util.*;

public enum D23_Input {
	NICKEL(5), DIME(10), QUARTER(25), DOLLAR(100), TOOTHPASTE(200), CHIPS(75), SODA(100), SOAP(50), ABORT_TRANSACTION {
		public int amount() { // Disallow
			throw new RuntimeException("ABORT.amount()");
		}
	},
	STOP { // This must be the last instance.
		public int amount() { // Disallow
			throw new RuntimeException("SHUT_DOWN.amount()");
		}
	};
	int value; // In cents

	D23_Input(int value) {
		this.value = value;
	}

	D23_Input() {
	}

	int amount() {
		return value;
	}; // In cents

	static Random rand = new Random(47);

	public static D23_Input randomSelection() {
		// Don't include STOP:
		return values()[rand.nextInt(values().length - 1)];
	}
}