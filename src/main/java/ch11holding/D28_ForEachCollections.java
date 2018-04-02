package ch11holding;

import java.util.*;

/**
 * All collections work with foreach.
 * 
 * <pre>
 *  Output: 'Take' 'the' 'long' 'way'
 * 'home'
 * </pre>
 */
public class D28_ForEachCollections {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for (String s : cs)
			System.out.print("'" + s + "' ");
	}
}