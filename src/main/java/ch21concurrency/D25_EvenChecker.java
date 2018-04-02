package ch21concurrency;

import java.util.concurrent.*;

public class D25_EvenChecker implements Runnable {
	private D24_IntGenerator generator;
	private final int id;

	public D25_EvenChecker(D24_IntGenerator g, int ident) {
		generator = g;
		id = ident;
	}

	public void run() {
		while (!generator.isCanceled()) {
			int val = generator.next();
			if (val % 2 != 0) {
				System.out.println(val + " not even!");
				generator.cancel(); // Cancels all EvenCheckers
			}
		}
	}

	// Test any type of IntGenerator:
	public static void test(D24_IntGenerator gp, int count) {
		System.out.println("Press Control-C to exit");
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < count; i++)
			exec.execute(new D25_EvenChecker(gp, i));
		exec.shutdown();
	}

	// Default value for count:
	public static void test(D24_IntGenerator gp) {
		test(gp, 10);
	}
}