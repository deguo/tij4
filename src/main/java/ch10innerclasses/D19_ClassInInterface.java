package ch10innerclasses;

/**
 * {main: D19_ClassInInterface$Test}
 * 
 * <pre>
 * Output:
 * Howdy!
 * </pre>
 */
public interface D19_ClassInInterface {
	void howdy();

	class Test implements D19_ClassInInterface {
		public void howdy() {
			System.out.println("Howdy!");
		}

		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}