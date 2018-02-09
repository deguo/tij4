package ch21concurrency;

import java.util.concurrent.*;

/**
 * {ThrowsException}
 */
public class D20_ExceptionThread implements Runnable {
	public void run() {
		throw new RuntimeException();
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		exec.execute(new D20_ExceptionThread());
	}
}