package ch11holding;

import commons.util.*;

/**
 * <pre>
 * Output:
 * fleas has dog My
 * fleas has dog My
 * </pre>
 */
public class D14_StackCollision {
	public static void main(String[] args) {
		commons.util.Stack<String> stack = new commons.util.Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		java.util.Stack<String> stack2 = new java.util.Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack2.push(s);
		while (!stack2.empty())
			System.out.print(stack2.pop() + " ");
	}
}
