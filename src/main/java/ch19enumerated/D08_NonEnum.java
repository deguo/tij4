package ch19enumerated;

/**
 * <pre>
 * Output:
 * java.lang.NullPointerException
 * </pre>
 */
public class D08_NonEnum {
	public static void main(String[] args) {
		Class<Integer> intClass = Integer.class;
		try {
			for (Object en : intClass.getEnumConstants())
				System.out.println(en);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}