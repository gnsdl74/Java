package edu.java.gui09;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GuiMain09 {

	private JFrame frame;
	private JCheckBox chMusic, chMovie, chReading;
	private JTextArea textArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain09 window = new GuiMain09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain09() {
		initialize();
	}

	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// end frame

		Font font = new Font("굴림", Font.BOLD, 32);
		chMusic = new JCheckBox("음악");
		chMusic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chMusic.setFont(font);
		chMusic.setBounds(8, 6, 110, 50);
		frame.getContentPane().add(chMusic);
		// end chMusic

		chMovie = new JCheckBox("영화");
		chMovie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chMovie.setFont(font);
		chMovie.setBounds(122, 6, 110, 50);
		frame.getContentPane().add(chMovie);
		// end chMovie
		
		chReading = new JCheckBox("독서");
		chReading.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				printSelected();
			}
		});
		chReading.setFont(font);
		chReading.setBounds(236, 6, 110, 50);
		frame.getContentPane().add(chReading);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림", Font.PLAIN, 32));
		textArea.setBounds(8, 64, 414, 188);
		frame.getContentPane().add(textArea);
		
		
	} // end initialize()

	private void printSelected() {
		String result = "음악 : " + chMusic.isSelected() + "\n" + "영화 : " + chMovie.isSelected() + "\n" + "독서 : " + chReading.isSelected();
		textArea.setText(result);
	} // end printSelected()
	
} // end GuiMain09
