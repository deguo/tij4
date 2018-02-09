package ch21concurrency;

/**
 * Simplifying mutexes with the synchronized keyword. <br>
 * {RunByHand}
 */
public class D27_SynchronizedEvenGenerator extends D24_IntGenerator {
	private int currentEvenValue = 0;

	public synchronized int next() {
		++currentEvenValue;
		Thread.yield(); // Cause failure faster
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		D25_EvenChecker.test(new D27_SynchronizedEvenGenerator());
	}
}