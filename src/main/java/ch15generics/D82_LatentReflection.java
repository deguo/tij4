package ch15generics;

import java.lang.reflect.*;
import static commons.util.Print.*;

/**
 * Using Reflection to produce latent typing.<br>
 * Does not implement D80_Performs:
 * 
 * <pre>
 * Output:
 * Woof!
 * Sitting
 * Click!
 * Clank!
 * Mime cannot speak
 * Pretending to sit
 * </pre>
 */
class Mime {
	public void walkAgainstTheWind() {
	}

	public void sit() {
		print("Pretending to sit");
	}

	public void pushInvisibleWalls() {
	}

	public String toString() {
		return "Mime";
	}
}

// Does not implement D80_Performs:
class SmartDog {
	public void speak() {
		print("Woof!");
	}

	public void sit() {
		print("Sitting");
	}

	public void reproduce() {
	}
}

class CommunicateReflectively {
	public static void perform(Object speaker) {
		Class<?> spkr = speaker.getClass();
		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch (NoSuchMethodException e) {
				print(speaker + " cannot speak");
			}
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch (NoSuchMethodException e) {
				print(speaker + " cannot sit");
			}
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString(), e);
		}
	}
}

public class D82_LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Robot());
		CommunicateReflectively.perform(new Mime());
	}
}