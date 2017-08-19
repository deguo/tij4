package ch05initialization;

public class D19_MethodInit2 {
	int i = f();
	int j = g(i);

	int f() {
		return 11;
	}

	int g(int n) {
		return n * 10;
	}
}