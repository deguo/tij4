package ch22gui;

import javax.swing.*;
import java.util.concurrent.*;

public class D04_SubmitSwingProgram extends JFrame {
	JLabel label;

	public D04_SubmitSwingProgram() {
		super("Hello Swing");
		label = new JLabel("A Label");
		add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	static D04_SubmitSwingProgram ssp;

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp = new D04_SubmitSwingProgram();
			}
		});
		TimeUnit.SECONDS.sleep(1);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				ssp.label.setText("Hey! This is Different!");
			}
		});
	}
}