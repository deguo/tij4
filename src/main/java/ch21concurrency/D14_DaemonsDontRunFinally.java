package ch21concurrency;

import java.util.concurrent.*;
import static commons.util.Print.*;

/**
 * Daemon threads don't run the finally clause
 * 
 * <pre>
 * Output:
 * Starting ADaemon
 * </pre>
 */
class ADaemon implements Runnable {
	public void run() {
		try {
			print("Starting ADaemon");
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			print("Exiting via InterruptedException");
		} finally {
			print("This should always run?");
		}
	}
}

public class D14_DaemonsDontRunFinally {
	public static void main(String[] args) throws Exception {
		Thread t = new Thread(new ADaemon());
		t.setDaemon(true);
		t.start();
	}
}