package ch22gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import commons.util.*;
import static commons.util.SwingConsole.*;

/**
 * Using the JTextArea control.
 */
public class D08_TextArea extends JFrame {
	private JButton b = new JButton("Add Data"), c = new JButton("Clear Data");
	private JTextArea t = new JTextArea(20, 40);
	private Map<String, String> m = new HashMap<String, String>();

	public D08_TextArea() {
		// Use up all the data:
		m.putAll(Countries.capitals());
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Map.Entry me : m.entrySet())
					t.append(me.getKey() + ": " + me.getValue() + "\n");
			}
		});
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.setText("");
			}
		});
		setLayout(new FlowLayout());
		add(new JScrollPane(t));
		add(b);
		add(c);
	}

	public static void main(String[] args) {
		run(new D08_TextArea(), 475, 425);
	}
}