package ch12exceptions;

import static commons.util.Print.*;

public class D13_Switch {
	private boolean state = false;

	public boolean read() {
		return state;
	}

	public void on() {
		state = true;
		print(this);
	}

	public void off() {
		state = false;
		print(this);
	}

	public String toString() {
		return state ? "on" : "off";
	}
}