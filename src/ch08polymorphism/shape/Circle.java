package ch08polymorphism.shape;

import static commons.util.Print.*;

public class Circle extends Shape {
	public void draw() {
		print("Circle.draw()");
	}

	public void erase() {
		print("Circle.erase()");
	}
}