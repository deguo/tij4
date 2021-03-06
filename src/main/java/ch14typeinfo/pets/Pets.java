package ch14typeinfo.pets;

import java.util.*;

/**
 * Facade to produce a default PetCreator.
 */
public class Pets {
	public static final PetCreator creator = new D12_LiteralPetCreator();

	public static Pet randomPet() {
		return creator.randomPet();
	}

	public static Pet[] createArray(int size) {
		return creator.createArray(size);
	}

	public static ArrayList<Pet> arrayList(int size) {
		return creator.arrayList(size);
	}
}