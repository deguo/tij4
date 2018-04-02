package ch05initialization;

/**
 * <pre>
 * Output:
 * This burrito is not spicy at all.
 * This burrito is a little hot.
 * This burrito is maybe too hot.
 * </pre>
 */
public class D43_Burrito {
	D40_Spiciness degree;

	public D43_Burrito(D40_Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
		}
	}

	public static void main(String[] args) {
		D43_Burrito plain = new D43_Burrito(D40_Spiciness.NOT), greenChile = new D43_Burrito(D40_Spiciness.MEDIUM),
				jalapeno = new D43_Burrito(D40_Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}
}