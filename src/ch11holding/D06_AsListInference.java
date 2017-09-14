package ch11holding;

import java.util.*;

/**
 * Arrays.asList() makes its best guess about type.
 */
class Snow {
}

class Powder extends Snow {
}

class Light extends Powder {
}

class Heavy extends Powder {
}

class Crusty extends Snow {
}

class Slush extends Snow {
}

public class D06_AsListInference {
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());

		// 注意：这里可以编译
		List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		// Won't compile:
		// Compiler says:
		// found : java.util.List<Powder>
		// required: java.util.List<Snow>

		// Collections.addAll() doesn't get confused:
		List<Snow> snow3 = new ArrayList<Snow>();
		// !Collections.addAll( new Light(), new Heavy());
		Collections.addAll(snow3, new Light(), new Heavy());

		// Give a hint using an
		// explicit type argument specification:
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
	}
}