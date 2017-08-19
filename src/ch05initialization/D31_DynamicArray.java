package ch05initialization;

/**
 * Array initialization.
 * 
 * <pre>
 * Output:
 * fiddle de dum
 * </pre>
 */
public class D31_DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args)
			System.out.print(s + " ");
	}
}
