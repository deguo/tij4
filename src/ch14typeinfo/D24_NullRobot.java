package ch14typeinfo;

import java.lang.reflect.*;
import java.util.*;
import commons.util.*;

/**
 * Using a dynamic proxy to create a Null Object.
 * 
 * <pre>
 * Output:
 * D23_Robot name: SnowBee
 * D23_Robot model: SnowBot Series 11
 * SnowBee can shovel snow
 * SnowBee shoveling snow
 * SnowBee can chip ice
 * SnowBee chipping ice
 * SnowBee can clear the roof
 * SnowBee clearing roof
 * [Null D23_Robot]
 * D23_Robot name: D23_SnowRemovalRobot D24_NullRobot
 * D23_Robot model: D23_SnowRemovalRobot D24_NullRobot
 * </pre>
 */
class NullRobotProxyHandler implements InvocationHandler {
	private String nullName;
	private D23_Robot proxied = new NRobot();

	NullRobotProxyHandler(Class<? extends D23_Robot> type) {
		nullName = type.getSimpleName() + " D24_NullRobot";
	}

	private class NRobot implements Null, D23_Robot {
		public String name() {
			return nullName;
		}

		public String model() {
			return nullName;
		}

		public List<D23_Operation> operations() {
			return Collections.emptyList();
		}
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return method.invoke(proxied, args);
	}
}

public class D24_NullRobot {
	public static D23_Robot newNullRobot(Class<? extends D23_Robot> type) {
		return (D23_Robot) Proxy.newProxyInstance(D24_NullRobot.class.getClassLoader(),
				new Class[] { Null.class, D23_Robot.class }, new NullRobotProxyHandler(type));
	}

	public static void main(String[] args) {
		D23_Robot[] bots = { new D23_SnowRemovalRobot("SnowBee"), newNullRobot(D23_SnowRemovalRobot.class) };
		for (D23_Robot bot : bots)
			D23_Robot.Test.test(bot);
	}
}