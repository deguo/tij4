package ch15generics;

import java.util.*;

/**
 * <pre>
 * Output:
 * [E]
 * [K, V]
 * [Q]
 * [POSITION, MOMENTUM]
 * </pre>
 */
class Frob {
}

class Fnorkle {
}

class Quark<Q> {
}

class Particle<POSITION, MOMENTUM> {
}

public class D23_LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<Frob>();
		Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
		Quark<Fnorkle> quark = new Quark<Fnorkle>();
		Particle<Long, Double> p = new Particle<Long, Double>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
	}
}