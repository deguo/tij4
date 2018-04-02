package ch14typeinfo;

public class D07_BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		// Or anything else derived from Number.
	}
}