package ch17containers;

import java.util.*;

/**
 * Demonstrates performance differences in Sets. <br>
 * {Args: 100 5000} Small to keep build testing short
 * 
 * <pre>
 * Output: (Sample)
 * ------------- TreeSet -------------
 * size       add  contains   iterate
 * 10       746       173        89
 * 100       501       264        68
 * 1000       714       410        69
 * 10000      1975       552        69
 * ------------- HashSet -------------
 * size       add  contains   iterate
 * 10       308        91        94
 * 100       178        75        73
 * 1000       216       110        72
 * 10000       711       215       100
 * ---------- LinkedHashSet ----------
 * size       add  contains   iterate
 * 10       350        65        83
 * 100       270        74        55
 * 1000       303       111        54
 * 10000      1615       256        58
 * </pre>
 */

public class D27_SetPerformance {
	static List<D24_Test<Set<Integer>>> tests = new ArrayList<D24_Test<Set<Integer>>>();
	static {
		tests.add(new D24_Test<Set<Integer>>("add") {
			int test(Set<Integer> set, D24_TestParam tp) {
				int loops = tp.loops;
				int size = tp.size;
				for (int i = 0; i < loops; i++) {
					set.clear();
					for (int j = 0; j < size; j++)
						set.add(j);
				}
				return loops * size;
			}
		});
		tests.add(new D24_Test<Set<Integer>>("contains") {
			int test(Set<Integer> set, D24_TestParam tp) {
				int loops = tp.loops;
				int span = tp.size * 2;
				for (int i = 0; i < loops; i++)
					for (int j = 0; j < span; j++)
						set.contains(j);
				return loops * span;
			}
		});
		tests.add(new D24_Test<Set<Integer>>("iterate") {
			int test(Set<Integer> set, D24_TestParam tp) {
				int loops = tp.loops * 10;
				for (int i = 0; i < loops; i++) {
					Iterator<Integer> it = set.iterator();
					while (it.hasNext())
						it.next();
				}
				return loops * set.size();
			}
		});
	}

	public static void main(String[] args) {
		if (args.length > 0)
			D24_Tester.defaultParams = D24_TestParam.array(args);
		D24_Tester.fieldWidth = 10;
		D24_Tester.run(new TreeSet<Integer>(), tests);
		D24_Tester.run(new HashSet<Integer>(), tests);
		D24_Tester.run(new LinkedHashSet<Integer>(), tests);
	}
}