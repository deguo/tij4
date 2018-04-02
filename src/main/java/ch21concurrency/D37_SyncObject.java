package ch21concurrency;

import static commons.util.Print.*;

/**
 * Synchronizing on another object.
 * 
 * <pre>
 * Output: (Sample)
 * g()
 * f()
 * g()
 * f()
 * g()
 * f()
 * g()
 * f()
 * g()
 * f()
 * </pre>
 */
class DualSynch {
	private Object syncObject = new Object();

	public synchronized void f() {
		for (int i = 0; i < 5; i++) {
			print("f()");
			Thread.yield();
		}
	}

	public void g() {
		synchronized (syncObject) {
			for (int i = 0; i < 5; i++) {
				print("g()");
				Thread.yield();
			}
		}
	}
}

public class D37_SyncObject {
	public static void main(String[] args) {
		final DualSynch ds = new DualSynch();
		new Thread() {
			public void run() {
				ds.f();
			}
		}.start();
		ds.g();
	}
}