package ch19enumerated;

/** Same output as RoShamBo2.java */
public enum D28_RoShamBo4 implements D26_Competitor<D28_RoShamBo4> {
	ROCK {
		public D25_Outcome compete(D28_RoShamBo4 opponent) {
			return compete(SCISSORS, opponent);
		}
	},
	SCISSORS {
		public D25_Outcome compete(D28_RoShamBo4 opponent) {
			return compete(PAPER, opponent);
		}
	},
	PAPER {
		public D25_Outcome compete(D28_RoShamBo4 opponent) {
			return compete(ROCK, opponent);
		}
	};
	D25_Outcome compete(D28_RoShamBo4 loser, D28_RoShamBo4 opponent) {
		return ((opponent == this) ? D25_Outcome.DRAW : ((opponent == loser) ? D25_Outcome.WIN : D25_Outcome.LOSE));
	}

	public static void main(String[] args) {
		D26_RoShamBo.play(D28_RoShamBo4.class, 20);
	}
}