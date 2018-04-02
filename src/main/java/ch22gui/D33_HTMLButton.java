package ch22gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static commons.util.SwingConsole.*;

/**
 * Putting HTML text on Swing components.
 */
public class D33_HTMLButton extends JFrame {
	private JButton b = new JButton("<html><b><font size=+2>" + "<center>Hello!<br><i>Press me now!");

	public D33_HTMLButton() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				add(new JLabel("<html>" + "<i><font size=+4>Kapow!"));
				// Force a re-layout to include the new label:
				validate();
			}
		});
		setLayout(new FlowLayout());
		add(b);
	}

	public static void main(String[] args) {
		run(new D33_HTMLButton(), 200, 500);
	}
}