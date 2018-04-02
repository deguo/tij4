package ch22gui;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.basic.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Various Swing buttons.
 */
public class D14_Buttons extends JFrame {
	private JButton jb = new JButton("JButton");
	private BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH),
			down = new BasicArrowButton(BasicArrowButton.SOUTH), right = new BasicArrowButton(BasicArrowButton.EAST),
			left = new BasicArrowButton(BasicArrowButton.WEST);

	public D14_Buttons() {
		setLayout(new FlowLayout());
		add(jb);
		add(new JToggleButton("JToggleButton"));
		add(new JCheckBox("JCheckBox"));
		add(new JRadioButton("JRadioButton"));
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("Directions"));
		jp.add(up);
		jp.add(down);
		jp.add(left);
		jp.add(right);
		add(jp);
	}

	public static void main(String[] args) {
		run(new D14_Buttons(), 350, 200);
	}
}