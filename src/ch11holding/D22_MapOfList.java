
package ch11holding;

import ch14typeinfo.pets.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output:	
 * People: [D22_Person Luke, D22_Person Marilyn, D22_Person Isaac, D22_Person Dawn, D22_Person Kate]
 * Pets: [[Rat Fuzzy, Rat Fizzy], [Pug Louie aka Louis Snorkelstein Dupree, Cat Stanford aka Stinky el Negro, Cat Pinkola], [Rat Freckly], [Cymric Molly, Mutt Spot], [Cat Shackleton, Cat Elsie May, Dog Margrett]]
 * D21_Person Luke has:
 *     Rat Fuzzy
 *     Rat Fizzy
 * D21_Person Marilyn has:
 *     Pug Louie aka Louis Snorkelstein Dupree
 *     Cat Stanford aka Stinky el Negro
 *     Cat Pinkola
 * D21_Person Isaac has:
 *     Rat Freckly
 * D21_Person Dawn has:
 *     Cymric Molly
 *     Mutt Spot
 * D21_Person Kate has:
 *     Cat Shackleton
 *     Cat Elsie May
 *     Dog Margrett
 * </pre>
 */
public class D22_MapOfList {
	public static Map<Person, List<? extends Pet>> petPeople = new HashMap<Person, List<? extends Pet>>();
	static {
		petPeople.put(new Person("Dawn"), Arrays.asList(new Cymric("Molly"), new Mutt("Spot")));
		petPeople.put(new Person("Kate"),
				Arrays.asList(new Cat("Shackleton"), new Cat("Elsie May"), new Dog("Margrett")));
		petPeople.put(new Person("Marilyn"), Arrays.asList(new Pug("Louie aka Louis Snorkelstein Dupree"),
				new Cat("Stanford aka Stinky el Negro"), new Cat("Pinkola")));
		petPeople.put(new Person("Luke"), Arrays.asList(new Rat("Fuzzy"), new Rat("Fizzy")));
		petPeople.put(new Person("Isaac"), Arrays.asList(new Rat("Freckly")));
	}

	public static void main(String[] args) {
		print("People: " + petPeople.keySet());
		print("Pets: " + petPeople.values());
		for (Person person : petPeople.keySet()) {
			print(person + " has:");
			for (Pet pet : petPeople.get(person))
				print("    " + pet);
		}
	}
}