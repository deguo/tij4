package ch12exceptions;

/**
 * Catching exception hierarchies.
 * 
 * <pre>
 * Output:
 * Caught Sneeze
 * Caught Annoyance
 * </pre>
 */
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

public class D23_Human {
	public static void main(String[] args) {
		// Catch the exact type:
		try {
			throw new Sneeze();
		} catch (Sneeze s) {
			System.out.println("Caught Sneeze");
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
		// Catch the base type:
		try {
			throw new Sneeze();
		} catch (Annoyance a) {
			System.out.println("Caught Annoyance");
		}
	}
}