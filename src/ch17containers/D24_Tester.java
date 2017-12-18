package ch17containers;

import java.util.*;

/**
 * Applies Test objects to lists of different containers.
 */
public class D24_Tester<C> {
	public static int fieldWidth = 8;
	public static D24_TestParam[] defaultParams = D24_TestParam.array(10, 5000, 100, 5000, 1000, 5000, 10000, 500);

	// Override this to modify pre-test initialization:
	protected C initialize(int size) {
		return container;
	}

	protected C container;
	private String headline = "";
	private List<D24_Test<C>> tests;

	private static String stringField() {
		return "%" + fieldWidth + "s";
	}

	private static String numberField() {
		return "%" + fieldWidth + "d";
	}

	private static int sizeWidth = 5;
	private static String sizeField = "%" + sizeWidth + "s";
	private D24_TestParam[] paramList = defaultParams;

	public D24_Tester(C container, List<D24_Test<C>> tests) {
		this.container = container;
		this.tests = tests;
		if (container != null)
			headline = container.getClass().getSimpleName();
	}

	public D24_Tester(C container, List<D24_Test<C>> tests, D24_TestParam[] paramList) {
		this(container, tests);
		this.paramList = paramList;
	}

	public void setHeadline(String newHeadline) {
		headline = newHeadline;
	}

	// Generic methods for convenience :
	public static <C> void run(C cntnr, List<D24_Test<C>> tests) {
		new D24_Tester<C>(cntnr, tests).timedTest();
	}

	public static <C> void run(C cntnr, List<D24_Test<C>> tests, D24_TestParam[] paramList) {
		new D24_Tester<C>(cntnr, tests, paramList).timedTest();
	}

	private void displayHeader() {
		// Calculate width and pad with '-':
		int width = fieldWidth * tests.size() + sizeWidth;
		int dashLength = width - headline.length() - 1;
		StringBuilder head = new StringBuilder(width);
		for (int i = 0; i < dashLength / 2; i++)
			head.append('-');
		head.append(' ');
		head.append(headline);
		head.append(' ');
		for (int i = 0; i < dashLength / 2; i++)
			head.append('-');
		System.out.println(head);
		// Print column headers:
		System.out.format(sizeField, "size");
		for (D24_Test test : tests)
			System.out.format(stringField(), test.name);
		System.out.println();
	}

	// Run the tests for this container:
	public void timedTest() {
		displayHeader();
		for (D24_TestParam param : paramList) {
			System.out.format(sizeField, param.size);
			for (D24_Test<C> test : tests) {
				C kontainer = initialize(param.size);
				long start = System.nanoTime();
				// Call the overriden method:
				int reps = test.test(kontainer, param);
				long duration = System.nanoTime() - start;
				long timePerRep = duration / reps; // Nanoseconds
				System.out.format(numberField(), timePerRep);
			}
			System.out.println();
		}
	}
}