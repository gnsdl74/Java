package edu.java.gui05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain05 {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					GuiMain05 window = new GuiMain05();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	} // end main()

	public GuiMain05() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 542, 372);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnAgree = new JRadioButton("동의");
		rdbtnAgree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnAgree.getText());
			}
		});
		buttonGroup.add(rdbtnAgree);
		rdbtnAgree.setBounds(8, 6, 121, 23);
		rdbtnAgree.setSelected(true);
		frame.getContentPane().add(rdbtnAgree);
		
		
		JRadioButton rdbtnReject = new JRadioButton("거부");
		rdbtnReject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnReject.getText());
			}
		});
		buttonGroup.add(rdbtnReject);
		rdbtnReject.setBounds(133, 6, 121, 23);
		frame.getContentPane().add(rdbtnReject);
		
		textArea = new JTextArea();
		textArea.setBounds(8, 35, 506, 288);
		frame.getContentPane().add(textArea);
	} // end initialize()
} // end GuiMain05