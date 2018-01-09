
package ch19enumerated;

import static ch19enumerated.D02_Spiciness.*;

/**
 * <pre>
 * Output:
 * Burrito is NOT
 * Burrito is MEDIUM
 * Burrito is HOT
 * </pre>
 */
public class D02_Burrito {
	D02_Spiciness degree;

	public D02_Burrito(D02_Spiciness degree) {
		this.degree = degree;
	}

	public String toString() {
		return "Burrito is " + degree;
	}

	public static void main(String[] args) {
		System.out.println(new D02_Burrito(NOT));
		System.out.println(new D02_Burrito(MEDIUM));
		System.out.println(new D02_Burrito(HOT));
	}
}