package ch15generics;

import static commons.util.Print.*;

/**
 * <pre>
 * Output:
 * ClassAsFactory<Employee> succeeded
 * ClassAsFactory<Integer> failed
 * </pre>
 */
class ClassAsFactory<T> {
	T x;

	public ClassAsFactory(Class<T> kind) {
		try {
			x = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class Employee {
}

public class D34_InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
		print("ClassAsFactory<Employee> succeeded");
		try {
			ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
		} catch (Exception e) {
			print("ClassAsFactory<Integer> failed");
		}
	}
}