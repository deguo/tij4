package ch17containers;

/**
 * A working key.
 * 
 * <pre>
 * Output:
 * map = {Groundhog #2=Early Spring!, Groundhog #4=Six more weeks of Winter!, Groundhog #9=Six more weeks of Winter!, Groundhog #8=Six more weeks of Winter!, Groundhog #6=Early Spring!, Groundhog #1=Six more weeks of Winter!, Groundhog #3=Early Spring!, Groundhog #7=Early Spring!, Groundhog #5=Early Spring!, Groundhog #0=Six more weeks of Winter!}
 * Looking up prediction for Groundhog #3
 * Early Spring!
 * </pre>
 */
public class D18_SpringDetector2 {
	public static void main(String[] args) throws Exception {
		D17_SpringDetector.detectSpring(D18_Groundhog2.class);
	}
}