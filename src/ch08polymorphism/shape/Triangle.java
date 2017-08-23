package ch08polymorphism.shape;

import static commons.util.Print.*;

public class Triangle extends Shape {
	public void draw() {
		print("Triangle.draw()");
	}

	public void erase() {
		print("Triangle.erase()");
	}
}