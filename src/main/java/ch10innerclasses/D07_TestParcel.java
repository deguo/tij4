package ch10innerclasses;

class Parcel4 {
	private class PContents implements D07_Contents {
		private int i = 11;

		public int value() {
			return i;
		}
	}

	protected class PDestination implements D07_Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		public String readLabel() {
			return label;
		}
	}

	public D07_Destination destination(String s) {
		return new PDestination(s);
	}

	public D07_Contents contents() {
		return new PContents();
	}
}

public class D07_TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		D07_Contents c = p.contents();
		D07_Destination d = p.destination("Tasmania");
		// Illegal -- can't access private class:
		// ! Parcel4.PContents pc = p.new PContents();
	}
}