package ch11holding;

import commons.util.*;

/**
 * <pre>
 * Output:
 * fleas has dog My
 * </pre>
 */
public class D13_StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}