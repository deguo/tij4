package ch11holding;

import java.util.*;
import commons.util.*;

/**
 * Producing an alphabetic listing.
 * 
 * <pre>
 * Output:
 * [A, add, addAll, added, args, B, C, class, Collections, contains, containsAll, D, E, F, false, from, G, H, HashSet, ch11holding, I, import, in, J, java, K, L, M, main, mindview, N, net, new, Output, Print, public, remove, removeAll, removed, Set, set1, set2, D17_SetOperations, split, static, String, to, true, util, void, X, Y, Z]
 * </pre>
 */
public class D19_UniqueWordsAlphabetic {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("D17_SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}