package ch19enumerated;

/**
 * No values() method if you upcast an enum
 * 
 * <pre>
 * Output:
 * HITHER
 * YON
 * </pre>
 */
enum Search {
	HITHER, YON
}

public class D07_UpcastEnum {
	public static void main(String[] args) {
		Search[] vals = Search.values();
		Enum e = Search.HITHER; // Upcast
		// e.values(); // No values() in Enum
		for (Enum en : e.getClass().getEnumConstants())
			System.out.println(en);
	}
}