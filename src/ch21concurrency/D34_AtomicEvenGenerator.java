package ch21concurrency;

import java.util.concurrent.atomic.*;

/**
 * Atomic classes are occasionally useful in regular code. <br>
 * {RunByHand}
 */
public class D34_AtomicEvenGenerator extends D24_IntGenerator {
	private AtomicInteger currentEvenValue = new AtomicInteger(0);

	public int next() {
		return currentEvenValue.addAndGet(2);
	}

	public static void main(String[] args) {
		D25_EvenChecker.test(new D34_AtomicEvenGenerator());
	}
}