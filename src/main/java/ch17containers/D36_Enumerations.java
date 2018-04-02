package ch17containers;

import java.util.*;
import commons.util.*;

/**
 * Java 1.0/1.1 Vector and Enumeration.
 * 
 * <pre>
 * Output:
 * ALGERIA, ANGOLA, BENIN, BOTSWANA, BULGARIA, BURKINA FASO, BURUNDI, CAMEROON, CAPE VERDE, CENTRAL AFRICAN REPUBLIC,
 * </pre>
 */
public class D36_Enumerations {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(Countries.names(10));
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements())
			System.out.print(e.nextElement() + ", ");
		// Produce an Enumeration from a Collection:
		e = Collections.enumeration(new ArrayList<String>());
	}
}