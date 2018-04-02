package ch15generics;

public class D31_SimpleHolder {
	private Object obj;

	public void set(Object obj) {
		this.obj = obj;
	}

	public Object get() {
		return obj;
	}

	public static void main(String[] args) {
		D31_SimpleHolder holder = new D31_SimpleHolder();
		holder.set("Item");
		String s = (String) holder.get();
	}
}