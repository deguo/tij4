package ch22gui;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;
import static commons.util.SwingConsole.*;

/**
 * Using sliders, progress bars and progress monitors.
 */
public class D34_Progress extends JFrame {
	private JProgressBar pb = new JProgressBar();
	private ProgressMonitor pm = new ProgressMonitor(this, "Monitoring Progress", "Test", 0, 100);
	private JSlider sb = new JSlider(JSlider.HORIZONTAL, 0, 100, 60);

	public D34_Progress() {
		setLayout(new GridLayout(2, 1));
		add(pb);
		pm.setProgress(0);
		pm.setMillisToPopup(1000);
		sb.setValue(0);
		sb.setPaintTicks(true);
		sb.setMajorTickSpacing(20);
		sb.setMinorTickSpacing(5);
		sb.setBorder(new TitledBorder("Slide Me"));
		pb.setModel(sb.getModel()); // Share model
		add(sb);
		sb.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				pm.setProgress(sb.getValue());
			}
		});
	}

	public static void main(String[] args) {
		run(new D34_Progress(), 300, 200);
	}
}