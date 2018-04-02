package ch22gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static commons.util.SwingConsole.*;

/**
 * Using JRadioButtons.
 */
public class D21_RadioButtons extends JFrame {
	private JTextField t = new JTextField(15);
	private ButtonGroup g = new ButtonGroup();
	private JRadioButton rb1 = new JRadioButton("one", false), rb2 = new JRadioButton("two", false),
			rb3 = new JRadioButton("three", false);
	private ActionListener al = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			t.setText("Radio button " + ((JRadioButton) e.getSource()).getText());
		}
	};

	public D21_RadioButtons() {
		rb1.addActionListener(al);
		rb2.addActionListener(al);
		rb3.addActionListener(al);
		g.add(rb1);
		g.add(rb2);
		g.add(rb3);
		t.setEditable(false);
		setLayout(new FlowLayout());
		add(t);
		add(rb1);
		add(rb2);
		add(rb3);
	}

	public static void main(String[] args) {
		run(new D21_RadioButtons(), 200, 125);
	}
}