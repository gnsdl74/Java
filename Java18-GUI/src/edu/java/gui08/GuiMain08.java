package edu.java.gui08;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GuiMain08 {

	private JFrame frame;
	// 현재 인덱스 저장
	private int index;
	// 이미지들이 저장된 위치(경로)를 문자열로 저장
	private static final String[] IMAGES = { "res/flower1.png", "res/flower2.png", "res/flower3.png", "res/flower4.png", "res/flower5.png" };

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain08 window = new GuiMain08();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain08() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("이미지 출력");
		frame.setBounds(100, 100, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 48);
		JLabel lblImage = new JLabel();
		lblImage.setBounds(93, 10, 256, 256);
		lblImage.setIcon(new ImageIcon(IMAGES[index]));
		
		frame.getContentPane().add(lblImage);
		// end lblImage

		JButton btnPrev = new JButton("이전");
		btnPrev.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) { // 현재 인덱스가 0보다 크면
					index--; // 다른 위치에서 사용되는 변수는 멤버 변수로 선언해야 함
				} else { // 현재 인덱스가 0이 되면
					index = IMAGES.length - 1; // 배열의 가장 큰 인덱스 번호로 변경
				}
				lblImage.setIcon(new ImageIcon(IMAGES[index]));
			}
		});
		btnPrev.setFont(font);
		btnPrev.setBounds(12, 305, 141, 80);
		frame.getContentPane().add(btnPrev);
		// end btnPrev

		JButton btnNext = new JButton("다음");
		btnNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < IMAGES.length - 1) { // 현재 인덱스가 0보다 크면
					index++; // 다른 위치에서 사용되는 변수는 멤버 변수로 선언해야 함
				} else { // 현재 인덱스가 0이 되면
					index = 0; // 배열의 가장 큰 인덱스 번호로 변경
				}
				lblImage.setIcon(new ImageIcon(IMAGES[index]));
			}
		});
		btnNext.setFont(font);
		btnNext.setBounds(281, 305, 141, 80);
		frame.getContentPane().add(btnNext);
		// end btnNext

	} // end initialize()

} // end GuiMain08
