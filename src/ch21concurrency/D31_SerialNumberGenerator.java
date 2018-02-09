package ch21concurrency;

public class D31_SerialNumberGenerator {
	private static volatile int serialNumber = 0;

	public static int nextSerialNumber() {
		return serialNumber++; // Not thread-safe
	}
}