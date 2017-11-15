package ch14typeinfo;

public class D05_GenericClassReferences {
	public static void main(String[] args) {
		Class intClass = int.class;
		Class<Integer> genericIntClass = int.class;
		genericIntClass = Integer.class; // Same thing
		intClass = double.class;
		// genericIntClass = double.class; // Illegal
	}
}