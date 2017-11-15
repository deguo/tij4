package ch14typeinfo;

public class D06_WildcardClassReferences {
	public static void main(String[] args) {
		Class<?> intClass = int.class;
		intClass = double.class;
	}
}