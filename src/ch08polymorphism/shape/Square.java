package ch08polymorphism.shape;

import static commons.util.Print.*;

public class Square extends Shape {
	public void draw() {
		print("Square.draw()");
	}

	public void erase() {
		print("Square.erase()");
	}
}