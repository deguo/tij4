package ch10innerclasses;

/**
 * Putting test code in a nested class.<br>
 * {main: D20_TestBed$Tester}
 * 
 * <pre>
 * Output:
 * f()
 * </pre>
 */
public class D20_TestBed {
	public void f() {
		System.out.println("f()");
	}

	public static class Tester {
		public static void main(String[] args) {
			D20_TestBed t = new D20_TestBed();
			t.f();
		}
	}
}