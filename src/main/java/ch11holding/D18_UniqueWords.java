package ch11holding;

import java.util.*;
import commons.util.*;

/**
 * <pre>
 * Output:
 * [A, B, C, Collections, D, E, F, G, H, HashSet, I, J, K, L, M, N, Output, Print, Set, D17_SetOperations, String, X, Y, Z, add, addAll, added, args, class, contains, containsAll, false, from, ch11holding, import, in, java, main, mindview, net, new, print, public, remove, removeAll, removed, set1, set2, split, static, to, true, util, void]
 * </pre>
 */
public class D18_UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(new TextFile("src/main/java/ch11holding/D17_SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}