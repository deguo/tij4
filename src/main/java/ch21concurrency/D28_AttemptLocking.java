package ch21concurrency;

import java.util.concurrent.*;
import java.util.concurrent.locks.*;

/**
 * Locks in the concurrent library allow you to give up on trying to acquire a
 * lock.
 * 
 * <pre>
 * Output:
 * tryLock(): true
 * tryLock(2, TimeUnit.SECONDS): true
 * acquired
 * tryLock(): false
 * tryLock(2, TimeUnit.SECONDS): false
 * </pre>
 */
public class D28_AttemptLocking {
	private ReentrantLock lock = new ReentrantLock();

	public void untimed() {
		boolean captured = lock.tryLock();
		try {
			System.out.println("tryLock(): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}

	public void timed() {
		boolean captured = false;
		try {
			captured = lock.tryLock(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
		try {
			System.out.println("tryLock(2, TimeUnit.SECONDS): " + captured);
		} finally {
			if (captured)
				lock.unlock();
		}
	}

	public static void main(String[] args) {
		final D28_AttemptLocking al = new D28_AttemptLocking();
		al.untimed(); // True -- lock is available
		al.timed(); // True -- lock is available
		// Now create a separate task to grab the lock:
		new Thread() {
			{
				setDaemon(true);
			}

			public void run() {
				al.lock.lock();
				System.out.println("acquired");
			}
		}.start();
		Thread.yield(); // Give the 2nd task a chance
		al.untimed(); // False -- lock grabbed by task
		al.timed(); // False -- lock grabbed by task
	}
}