package ch21concurrency;

/**
 * When threads collide.
 * 
 * <pre>
 * Output: (Sample)
 * Press Control-C to exit
 * 89476993 not even!
 * 89476993 not even!
 * </pre>
 * 
 * 有可能输出一个结果，也有可能输出多个结果
 */
public class D26_EvenGenerator extends D24_IntGenerator {
	private int currentEvenValue = 0;

	public int next() {
		++currentEvenValue; // Danger point here!
		Thread.yield();
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		D25_EvenChecker.test(new D26_EvenGenerator());
	}
}