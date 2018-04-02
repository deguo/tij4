package ch19enumerated;

import static commons.util.Print.*;

/**
 * The witches in the land of Oz.
 * 
 * <pre>
 * Output:
 * WEST: Miss Gulch, aka the Wicked Witch of the West
 * NORTH: Glinda, the Good Witch of the North
 * EAST: Wicked Witch of the East, wearer of the Ruby Slippers, crushed by Dorothy's house
 * SOUTH: Good by inference, but missing
 * </pre>
 */
public enum D03_OzWitch {
	// Instances must be defined first, before methods:
	WEST("Miss Gulch, aka the Wicked Witch of the West"), NORTH("Glinda, the Good Witch of the North"), EAST(
			"Wicked Witch of the East, wearer of the Ruby " + "Slippers, crushed by Dorothy's house"), SOUTH(
					"Good by inference, but missing");
	private String description;

	// Constructor must be package or private access:
	private D03_OzWitch(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static void main(String[] args) {
		for (D03_OzWitch witch : D03_OzWitch.values())
			print(witch + ": " + witch.getDescription());
	}
}