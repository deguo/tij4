package ch21concurrency;

import java.util.concurrent.*;

/**
 * Demonstrates how deadlock can be hidden in a program. <br>
 * {Args: 0 5 timeout}
 * 
 * <pre>
 * (Execute to see output)
 * </pre>
 */
public class D55_DeadlockingDiningPhilosophers {
	public static void main(String[] args) throws Exception {
		int ponder = 5;
		if (args.length > 0)
			ponder = Integer.parseInt(args[0]);
		int size = 5;
		if (args.length > 1)
			size = Integer.parseInt(args[1]);
		ExecutorService exec = Executors.newCachedThreadPool();
		D53_Chopstick[] sticks = new D53_Chopstick[size];
		for (int i = 0; i < size; i++)
			sticks[i] = new D53_Chopstick();
		for (int i = 0; i < size; i++)
			exec.execute(new D54_Philosopher(sticks[i], sticks[(i + 1) % size], i, ponder));
		if (args.length == 3 && args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else {
			System.out.println("Press 'Enter' to quit");
			System.in.read();
		}
		exec.shutdownNow();
	}
}