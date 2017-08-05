package ch03operators.exercise;

import java.util.Random;

/**
 * Exercise 7
 * 
 * <pre>
 * Write a program that simulates coin-flipping.
 * Output:
 * OUTCOME: HEAD
 * </pre>
 */
public class E07_CoinFlipping {
	public static void main(String[] args) {
		Random rand = new Random(47);
		boolean flip = rand.nextBoolean();
		System.out.print("OUTCOME: ");
		System.out.println(flip ? "HEAD" : "TAIL");
	}
}
