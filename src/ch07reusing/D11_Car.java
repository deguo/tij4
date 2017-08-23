package ch07reusing;

/**
 * Composition with public objects.
 */
class Engine {
	public void start() {
	}

	public void rev() {
	}

	public void stop() {
	}
}

class Wheel {
	public void inflate(int psi) {
	}
}

class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

class Door {
	public Window window = new Window();

	public void open() {
	}

	public void close() {
	}
}

public class D11_Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 2-door

	public D11_Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		D11_Car d11Car = new D11_Car();
		d11Car.left.window.rollup();
		d11Car.wheel[0].inflate(72);
	}
}