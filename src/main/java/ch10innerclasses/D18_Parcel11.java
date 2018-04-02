package ch10innerclasses;

/**
 * Nested classes (static inner classes).
 */
public class D18_Parcel11 {
	private static class ParcelContents implements D07_Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected static class ParcelDestination implements D07_Destination {
		private String label;

		private ParcelDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}

		// Nested classes can contain other static elements:
		public static void f() {
		}

		static int x = 10;

		static class AnotherLevel {
			public static void f() {
			}

			static int x = 10;
		}
	}

	public static D07_Destination destination(String s) {
		return new ParcelDestination(s);
	}

	public static D07_Contents contents() {
		return new ParcelContents();
	}

	public static void main(String[] args) {
		D07_Contents c = contents();
		D07_Destination d = destination("Tasmania");
	}
}