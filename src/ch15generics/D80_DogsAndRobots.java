package ch15generics;

import ch14typeinfo.pets.*;
import static commons.util.Print.*;

/**
 * No latent typing in Java
 * 
 * <pre>
 * Output:
 * Woof!
 * Sitting
 * Click!
 * Clank!
 * </pre>
 */
class PerformingDog extends Dog implements D80_Performs {
	public void speak() {
		print("Woof!");
	}

	public void sit() {
		print("Sitting");
	}

	public void reproduce() {
	}
}

class Robot implements D80_Performs {
	public void speak() {
		print("Click!");
	}

	public void sit() {
		print("Clank!");
	}

	public void oilChange() {
	}
}

class Communicate {
	public static <T extends D80_Performs> void perform(T performer) {
		performer.speak();
		performer.sit();
	}
}

public class D80_DogsAndRobots {
	public static void main(String[] args) {
		PerformingDog d = new PerformingDog();
		Robot r = new Robot();
		Communicate.perform(d);
		Communicate.perform(r);
	}
}