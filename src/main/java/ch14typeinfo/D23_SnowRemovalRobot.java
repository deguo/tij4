package ch14typeinfo;

import java.util.*;

/**
 * <pre>
 * Output:
 * D23_Robot name: Slusher
 * D23_Robot model: SnowBot Series 11
 * Slusher can shovel snow
 * Slusher shoveling snow
 * Slusher can chip ice
 * Slusher chipping ice
 * Slusher can clear the roof
 * Slusher clearing roof
 * </pre>
 */
public class D23_SnowRemovalRobot implements D23_Robot {
	private String name;

	public D23_SnowRemovalRobot(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public String model() {
		return "SnowBot Series 11";
	}

	public List<D23_Operation> operations() {
		return Arrays.asList(new D23_Operation() {
			public String description() {
				return name + " can shovel snow";
			}

			public void command() {
				System.out.println(name + " shoveling snow");
			}
		}, new D23_Operation() {
			public String description() {
				return name + " can chip ice";
			}

			public void command() {
				System.out.println(name + " chipping ice");
			}
		}, new D23_Operation() {
			public String description() {
				return name + " can clear the roof";
			}

			public void command() {
				System.out.println(name + " clearing roof");
			}
		});
	}

	public static void main(String[] args) {
		D23_Robot.Test.test(new D23_SnowRemovalRobot("Slusher"));
	}
}