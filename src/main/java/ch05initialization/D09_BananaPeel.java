package ch05initialization;

class Banana {
	void peel(int i) {
		/* ... */
	}
}

public class D09_BananaPeel {
	public static void main(String[] args) {
		Banana a = new Banana(), b = new Banana();
		a.peel(1);
		b.peel(2);
	}
}