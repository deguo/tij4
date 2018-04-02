package ch21concurrency;

/**
 * Demonstration of the Runnable interface.
 */
public class D01_LiftOff implements Runnable {
	protected int countDown = 10; // Default
	private static int taskCount = 0;
	private final int id = taskCount++;

	public D01_LiftOff() {
	}

	public D01_LiftOff(int countDown) {
		this.countDown = countDown;
	}

	public String status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "), ";
	}

	public void run() {
		while (countDown-- > 0) {
			System.out.print(status());
			Thread.yield();
		}
	}
}