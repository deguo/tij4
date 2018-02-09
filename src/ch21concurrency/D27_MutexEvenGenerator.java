package ch21concurrency;

import java.util.concurrent.locks.*;

/**
 * Preventing thread collisions with mutexes. <br>
 * {RunByHand}
 */
public class D27_MutexEvenGenerator extends D24_IntGenerator {
	private int currentEvenValue = 0;
	private Lock lock = new ReentrantLock();

	public int next() {
		lock.lock();
		try {
			++currentEvenValue;
			Thread.yield(); // Cause failure faster
			++currentEvenValue;
			return currentEvenValue;
		} finally {
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		D25_EvenChecker.test(new D27_MutexEvenGenerator());
	}
}