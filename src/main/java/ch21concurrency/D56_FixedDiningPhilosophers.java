package ch21concurrency;

import java.util.concurrent.*;

/**
 * Dining philosophers without deadlock. <br>
 * {Args: 5 5 timeout}
 * 
 * <pre>
 * (Execute to see output)
 * </pre>
 */
public class D56_FixedDiningPhilosophers {
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
			if (i < (size - 1))
				exec.execute(new D54_Philosopher(sticks[i], sticks[i + 1], i, ponder));
			else
				exec.execute(new D54_Philosopher(sticks[0], sticks[i], i, ponder));
		if (args.length == 3 && args[2].equals("timeout"))
			TimeUnit.SECONDS.sleep(5);
		else {
			System.out.println("Press 'Enter' to quit");
			System.in.read();
		}
		exec.shutdownNow();
	}
}