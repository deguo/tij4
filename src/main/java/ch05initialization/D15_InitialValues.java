package ch05initialization;

import static commons.util.Print.*;

/**
 * Shows default initial values.
 * 
 * <pre>
 * Output:
 * Data type      Initial value
 * boolean        false
 * char           [ ]
 * byte           0
 * short          0
 * int            0
 * long           0
 * float          0.0
 * double         0.0
 * reference      null
 * </pre>
 */
public class D15_InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	D15_InitialValues reference;

	void printInitialValues() {
		print("Data type      Initial value");
		print("boolean        " + t);
		print("char           [" + c + "]");
		print("byte           " + b);
		print("short          " + s);
		print("int            " + i);
		print("long           " + l);
		print("float          " + f);
		print("double         " + d);
		print("reference      " + reference);
	}

	public static void main(String[] args) {
		D15_InitialValues iv = new D15_InitialValues();
		iv.printInitialValues();
		/*
		 * You could also say: new D15_InitialValues().printInitialValues();
		 */
	}
}