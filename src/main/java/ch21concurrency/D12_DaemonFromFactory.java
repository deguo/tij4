package ch21concurrency;

import java.util.concurrent.*;
import commons.util.*;
import static commons.util.Print.*;

/**
 * Using a Thread Factory to create daemons.
 * 
 * <pre>
 * (Execute to see output)
 * </pre>
 */
public class D12_DaemonFromFactory implements Runnable {
	public void run() {
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				print(Thread.currentThread() + " " + this);
			}
		} catch (InterruptedException e) {
			print("Interrupted");
		}
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++)
			exec.execute(new D12_DaemonFromFactory());
		print("All daemons started");
		TimeUnit.MILLISECONDS.sleep(500); // Run for a while
	}
}