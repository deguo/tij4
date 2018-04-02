package ch15generics;

/**
 * Removing the generic; code still works.
 * 
 * <pre>
 * Output:
 * Woof!
 * Sitting
 * Click!
 * Clank!
 * </pre>
 */
class CommunicateSimply {
	static void perform(D80_Performs performer) {
		performer.speak();
		performer.sit();
	}
}

public class D81_SimpleDogsAndRobots {
	public static void main(String[] args) {
		CommunicateSimply.perform(new PerformingDog());
		CommunicateSimply.perform(new Robot());
	}
}