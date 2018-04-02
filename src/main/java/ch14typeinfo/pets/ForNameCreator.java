package ch14typeinfo.pets;

import java.util.*;

public class ForNameCreator extends PetCreator {
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	// Types that you want to be randomly created:
	private static String[] typeNames = { "ch14typeinfo.pets.Mutt", "ch14typeinfo.pets.Pug",
			"ch14typeinfo.pets.EgyptianMau", "ch14typeinfo.pets.Manx", "ch14typeinfo.pets.Cymric",
			"ch14typeinfo.pets.Rat", "ch14typeinfo.pets.Mouse", "ch14typeinfo.pets.Hamster" };

	@SuppressWarnings("unchecked")
	private static void loader() {
		try {
			for (String name : typeNames)
				types.add((Class<? extends Pet>) Class.forName(name));
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	static {
		loader();
	}

	public List<Class<? extends Pet>> types() {
		return types;
	}
}