package ch13strings;

/**
 * <pre>
 * Output:
 * D11_DatabaseException: (t3, q7) Write failed
 * </pre>
 */
public class D11_DatabaseException extends Exception {
	public D11_DatabaseException(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}

	public static void main(String[] args) {
		try {
			throw new D11_DatabaseException(3, 7, "Write failed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}