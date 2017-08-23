package ch07reusing;

import static commons.util.Print.*;

/**
 * The protected keyword.
 * 
 * <pre>
 * Output:
 * D12_Orc 12: I'm a Villain and my name is Limburger
 * D12_Orc 19: I'm a Villain and my name is Bob
 * </pre>
 */
class Villain {
	private String name;

	protected void set(String nm) {
		name = nm;
	}

	public Villain(String name) {
		this.name = name;
	}

	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}

public class D12_Orc extends Villain {
	private int orcNumber;

	public D12_Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}

	public void change(String name, int orcNumber) {
		set(name); // Available because it's protected
		this.orcNumber = orcNumber;
	}

	public String toString() {
		return "D12_Orc " + orcNumber + ": " + super.toString();
	}

	public static void main(String[] args) {
		D12_Orc d12Orc = new D12_Orc("Limburger", 12);
		print(d12Orc);
		d12Orc.change("Bob", 19);
		print(d12Orc);
	}
}