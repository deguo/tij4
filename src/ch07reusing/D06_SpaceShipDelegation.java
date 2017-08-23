package ch07reusing;

public class D06_SpaceShipDelegation {
	private String name;
	private D06_SpaceShipControls controls = new D06_SpaceShipControls();

	public D06_SpaceShipDelegation(String name) {
		this.name = name;
	}

	// Delegated methods:
	public void back(int velocity) {
		controls.back(velocity);
	}

	public void down(int velocity) {
		controls.down(velocity);
	}

	public void forward(int velocity) {
		controls.forward(velocity);
	}

	public void left(int velocity) {
		controls.left(velocity);
	}

	public void right(int velocity) {
		controls.right(velocity);
	}

	public void turboBoost() {
		controls.turboBoost();
	}

	public void up(int velocity) {
		controls.up(velocity);
	}

	public static void main(String[] args) {
		D06_SpaceShipDelegation protector = new D06_SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}