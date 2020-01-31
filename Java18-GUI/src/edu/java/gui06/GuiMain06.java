package edu.java.gui06;

import java.awt.*;
import java.awt.Event.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain06 {

	private JFrame frame;
	private final ButtonGroup btnGroup = new ButtonGroup();
	private JRadioButton rbtnMale, rbtnFemale;
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain06 window = new GuiMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain06() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbtnMale = new JRadioButton("남자");
		rbtnMale.setBounds(8, 6, 172, 65);
		rbtnMale.setFont(new Font("굴림", Font.PLAIN, 48));
		btnGroup.add(rbtnMale);
		rbtnMale.setSelected(true);
		frame.getContentPane().add(rbtnMale);
		// end rbtnMale
		
		rbtnFemale = new JRadioButton("여자");
		rbtnFemale.setBounds(205, 6, 172, 65);
		rbtnFemale.setFont(new Font("굴림", Font.PLAIN, 48));
		btnGroup.add(rbtnFemale);
		frame.getContentPane().add(rbtnFemale);
		// end rbtnFemale
		
		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rbtnMale.isSelected()) {
					textArea.setText("성별 : " + rbtnMale.getText());
				} else {
					textArea.setText("성별 : " + rbtnFemale.getText());
				}
			}
		});
		btnCheck.setFont(new Font("굴림", Font.PLAIN, 48));
		btnCheck.setBounds(8, 77, 172, 54);
		frame.getContentPane().add(btnCheck);
		// end btnCheck
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 48));
		textArea.setBounds(8, 152, 654, 195);
		frame.getContentPane().add(textArea);
		// end btnCheck
		
	} // end initialize()

} // end GuiMain06
