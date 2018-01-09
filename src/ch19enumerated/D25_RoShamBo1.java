package ch19enumerated;

import java.util.*;
import static ch19enumerated.D25_Outcome.*;

/**
 * Demonstration of multiple dispatching.
 * 
 * <pre>
 * Output:	
 * Rock vs. Rock: DRAW
 * Paper vs. Rock: WIN
 * Paper vs. Rock: WIN
 * Paper vs. Rock: WIN
 * Scissors vs. Paper: WIN
 * Scissors vs. Scissors: DRAW
 * Scissors vs. Paper: WIN
 * Rock vs. Paper: LOSE
 * Paper vs. Paper: DRAW
 * Rock vs. Paper: LOSE
 * Paper vs. Scissors: LOSE
 * Paper vs. Scissors: LOSE
 * Rock vs. Scissors: WIN
 * Rock vs. Paper: LOSE
 * Paper vs. Rock: WIN
 * Scissors vs. Paper: WIN
 * Paper vs. Scissors: LOSE
 * Paper vs. Scissors: LOSE
 * Paper vs. Scissors: LOSE
 * Paper vs. Scissors: LOSE
 * </pre>
 */
interface Item {
	D25_Outcome compete(Item it);

	D25_Outcome eval(Paper p);

	D25_Outcome eval(Scissors s);

	D25_Outcome eval(Rock r);
}

class Paper implements Item {
	public D25_Outcome compete(Item it) {
		return it.eval(this);
	}

	public D25_Outcome eval(Paper p) {
		return DRAW;
	}

	public D25_Outcome eval(Scissors s) {
		return WIN;
	}

	public D25_Outcome eval(Rock r) {
		return LOSE;
	}

	public String toString() {
		return "Paper";
	}
}

class Scissors implements Item {
	public D25_Outcome compete(Item it) {
		return it.eval(this);
	}

	public D25_Outcome eval(Paper p) {
		return LOSE;
	}

	public D25_Outcome eval(Scissors s) {
		return DRAW;
	}

	public D25_Outcome eval(Rock r) {
		return WIN;
	}

	public String toString() {
		return "Scissors";
	}
}

class Rock implements Item {
	public D25_Outcome compete(Item it) {
		return it.eval(this);
	}

	public D25_Outcome eval(Paper p) {
		return WIN;
	}

	public D25_Outcome eval(Scissors s) {
		return LOSE;
	}

	public D25_Outcome eval(Rock r) {
		return DRAW;
	}

	public String toString() {
		return "Rock";
	}
}

public class D25_RoShamBo1 {
	static final int SIZE = 20;
	private static Random rand = new Random(47);

	public static Item newItem() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Scissors();
		case 1:
			return new Paper();
		case 2:
			return new Rock();
		}
	}

	public static void match(Item a, Item b) {
		System.out.println(a + " vs. " + b + ": " + a.compete(b));
	}

	public static void main(String[] args) {
		for (int i = 0; i < SIZE; i++)
			match(newItem(), newItem());
	}
}