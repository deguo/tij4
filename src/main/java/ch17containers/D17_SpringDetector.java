package ch17containers;

import java.lang.reflect.*;
import java.util.*;
import static commons.util.Print.*;

/**
 * What will the weather be?
 * 
 * <pre>
 * Output:
 * map = {Groundhog #3=Early Spring!, Groundhog #7=Early Spring!, Groundhog #5=Early Spring!, Groundhog #9=Six more weeks of Winter!, Groundhog #8=Six more weeks of Winter!, Groundhog #0=Six more weeks of Winter!, Groundhog #6=Early Spring!, Groundhog #4=Six more weeks of Winter!, Groundhog #1=Six more weeks of Winter!, Groundhog #2=Early Spring!}
 * Looking up prediction for Groundhog #3
 * Key not found: Groundhog #3
 * </pre>
 */
public class D17_SpringDetector {
	// Uses a Groundhog or class derived from Groundhog:
	public static <T extends D17_Groundhog> void detectSpring(Class<T> type) throws Exception {
		Constructor<T> ghog = type.getConstructor(int.class);
		Map<D17_Groundhog, D17_Prediction> map = new HashMap<D17_Groundhog, D17_Prediction>();
		for (int i = 0; i < 10; i++)
			map.put(ghog.newInstance(i), new D17_Prediction());
		print("map = " + map);
		D17_Groundhog gh = ghog.newInstance(3);
		print("Looking up prediction for " + gh);
		if (map.containsKey(gh))
			print(map.get(gh));
		else
			print("Key not found: " + gh);
	}

	public static void main(String[] args) throws Exception {
		detectSpring(D17_Groundhog.class);
	}
}