package ch19enumerated.menu;

/**
 * <pre>
 * Output:
 * SPRING_ROLLS
 * VINDALOO
 * FRUIT
 * DECAF_COFFEE
 * ---
 * SOUP
 * VINDALOO
 * FRUIT
 * TEA
 * ---
 * SALAD
 * BURRITO
 * FRUIT
 * TEA
 * ---
 * SALAD
 * BURRITO
 * CREME_CARAMEL
 * LATTE
 * ---
 * SOUP
 * BURRITO
 * TIRAMISU
 * ESPRESSO
 * ---
 * </pre>
 */
public class D12_Meal {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (Course course : Course.values()) {
				Food food = course.randomSelection();
				System.out.println(food);
			}
			System.out.println("---");
		}
	}
}