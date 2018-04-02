package ch22gui;

import javax.swing.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Demonstrates BorderLayout.
 */
public class D09_BorderLayout1 extends JFrame {
	public D09_BorderLayout1() {
		add(BorderLayout.NORTH, new JButton("North"));
		add(BorderLayout.SOUTH, new JButton("South"));
		add(BorderLayout.EAST, new JButton("East"));
		add(BorderLayout.WEST, new JButton("West"));
		add(BorderLayout.CENTER, new JButton("Center"));
	}

	public static void main(String[] args) {
		run(new D09_BorderLayout1(), 300, 250);
	}
}