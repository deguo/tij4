package ch21concurrency;

import java.util.concurrent.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * Testing the Pool class
 * 
 * <pre>
 * (Execute to see output)
 * </pre>
 */
// A task to check a resource out of a pool:
class CheckoutTask<T> implements Runnable {
	private static int counter = 0;
	private final int id = counter++;
	private D62_Pool<T> pool;

	public CheckoutTask(D62_Pool<T> pool) {
		this.pool = pool;
	}

	public void run() {
		try {
			T item = pool.checkOut();
			print(this + "checked out " + item);
			TimeUnit.SECONDS.sleep(1);
			print(this + "checking in " + item);
			pool.checkIn(item);
		} catch (InterruptedException e) {
			// Acceptable way to terminate
		}
	}

	public String toString() {
		return "CheckoutTask " + id + " ";
	}
}

public class D64_SemaphoreDemo {
	final static int SIZE = 25;

	public static void main(String[] args) throws Exception {
		final D62_Pool<D63_Fat> pool = new D62_Pool<D63_Fat>(D63_Fat.class, SIZE);
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < SIZE; i++)
			exec.execute(new CheckoutTask<D63_Fat>(pool));
		print("All CheckoutTasks created");
		List<D63_Fat> list = new ArrayList<D63_Fat>();
		for (int i = 0; i < SIZE; i++) {
			D63_Fat f = pool.checkOut();
			printnb(i + ": main() thread checked out ");
			f.operation();
			list.add(f);
		}
		Future<?> blocked = exec.submit(new Runnable() {
			public void run() {
				try {
					// Semaphore prevents additional checkout,
					// so call is blocked:
					pool.checkOut();
				} catch (InterruptedException e) {
					print("checkOut() Interrupted");
				}
			}
		});
		TimeUnit.SECONDS.sleep(2);
		blocked.cancel(true); // Break out of blocked call
		print("Checking in objects in " + list);
		for (D63_Fat f : list)
			pool.checkIn(f);
		for (D63_Fat f : list)
			pool.checkIn(f); // Second checkIn ignored
		exec.shutdown();
	}
}