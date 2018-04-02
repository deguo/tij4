package ch22gui;

import javax.swing.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Putting buttons on a Swing application.
 */
public class D05_Button1 extends JFrame {
	private JButton b1 = new JButton("Button 1"), b2 = new JButton("Button 2");

	public D05_Button1() {
		setLayout(new FlowLayout());
		add(b1);
		add(b2);
	}

	public static void main(String[] args) {
		run(new D05_Button1(), 200, 100);
	}
}