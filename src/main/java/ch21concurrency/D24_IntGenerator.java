package ch21concurrency;

public abstract class D24_IntGenerator {
	private volatile boolean canceled = false;

	public abstract int next();

	// Allow this to be canceled:
	public void cancel() {
		canceled = true;
	}

	public boolean isCanceled() {
		return canceled;
	}
}