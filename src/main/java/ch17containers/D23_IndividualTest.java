package ch17containers;

import ch11holding.D22_MapOfList;
import ch14typeinfo.pets.*;
import java.util.*;

/**
 * <pre>
 * Output:
 * [Cat Elsie May, Cat Pinkola, Cat Shackleton, Cat Stanford aka Stinky el Negro, Cymric Molly, Dog Margrett, Mutt Spot, Pug Louie aka Louis Snorkelstein Dupree, Rat Fizzy, Rat Freckly, Rat Fuzzy]
 * </pre>
 */
public class D23_IndividualTest {
	public static void main(String[] args) {
		Set<Individual> pets = new TreeSet<Individual>();
		for (List<? extends Pet> lp : D22_MapOfList.petPeople.values())
			for (Pet p : lp)
				pets.add(p);
		System.out.println(pets);
	}
}