package ch21concurrency;

/**
 * Chopsticks for dining philosophers.
 */
public class D53_Chopstick {
	private boolean taken = false;

	public synchronized void take() throws InterruptedException {
		while (taken)
			wait();
		taken = true;
	}

	public synchronized void drop() {
		taken = false;
		notifyAll();
	}
}