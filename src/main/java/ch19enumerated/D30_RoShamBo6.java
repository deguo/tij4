package ch19enumerated;

import static ch19enumerated.D25_Outcome.*;

/**
 * Enums using "tables" instead of multiple dispatch.
 */
enum D30_RoShamBo6 implements D26_Competitor<D30_RoShamBo6> {
	PAPER, SCISSORS, ROCK;
	private static D25_Outcome[][] table = { { DRAW, LOSE, WIN }, // PAPER
			{ WIN, DRAW, LOSE }, // SCISSORS
			{ LOSE, WIN, DRAW }, // ROCK
	};

	public D25_Outcome compete(D30_RoShamBo6 other) {
		return table[this.ordinal()][other.ordinal()];
	}

	public static void main(String[] args) {
		D26_RoShamBo.play(D30_RoShamBo6.class, 20);
	}
}