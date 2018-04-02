package ch13strings;

/**
 * <pre>
 * Output:
 * true
 * true
 * false
 * true
 * </pre>
 */
public class D12_IntegerMatch {
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("5678".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
		System.out.println("+911".matches("(-|\\+)?\\d+"));
	}
}
