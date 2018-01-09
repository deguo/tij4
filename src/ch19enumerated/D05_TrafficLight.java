package ch19enumerated;

import static commons.util.Print.*;

/**
 * Enums in switch statements. <br>
 * Define an enum type:
 * 
 * <pre>
 * Output:
 * The traffic light is RED
 * The traffic light is GREEN
 * The traffic light is YELLOW
 * The traffic light is RED
 * The traffic light is GREEN
 * The traffic light is YELLOW
 * The traffic light is RED
 * </pre>
 */
enum Signal {
	GREEN, YELLOW, RED,
}

public class D05_TrafficLight {
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		// Note that you don't have to say Signal.RED
		// in the case statement:
		case RED:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		}
	}

	public String toString() {
		return "The traffic light is " + color;
	}

	public static void main(String[] args) {
		D05_TrafficLight t = new D05_TrafficLight();
		for (int i = 0; i < 7; i++) {
			print(t);
			t.change();
		}
	}
}