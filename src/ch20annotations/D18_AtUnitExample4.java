package ch20annotations;

import java.util.*;
import commons.atunit.*;
import commons.util.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * starting
 * annotations.AtUnitExample4
 *   . scramble1 'All'
 * lAl
 * 
 *   . scramble2 'brontosauruses'
 * tsaeborornussu
 * 
 *   . words 'are'
 * 
 * OK (3 tests)
 * </pre>
 */
public class D18_AtUnitExample4 {
	static String theory = "All brontosauruses " + "are thin at one end, much MUCH thicker in the "
			+ "middle, and then thin again at the far end.";
	private String word;
	private Random rand = new Random(); // Time-based seed

	public D18_AtUnitExample4(String word) {
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public String scrambleWord() {
		List<Character> chars = new ArrayList<Character>();
		for (Character c : word.toCharArray())
			chars.add(c);
		Collections.shuffle(chars, rand);
		StringBuilder result = new StringBuilder();
		for (char ch : chars)
			result.append(ch);
		return result.toString();
	}

	@TestProperty
	static List<String> input = Arrays.asList(theory.split(" "));
	@TestProperty
	static Iterator<String> words = input.iterator();

	@TestObjectCreate
	static D18_AtUnitExample4 create() {
		if (words.hasNext())
			return new D18_AtUnitExample4(words.next());
		else
			return null;
	}

	@Test
	boolean words() {
		print("'" + getWord() + "'");
		return getWord().equals("are");
	}

	@Test
	boolean scramble1() {
		// Change to a specific seed to get verifiable results:
		rand = new Random(47);
		print("'" + getWord() + "'");
		String scrambled = scrambleWord();
		print(scrambled);
		return scrambled.equals("lAl");
	}

	@Test
	boolean scramble2() {
		rand = new Random(74);
		print("'" + getWord() + "'");
		String scrambled = scrambleWord();
		print(scrambled);
		return scrambled.equals("tsaeborornussu");
	}

	public static void main(String[] args) throws Exception {
		System.out.println("starting");
		OSExecute.command(
				"java -classpath out/production/tij4 commons.atunit.AtUnit out/production/tij4/ch20annotations/D18_AtUnitExample4");
	}
}