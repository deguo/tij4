package ch19enumerated;

import java.util.*;
import static ch19enumerated.D15_AlarmPoints.*;
import static commons.util.Print.*;

/**
 * Basics of EnumMaps.
 * 
 * <pre>
 * Output:
 * BATHROOM: Bathroom alert!
 * KITCHEN: Kitchen fire!
 * java.lang.NullPointerException
 * </pre>
 */
interface Command {
	void action();
}

public class D17_EnumMaps {
	public static void main(String[] args) {
		EnumMap<D15_AlarmPoints, Command> em = new EnumMap<D15_AlarmPoints, Command>(D15_AlarmPoints.class);
		em.put(KITCHEN, new Command() {
			public void action() {
				print("Kitchen fire!");
			}
		});
		em.put(BATHROOM, new Command() {
			public void action() {
				print("Bathroom alert!");
			}
		});
		for (Map.Entry<D15_AlarmPoints, Command> e : em.entrySet()) {
			printnb(e.getKey() + ": ");
			e.getValue().action();
		}
		try { // If there's no value for a particular key:
			em.get(UTILITY).action();
		} catch (Exception e) {
			print(e);
		}
	}
}