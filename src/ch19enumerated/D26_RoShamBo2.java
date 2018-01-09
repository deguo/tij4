package ch19enumerated;

import static ch19enumerated.D25_Outcome.*;

/**
 * Switching one enum on another.
 * 
 * <pre>
 * Output:
 * ROCK vs. ROCK: DRAW
 * SCISSORS vs. ROCK: LOSE
 * SCISSORS vs. ROCK: LOSE
 * SCISSORS vs. ROCK: LOSE
 * PAPER vs. SCISSORS: LOSE
 * PAPER vs. PAPER: DRAW
 * PAPER vs. SCISSORS: LOSE
 * ROCK vs. SCISSORS: WIN
 * SCISSORS vs. SCISSORS: DRAW
 * ROCK vs. SCISSORS: WIN
 * SCISSORS vs. PAPER: WIN
 * SCISSORS vs. PAPER: WIN
 * ROCK vs. PAPER: LOSE
 * ROCK vs. SCISSORS: WIN
 * SCISSORS vs. ROCK: LOSE
 * PAPER vs. SCISSORS: LOSE
 * SCISSORS vs. PAPER: WIN
 * SCISSORS vs. PAPER: WIN
 * SCISSORS vs. PAPER: WIN
 * SCISSORS vs. PAPER: WIN
 * </pre>
 */
public enum D26_RoShamBo2 implements D26_Competitor<D26_RoShamBo2> {
	PAPER(DRAW, LOSE, WIN), SCISSORS(WIN, DRAW, LOSE), ROCK(LOSE, WIN, DRAW);
	private D25_Outcome vPAPER, vSCISSORS, vROCK;

	D26_RoShamBo2(D25_Outcome paper, D25_Outcome scissors, D25_Outcome rock) {
		this.vPAPER = paper;
		this.vSCISSORS = scissors;
		this.vROCK = rock;
	}

	public D25_Outcome compete(D26_RoShamBo2 it) {
		switch (it) {
		default:
		case PAPER:
			return vPAPER;
		case SCISSORS:
			return vSCISSORS;
		case ROCK:
			return vROCK;
		}
	}

	public static void main(String[] args) {
		D26_RoShamBo.play(D26_RoShamBo2.class, 20);
	}
}