package ch19enumerated;

import static ch19enumerated.D25_Outcome.*;

/**
 * Using constant-specific methods.
 * 
 * <pre>
 *  Same output as RoShamBo2.java
 * </pre>
 */

public enum D27_RoShamBo3 implements D26_Competitor<D27_RoShamBo3> {
	PAPER {
		public D25_Outcome compete(D27_RoShamBo3 it) {
			switch (it) {
			default: // To placate the compiler
			case PAPER:
				return DRAW;
			case SCISSORS:
				return LOSE;
			case ROCK:
				return WIN;
			}
		}
	},
	SCISSORS {
		public D25_Outcome compete(D27_RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return WIN;
			case SCISSORS:
				return DRAW;
			case ROCK:
				return LOSE;
			}
		}
	},
	ROCK {
		public D25_Outcome compete(D27_RoShamBo3 it) {
			switch (it) {
			default:
			case PAPER:
				return LOSE;
			case SCISSORS:
				return WIN;
			case ROCK:
				return DRAW;
			}
		}
	};
	public abstract D25_Outcome compete(D27_RoShamBo3 it);

	public static void main(String[] args) {
		D26_RoShamBo.play(D27_RoShamBo3.class, 20);
	}
}