package ch05initialization;

/**
 * Demonstration of a simple constructor.
 * 
 * <pre>
 * Output:
 * Rock Rock Rock Rock Rock Rock Rock Rock Rock Rock
 * </pre>
 */
class Rock {
	Rock() { // This is the constructor
		System.out.print("Rock ");
	}
}

public class D01_SimpleConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			new Rock();
	}
}