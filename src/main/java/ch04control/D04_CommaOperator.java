package ch04control;

/**
 * <pre>
 * Output:
* i = 1 j = 11
* i = 2 j = 4
* i = 3 j = 6
* i = 4 j = 8
 * </pre>
 */
public class D04_CommaOperator {
	public static void main(String[] args) {
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i = " + i + " j = " + j);
		}
	}
}
