package ch17containers;

import java.util.*;

/**
 * A simple Map.Entry for sample Map implementations.
 */
public class D19_MapEntry<K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;

	public D19_MapEntry(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public V setValue(V v) {
		V result = value;
		value = v;
		return result;
	}

	public int hashCode() {
		return (key == null ? 0 : key.hashCode()) ^ (value == null ? 0 : value.hashCode());
	}

	public boolean equals(Object o) {
		if (!(o instanceof D19_MapEntry))
			return false;
		D19_MapEntry me = (D19_MapEntry) o;
		return (key == null ? me.getKey() == null : key.equals(me.getKey()))
				&& (value == null ? me.getValue() == null : value.equals(me.getValue()));
	}

	public String toString() {
		return key + "=" + value;
	}
}