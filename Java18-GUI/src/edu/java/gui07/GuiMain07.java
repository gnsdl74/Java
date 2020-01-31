package edu.java.gui07;

import java.awt.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain07 {

	private JFrame frame;
	private static final String[] STRINGS = { "1. 이영애", "2. 김태희", "3. 송혜교", "4. 전지현", "5. 아이유" };
	private int index;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain07 window = new GuiMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain07() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 48);
		JLabel lblOuput = new JLabel("글자 출력");
		lblOuput.setFont(font);
		lblOuput.setBounds(12, 10, 410, 69);
		lblOuput.setText(STRINGS[0]);
		frame.getContentPane().add(lblOuput);
		// end lblOuput

		JButton btnPrev = new JButton("이전");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) { // 현재 인덱스가 0보다 크면
					index--; // 다른 위치에서 사용되는 변수는 멤버 변수로 선언해야 함
				} else { // 현재 인덱스가 0이 되면
					index = STRINGS.length-1; // 배열의 가장 큰 인덱스 번호로 변경
				}
				lblOuput.setText(STRINGS[index]);
			}
		});
		btnPrev.setFont(font);
		btnPrev.setBounds(12, 89, 141, 80);
		frame.getContentPane().add(btnPrev);
		// end btnPrev

		JButton btnNext = new JButton("다음");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < STRINGS.length-1) { // 현재 인덱스가 0보다 크면
					index++; // 다른 위치에서 사용되는 변수는 멤버 변수로 선언해야 함
				} else { // 현재 인덱스가 0이 되면
					index = 0; // 배열의 가장 큰 인덱스 번호로 변경
				}
				lblOuput.setText(STRINGS[index]);
			}
		});
		btnNext.setFont(font);
		btnNext.setBounds(281, 89, 141, 80);
		frame.getContentPane().add(btnNext);
		// end btnNext

	} // end initialize()

} // end GuiMain07
