package ch05initialization;

public class MethodInit2 {
	int i = f();
	int j = g(i);

	int f() {
		return 11;
	}

	int g(int n) {
		return n * 10;
	}
}