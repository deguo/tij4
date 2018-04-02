package ch22gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static commons.util.SwingConsole.*;

/**
 * Using drop-down lists.
 */
public class D22_ComboBoxes extends JFrame {
	private String[] description = { "Ebullient", "Obtuse", "Recalcitrant", "Brilliant", "Somnescent", "Timorous",
			"Florid", "Putrescent" };
	private JTextField t = new JTextField(15);
	private JComboBox c = new JComboBox();
	private JButton b = new JButton("Add items");
	private int count = 0;

	public D22_ComboBoxes() {
		for (int i = 0; i < 4; i++)
			c.addItem(description[count++]);
		t.setEditable(false);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (count < description.length)
					c.addItem(description[count++]);
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("index: " + c.getSelectedIndex() + "   " + ((JComboBox) e.getSource()).getSelectedItem());
			}
		});
		setLayout(new FlowLayout());
		add(t);
		add(c);
		add(b);
	}

	public static void main(String[] args) {
		run(new D22_ComboBoxes(), 200, 175);
	}
}