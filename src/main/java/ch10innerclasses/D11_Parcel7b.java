package ch10innerclasses;

/**
 * Expanded version of D10_Parcel7.java
 */
public class D11_Parcel7b {
	class MyContents implements D07_Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	public D07_Contents contents() {
		return new MyContents();
	}

	public static void main(String[] args) {
		D11_Parcel7b p = new D11_Parcel7b();
		D07_Contents c = p.contents();
	}
}