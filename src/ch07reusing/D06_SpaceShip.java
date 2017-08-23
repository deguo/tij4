package ch07reusing;

public class D06_SpaceShip extends D06_SpaceShipControls {
	private String name;

	public D06_SpaceShip(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		D06_SpaceShip protector = new D06_SpaceShip("NSEA Protector");
		protector.forward(100);
	}
}