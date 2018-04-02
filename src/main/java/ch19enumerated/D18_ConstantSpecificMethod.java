package ch19enumerated;

import java.util.*;
import java.text.*;

/** (Execute to see output) */
public enum D18_ConstantSpecificMethod {
	DATE_TIME {
		String getInfo() {
			return DateFormat.getDateInstance().format(new Date());
		}
	},
	CLASSPATH {
		String getInfo() {
			return System.getenv("CLASSPATH");
		}
	},
	VERSION {
		String getInfo() {
			return System.getProperty("java.version");
		}
	};
	abstract String getInfo();

	public static void main(String[] args) {
		for (D18_ConstantSpecificMethod csm : values())
			System.out.println(csm.getInfo());
	}
}