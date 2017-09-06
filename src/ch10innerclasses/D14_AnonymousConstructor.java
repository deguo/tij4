package ch10innerclasses;

import static commons.util.Print.*;

/**
 * Creating a constructor for an anonymous inner class.
 * 
 * <pre>
 * Output:
 * Base constructor, i = 47
 * Inside instance initializer
 * In anonymous f()
 * </pre>
 */
abstract class Base {
	public Base(int i) {
		print("Base constructor, i = " + i);
	}

	public abstract void f();
}

public class D14_AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{
				print("Inside instance initializer");
			}

			public void f() {
				print("In anonymous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}