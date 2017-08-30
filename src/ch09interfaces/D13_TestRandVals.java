package ch09interfaces;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * 8
 * -32032247016559954
 * -8.5939291E18
 * 5.779976127815049
 * </pre>
 */
public class D13_TestRandVals {
	public static void main(String[] args) {
		print(D12_RandVals.RANDOM_INT);
		print(D12_RandVals.RANDOM_LONG);
		print(D12_RandVals.RANDOM_FLOAT);
		print(D12_RandVals.RANDOM_DOUBLE);
	}
}