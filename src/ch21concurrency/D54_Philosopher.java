package ch21concurrency;

import java.util.concurrent.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * A dining philosopher
 */
public class D54_Philosopher implements Runnable {
	private D53_Chopstick left;
	private D53_Chopstick right;
	private final int id;
	private final int ponderFactor;
	private Random rand = new Random(47);

	private void pause() throws InterruptedException {
		if (ponderFactor == 0)
			return;
		TimeUnit.MILLISECONDS.sleep(rand.nextInt(ponderFactor * 250));
	}

	public D54_Philosopher(D53_Chopstick left, D53_Chopstick right, int ident, int ponder) {
		this.left = left;
		this.right = right;
		id = ident;
		ponderFactor = ponder;
	}

	public void run() {
		try {
			while (!Thread.interrupted()) {
				print(this + " " + "thinking");
				pause();
				// Philosopher becomes hungry
				print(this + " " + "grabbing right");
				right.take();
				print(this + " " + "grabbing left");
				left.take();
				print(this + " " + "eating");
				pause();
				right.drop();
				left.drop();
			}
		} catch (InterruptedException e) {
			print(this + " " + "exiting via interrupt");
		}
	}

	public String toString() {
		return "Philosopher " + id;
	}
}