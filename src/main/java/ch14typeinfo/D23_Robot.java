package ch14typeinfo;

import java.util.*;
import commons.util.*;

public interface D23_Robot {
	String name();

	String model();

	List<D23_Operation> operations();

	class Test {
		public static void test(D23_Robot r) {
			if (r instanceof Null)
				System.out.println("[Null D23_Robot]");
			System.out.println("D23_Robot name: " + r.name());
			System.out.println("D23_Robot model: " + r.model());
			for (D23_Operation operation : r.operations()) {
				System.out.println(operation.description());
				operation.command();
			}
		}
	}
}