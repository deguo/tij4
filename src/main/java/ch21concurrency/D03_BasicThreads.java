package ch21concurrency;

/**
 * The most basic use of the Thread class.
 * 
 * <pre>
 * Output: (90% match)
 * Waiting for LiftOff
 * #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1), #0(Liftoff!),
 * </pre>
 */
public class D03_BasicThreads {
	public static void main(String[] args) {
		Thread t = new Thread(new D01_LiftOff());
		t.start();
		System.out.println("Waiting for LiftOff");
	}
}