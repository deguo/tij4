package ch09interfaces;

import static commons.util.Print.*;
// A Game framework using Factory Methods.

/**
 * <pre>
 * Output:
 * Checkers move 0
 * Checkers move 1
 * Checkers move 2
 * Chess move 0
 * Chess move 1
 * Chess move 2
 * Chess move 3
 * </pre>
 */
interface Game {
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		print("Checkers move " + moves);
		return ++moves != MOVES;
	}
}

class CheckersFactory implements GameFactory {
	public Game getGame() {
		return new Checkers();
	}
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		print("Chess move " + moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory {
	public Game getGame() {
		return new Chess();
	}
}

public class D16_Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}