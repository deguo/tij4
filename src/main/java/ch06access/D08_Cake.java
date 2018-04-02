package ch06access;

/**
 * Accesses a class in a separate compilation unit.
 * 
 * <pre>
 * Output:
 * D09_Pie.f()
 * </pre>
 */
class D08_Cake {
	public static void main(String[] args) {
		D09_Pie x = new D09_Pie();
		x.f();
	}
}