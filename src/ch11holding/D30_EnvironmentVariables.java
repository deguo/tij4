package ch11holding;

import java.util.*;

/**
 * <pre>
 * (Execute to see output)
 * </pre>
 */
public class D30_EnvironmentVariables {
	public static void main(String[] args) {
		for (Map.Entry entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
