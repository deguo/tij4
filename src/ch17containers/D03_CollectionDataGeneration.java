package ch17containers;

import java.util.*;
import commons.util.*;

/**
 * Using the Generators defined in the Arrays chapter.
 * 
 * <pre>
 * Output:
 * [YNzbrnyGc, FOWZnTcQr, GseGZMmJM, RoEsuEcUO, neOEdLsmw, HLGEahKcx, rEqUCBbkI, naMesbtWH, kjUrUkZPg, wsqPzDyCy]
 * [573, 4779, 871, 4367, 6090, 7882, 2017, 8037, 3455, 299]
 * </pre>
 */
public class D03_CollectionDataGeneration {
	public static void main(String[] args) {
		System.out.println(new ArrayList<String>(CollectionData.list( // Convenience method
				new RandomGenerator.String(9), 10)));
		System.out.println(new HashSet<Integer>(new CollectionData<Integer>(new RandomGenerator.Integer(), 10)));
	}
}