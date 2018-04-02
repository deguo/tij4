package ch17containers;

import java.util.*;
import static commons.util.Print.*;

/**
 * Demonstration of Stack Class.
 * 
 * <pre>
 * Output:
 * stack = [JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER]
 * element 5 = JUNE
 * popping elements:
 * The last line NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY lstack = [NOVEMBER, OCTOBER, SEPTEMBER, AUGUST, JULY, JUNE, MAY, APRIL, MARCH, FEBRUARY, JANUARY]
 * NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY stack2 = [NOVEMBER, OCTOBER, SEPTEMBER, AUGUST, JULY, JUNE, MAY, APRIL, MARCH, FEBRUARY, JANUARY]
 * NOVEMBER OCTOBER SEPTEMBER AUGUST JULY JUNE MAY APRIL MARCH FEBRUARY JANUARY
 * </pre>
 */
enum Month {
	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER
}

public class D37_Stacks {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (Month m : Month.values())
			stack.push(m.toString());
		print("stack = " + stack);
		// Treating a stack as a Vector:
		stack.addElement("The last line");
		print("element 5 = " + stack.elementAt(5));
		print("popping elements:");
		while (!stack.empty())
			printnb(stack.pop() + " ");

		// Using a LinkedList as a Stack:
		LinkedList<String> lstack = new LinkedList<String>();
		for (Month m : Month.values())
			lstack.addFirst(m.toString());
		print("lstack = " + lstack);
		while (!lstack.isEmpty())
			printnb(lstack.removeFirst() + " ");

		// Using the Stack class from
		// the Holding Your Objects Chapter:
		commons.util.Stack<String> stack2 = new commons.util.Stack<String>();
		for (Month m : Month.values())
			stack2.push(m.toString());
		print("stack2 = " + stack2);
		while (!stack2.empty())
			printnb(stack2.pop() + " ");

	}
}