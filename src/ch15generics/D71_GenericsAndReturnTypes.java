package ch15generics;

interface GenericGetter<T extends GenericGetter<T>> {
	T get();
}

interface Getter extends GenericGetter<Getter> {
}

public class D71_GenericsAndReturnTypes {
	void test(Getter g) {
		Getter result = g.get();
		GenericGetter gg = g.get(); // Also the base type
	}
}