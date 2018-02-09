package ch21concurrency;

import java.util.concurrent.locks.*;

/**
 * Using explicit Lock objects to create critical sections.
 * 
 * <pre>
 * Output: (Sample)
 * pm1: Pair: x: 15, y: 15 checkCounter = 174035
 * pm2: Pair: x: 16, y: 16 checkCounter = 2608588
 * </pre>
 * 
 * 线程在进行ExplicitPairManager2中的increment()方法时，并不会影响PairManager中的另一个synchronized方法getPair()获得锁，因此，getPair().checkState()方法可能读取到共享资源p.x和p.y非同步状态的值。
 */
// Synchronize the entire method:
class ExplicitPairManager1 extends PairManager {
	private Lock lock = new ReentrantLock();

	public synchronized void increment() {
		lock.lock();
		try {
			p.incrementX();
			p.incrementY();
			store(getPair());
		} finally {
			lock.unlock();
		}
	}
}

// Use a critical section:
class ExplicitPairManager2 extends PairManager {
	private Lock lock = new ReentrantLock();

	public void increment() {
		Pair temp;
		lock.lock();
		try {
			p.incrementX();
			p.incrementY();
			temp = getPair();
		} finally {
			lock.unlock();
		}
		store(temp);
	}
}

public class D36_ExplicitCriticalSection {
	public static void main(String[] args) throws Exception {
		PairManager pman1 = new ExplicitPairManager1(), pman2 = new ExplicitPairManager2();
		D35_CriticalSection.testApproaches(pman1, pman2);
	}
}