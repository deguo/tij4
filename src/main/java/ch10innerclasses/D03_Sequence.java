package ch10innerclasses;

/**
 * Holds a sequence of Objects.
 * 
 * <pre>
 * Output:
 * 0 1 2 3 4 5 6 7 8 9
 * </pre>
 */
interface Selector {
	boolean end();

	Object current();

	void next();
}

public class D03_Sequence {
	private Object[] items;
	private int next = 0;

	public D03_Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		D03_Sequence sequence = new D03_Sequence(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}