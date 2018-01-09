package ch19enumerated;

import java.util.*;
import static ch19enumerated.D25_Outcome.*;

/**
 * Multiple dispatching using an EnumMap of EnumMaps.
 * 
 * <pre>
 * Same output as RoShamBo2.java
 * </pre>
 */
enum D29_RoShamBo5 implements D26_Competitor<D29_RoShamBo5> {
	PAPER, SCISSORS, ROCK;
	static EnumMap<D29_RoShamBo5, EnumMap<D29_RoShamBo5, D25_Outcome>> table = new EnumMap<D29_RoShamBo5, EnumMap<D29_RoShamBo5, D25_Outcome>>(
			D29_RoShamBo5.class);
	static {
		for (D29_RoShamBo5 it : D29_RoShamBo5.values())
			table.put(it, new EnumMap<D29_RoShamBo5, D25_Outcome>(D29_RoShamBo5.class));
		initRow(PAPER, DRAW, LOSE, WIN);
		initRow(SCISSORS, WIN, DRAW, LOSE);
		initRow(ROCK, LOSE, WIN, DRAW);
	}

	static void initRow(D29_RoShamBo5 it, D25_Outcome vPAPER, D25_Outcome vSCISSORS, D25_Outcome vROCK) {
		EnumMap<D29_RoShamBo5, D25_Outcome> row = D29_RoShamBo5.table.get(it);
		row.put(D29_RoShamBo5.PAPER, vPAPER);
		row.put(D29_RoShamBo5.SCISSORS, vSCISSORS);
		row.put(D29_RoShamBo5.ROCK, vROCK);
	}

	public D25_Outcome compete(D29_RoShamBo5 it) {
		return table.get(this).get(it);
	}

	public static void main(String[] args) {
		D26_RoShamBo.play(D29_RoShamBo5.class, 20);
	}
}