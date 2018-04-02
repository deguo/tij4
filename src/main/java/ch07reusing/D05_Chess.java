package ch07reusing;

import static commons.util.Print.*;

/**
 * Inheritance, constructors and arguments.
 * 
 * <pre>
 * Output:
 * Game constructor
 * BoardGame constructor
 * D05_Chess constructor
 * </pre>
 */
class Game {
	Game(int i) {
		print("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		print("BoardGame constructor");
	}
}

public class D05_Chess extends BoardGame {
	D05_Chess() {
		super(11);
		print("D05_Chess constructor");
	}

	public static void main(String[] args) {
		D05_Chess x = new D05_Chess();
	}
}