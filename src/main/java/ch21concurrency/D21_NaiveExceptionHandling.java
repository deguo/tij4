package ch21concurrency;

import java.util.concurrent.*;

/**
 * {ThrowsException}
 */
public class D21_NaiveExceptionHandling {
	public static void main(String[] args) {
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new D20_ExceptionThread());
		} catch (RuntimeException ue) {
			// This statement will NOT execute!
			System.out.println("Exception has been handled!");
		}
	}
}