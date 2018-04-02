package ch22gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import commons.util.*;
import static commons.util.SwingConsole.*;

/**
 * The JTextPane control is a little editor.
 */
public class D19_TextPane extends JFrame {
	private JButton b = new JButton("Add Text");
	private JTextPane tp = new JTextPane();
	private static Generator sg = new RandomGenerator.String(7);

	public D19_TextPane() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 1; i < 10; i++)
					tp.setText(tp.getText() + sg.next() + "\n");
			}
		});
		add(new JScrollPane(tp));
		add(BorderLayout.SOUTH, b);
	}

	public static void main(String[] args) {
		run(new D19_TextPane(), 475, 425);
	}
}