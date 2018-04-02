package ch22gui;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Demonstrates the Tabbed Pane.
 */
public class D24_TabbedPane1 extends JFrame {
	private String[] flavors = { "Chocolate", "Strawberry", "Vanilla Fudge Swirl", "Mint Chip", "Mocha Almond Fudge",
			"Rum Raisin", "Praline Cream", "Mud Pie" };
	private JTabbedPane tabs = new JTabbedPane();
	private JTextField txt = new JTextField(20);

	public D24_TabbedPane1() {
		int i = 0;
		for (String flavor : flavors)
			tabs.addTab(flavors[i], new JButton("Tabbed pane " + i++));
		tabs.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txt.setText("Tab selected: " + tabs.getSelectedIndex());
			}
		});
		add(BorderLayout.SOUTH, txt);
		add(tabs);
	}

	public static void main(String[] args) {
		run(new D24_TabbedPane1(), 400, 250);
	}
}