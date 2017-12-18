package ch17containers;

/**
 * A "data transfer object."
 */
public class D24_TestParam {
	public final int size;
	public final int loops;

	public D24_TestParam(int size, int loops) {
		this.size = size;
		this.loops = loops;
	}

	// Create an array of D29_TestParam from a varargs sequence:
	public static D24_TestParam[] array(int... values) {
		int size = values.length / 2;
		D24_TestParam[] result = new D24_TestParam[size];
		int n = 0;
		for (int i = 0; i < size; i++)
			result[i] = new D24_TestParam(values[n++], values[n++]);
		return result;
	}

	// Convert a String array to a D29_TestParam array:
	public static D24_TestParam[] array(String[] values) {
		int[] vals = new int[values.length];
		for (int i = 0; i < vals.length; i++)
			vals[i] = Integer.decode(values[i]);
		return array(vals);
	}
}