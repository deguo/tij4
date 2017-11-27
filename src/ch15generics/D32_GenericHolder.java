package ch15generics;

public class D32_GenericHolder<T> {
	private T obj;

	public void set(T obj) {
		this.obj = obj;
	}

	public T get() {
		return obj;
	}

	public static void main(String[] args) {
		D32_GenericHolder<String> holder = new D32_GenericHolder<String>();
		holder.set("Item");
		String s = holder.get();
	}
}