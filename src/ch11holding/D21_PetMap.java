package ch11holding;

import ch14typeinfo.pets.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * {My Cat=Cat Molly, My Hamster=Hamster Bosco, My Dog=Dog Ginger}
 * Dog Ginger
 * true
 * true
 * </pre>
 */

public class D21_PetMap {
	public static void main(String[] args) {
		Map<String, Pet> petMap = new HashMap<String, Pet>();
		petMap.put("My Cat", new Cat("Molly"));
		petMap.put("My Dog", new Dog("Ginger"));
		petMap.put("My Hamster", new Hamster("Bosco"));
		print(petMap);
		Pet dog = petMap.get("My Dog");
		print(dog);
		print(petMap.containsKey("My Dog"));
		print(petMap.containsValue(dog));
	}
}