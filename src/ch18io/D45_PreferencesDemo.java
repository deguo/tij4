package ch18io;

import java.util.prefs.*;
import static commons.util.Print.*;

/**
 * <pre>
 * Output: (Sample)
 * Location: Oz
 * Footwear: Ruby Slippers
 * Companions: 4
 * Are there witches?: true
 * UsageCount: 53
 * How many companions does Dorothy have? 4
 * </pre>
 */
public class D45_PreferencesDemo {
	public static void main(String[] args) throws Exception {
		Preferences prefs = Preferences.userNodeForPackage(D45_PreferencesDemo.class);
		prefs.put("Location", "Oz");
		prefs.put("Footwear", "Ruby Slippers");
		prefs.putInt("Companions", 4);
		prefs.putBoolean("Are there witches?", true);
		int usageCount = prefs.getInt("UsageCount", 0);
		usageCount++;
		prefs.putInt("UsageCount", usageCount);
		for (String key : prefs.keys())
			print(key + ": " + prefs.get(key, null));
		// You must always provide a default value:
		print("How many companions does Dorothy have? " + prefs.getInt("Companions", 0));
	}
}