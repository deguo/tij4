package ch21concurrency;

/**
 * <pre>
 *  Output:
 * #0(9), #0(8), #0(7), #0(6), #0(5), #0(4), #0(3), #0(2), #0(1), #0(Liftoff!),
 * </pre>
 */
public class D02_MainThread {
	public static void main(String[] args) {
		D01_LiftOff launch = new D01_LiftOff();
		launch.run();
	}
}