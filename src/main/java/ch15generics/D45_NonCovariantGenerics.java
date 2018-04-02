package ch15generics;

import java.util.*;

/**
 * {CompileTimeError} (Won't compile)
 */

/*
public class NonCovariantGenerics {
	// Compile Error: incompatible types:
	List<Fruit> flist = new ArrayList<Apple>();
}*/