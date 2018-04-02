package ch19enumerated;

/**
 * <pre>
 * Output:
 * Scout
 * Cargo
 * Transport
 * Cruiser
 * Battleship
 * Mothership
 * </pre>
 */
public enum D04_SpaceShip {
	SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
	public String toString() {
		String id = name();
		String lower = id.substring(1).toLowerCase();
		return id.charAt(0) + lower;
	}

	public static void main(String[] args) {
		for (D04_SpaceShip s : values()) {
			System.out.println(s);
		}
	}
}