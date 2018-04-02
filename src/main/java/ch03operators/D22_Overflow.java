package ch03operators;

/**
 * Surprise! Java lets you overflow.
 * 
 * <pre>
 * Output:
 * big = 2147483647
 * bigger = -4
 * </pre>
 */
public class D22_Overflow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
}