package ch22gui;

import javax.swing.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Demonstrates GridLayout.
 */
public class D11_GridLayout1 extends JFrame {
	public D11_GridLayout1() {
		setLayout(new GridLayout(7, 3));
		for (int i = 0; i < 20; i++)
			add(new JButton("Button " + i));
	}

	public static void main(String[] args) {
		run(new D11_GridLayout1(), 300, 300);
	}
}