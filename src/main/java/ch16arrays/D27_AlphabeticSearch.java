package ch16arrays;

import java.util.*;
import commons.util.*;

/**
 * Searching with a Comparator.
 * 
 * <pre>
 * Output:
 * [bkIna, cQrGs, cXZJo, dLsmw, eGZMm, EqUCB, gwsqP, hKcxr, HLGEa, HqXum, HxxHv, JMRoE, JmzMs, Mesbt, MNvqe, nyGcF, ogoYW, OneOE, OWZnT, RFJQA, rUkZP, sgqia, slJrL, suEcU, uTpnX, vpfFv, WHkjU, xxEAJ, YNzbr, zDyCy]
 * Index: 10
 * HxxHv
 * </pre>
 */
public class D27_AlphabeticSearch {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[30], new RandomGenerator.String(5));
		Arrays.sort(sa, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(sa));
		int index = Arrays.binarySearch(sa, sa[10], String.CASE_INSENSITIVE_ORDER);
		System.out.println("Index: " + index + "\n" + sa[index]);
	}
}