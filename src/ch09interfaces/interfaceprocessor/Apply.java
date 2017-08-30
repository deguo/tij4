package ch09interfaces.interfaceprocessor;

import static commons.util.Print.*;

public class Apply {
	public static void process(Processor p, Object s) {
		print("Using Processor " + p.name());
		print(p.process(s));
	}
}