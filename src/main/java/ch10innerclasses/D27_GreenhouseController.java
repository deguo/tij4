package ch10innerclasses;

import ch10innerclasses.controller.*;

/**
 * Configure and execute the greenhouse system. <br>
 * {Args: 5000}
 * 
 * <pre>
 * Output:
 * Bing!
 * Thermostat on night setting
 * Light is on
 * Light is off
 * Greenhouse water is on
 * Greenhouse water is off
 * Thermostat on day setting
 * Restarting system
 * Terminating
 * </pre>
 */
public class D27_GreenhouseController {
	public static void main(String[] args) {
		D26_GreenhouseControls gc = new D26_GreenhouseControls();
		// Instead of hard-wiring, you could parse
		// configuration information from a text file here:
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = { gc.new ThermostatNight(0), gc.new LightOn(200), gc.new LightOff(400), gc.new WaterOn(600),
				gc.new WaterOff(800), gc.new ThermostatDay(1400) };
		gc.addEvent(gc.new Restart(2000, eventList));
		if (args.length == 1)
			gc.addEvent(new D26_GreenhouseControls.Terminate(new Integer(args[0])));
		gc.run();
	}
}
