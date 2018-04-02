package ch11holding;

import ch14typeinfo.pets.*;
import java.util.*;

/**
 * <pre>
 * Output:
 * 0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
 * </pre>
 */
class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}

public class D27_NonCollectionSequence extends PetSequence {
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;

			public boolean hasNext() {
				return index < pets.length;
			}

			public Pet next() {
				return pets[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		D27_NonCollectionSequence nc = new D27_NonCollectionSequence();
		D25_InterfaceVsIterator.display(nc.iterator());
	}
}