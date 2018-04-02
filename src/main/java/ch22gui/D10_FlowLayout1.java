package ch22gui;

import javax.swing.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Demonstrates FlowLayout.
 */
public class D10_FlowLayout1 extends JFrame {
	public D10_FlowLayout1() {
		setLayout(new FlowLayout());
		for (int i = 0; i < 20; i++)
			add(new JButton("Button " + i));
	}

	public static void main(String[] args) {
		run(new D10_FlowLayout1(), 300, 300);
	}
}