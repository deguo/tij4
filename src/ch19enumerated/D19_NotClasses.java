package ch19enumerated;

import static commons.util.Print.*;

/**
 * {Exec: javap -c LikeClasses}
 * 
 * <pre>
 * Output:
 * Compiled from "NotClasses.java"
 * abstract class LikeClasses extends java.lang.Enum{
 * public static final LikeClasses WINKEN;
 * 
 * public static final LikeClasses BLINKEN;
 * 
 * public static final LikeClasses NOD;
 * ...
 * </pre>
 */
enum LikeClasses {
	WINKEN {
		void behavior() {
			print("Behavior1");
		}
	},
	BLINKEN {
		void behavior() {
			print("Behavior2");
		}
	},
	NOD {
		void behavior() {
			print("Behavior3");
		}
	};
	abstract void behavior();
}

public class D19_NotClasses {
	// void f1(LikeClasses.WINKEN instance) {} // Nope
}