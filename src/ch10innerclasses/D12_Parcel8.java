package ch10innerclasses;

/**
 * Calling the base-class constructor.
 */
public class D12_Parcel8 {
	public D12_Wrapping wrapping(int x) {
		// Base constructor call:
		return new D12_Wrapping(x) { // Pass constructor argument.
			public int value() {
				return super.value() * 47;
			}
		}; // Semicolon required
	}

	public static void main(String[] args) {
		D12_Parcel8 p = new D12_Parcel8();
		D12_Wrapping w = p.wrapping(10);
	}
}