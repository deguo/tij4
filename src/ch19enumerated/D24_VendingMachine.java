package ch19enumerated;

import java.util.*;
import commons.util.*;
import static ch19enumerated.D23_Input.*;
import static commons.util.Print.*;

/**
 * {Args: VendingMachineInput.txt}
 * 
 * <pre>
 * Output:
 * 25
 * 50
 * 75
 * here is your CHIPS
 * 0
 * 100
 * 200
 * here is your TOOTHPASTE
 * 0
 * 25
 * 35
 * Your change: 35
 * 0
 * 25
 * 35
 * Insufficient money for SODA
 * 35
 * 60
 * 70
 * 75
 * Insufficient money for SODA
 * 75
 * Your change: 75
 * 0
 * Halted
 * </pre>
 */
enum Category {
	MONEY(NICKEL, DIME, QUARTER, DOLLAR), ITEM_SELECTION(TOOTHPASTE, CHIPS, SODA,
			SOAP), QUIT_TRANSACTION(ABORT_TRANSACTION), SHUT_DOWN(STOP);
	private D23_Input[] values;

	Category(D23_Input... types) {
		values = types;
	}

	private static EnumMap<D23_Input, Category> categories = new EnumMap<D23_Input, Category>(D23_Input.class);
	static {
		for (Category c : Category.class.getEnumConstants())
			for (D23_Input type : c.values)
				categories.put(type, c);
	}

	public static Category categorize(D23_Input input) {
		return categories.get(input);
	}
}

public class D24_VendingMachine {
	private static State state = State.RESTING;
	private static int amount = 0;
	private static D23_Input selection = null;

	enum StateDuration {
		TRANSIENT
	} // Tagging enum

	enum State {
		RESTING {
			void next(D23_Input input) {
				switch (Category.categorize(input)) {
				case MONEY:
					amount += input.amount();
					state = ADDING_MONEY;
					break;
				case SHUT_DOWN:
					state = TERMINAL;
				default:
				}
			}
		},
		ADDING_MONEY {
			void next(D23_Input input) {
				switch (Category.categorize(input)) {
				case MONEY:
					amount += input.amount();
					break;
				case ITEM_SELECTION:
					selection = input;
					if (amount < selection.amount())
						print("Insufficient money for " + selection);
					else
						state = DISPENSING;
					break;
				case QUIT_TRANSACTION:
					state = GIVING_CHANGE;
					break;
				case SHUT_DOWN:
					state = TERMINAL;
				default:
				}
			}
		},
		DISPENSING(StateDuration.TRANSIENT) {
			void next() {
				print("here is your " + selection);
				amount -= selection.amount();
				state = GIVING_CHANGE;
			}
		},
		GIVING_CHANGE(StateDuration.TRANSIENT) {
			void next() {
				if (amount > 0) {
					print("Your change: " + amount);
					amount = 0;
				}
				state = RESTING;
			}
		},
		TERMINAL {
			void output() {
				print("Halted");
			}
		};
		private boolean isTransient = false;

		State() {
		}

		State(StateDuration trans) {
			isTransient = true;
		}

		void next(D23_Input input) {
			throw new RuntimeException("Only call " + "next(Input input) for non-transient states");
		}

		void next() {
			throw new RuntimeException("Only call next() for " + "StateDuration.TRANSIENT states");
		}

		void output() {
			print(amount);
		}
	}

	static void run(Generator<D23_Input> gen) {
		while (state != State.TERMINAL) {
			state.next(gen.next());
			while (state.isTransient)
				state.next();
			state.output();
		}
	}

	public static void main(String[] args) {
		Generator<D23_Input> gen = new RandomInputGenerator();
		if (args.length == 1)
			gen = new FileInputGenerator(args[0]);
		run(gen);
	}
}

// For a basic sanity check:
class RandomInputGenerator implements Generator<D23_Input> {
	public D23_Input next() {
		return D23_Input.randomSelection();
	}
}

// Create Inputs from a file of ';'-separated strings:
class FileInputGenerator implements Generator<D23_Input> {
	private Iterator<String> input;

	public FileInputGenerator(String fileName) {
		input = new TextFile(fileName, ";").iterator();
	}

	public D23_Input next() {
		if (!input.hasNext())
			return null;
		return Enum.valueOf(D23_Input.class, input.next().trim());
	}
}