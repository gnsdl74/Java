package edu.java.gui04;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class GuiMain04 {

	private JFrame frame;
	private JTextField textNum1, textNum2;
	private JButton btnSum, btnSub, btnMul, btnDiv;
	private JTextArea resultArea;
	private double a, b;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain04 window = new GuiMain04();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain04() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel number1 = new JLabel("Number 1");
		number1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		number1.setHorizontalAlignment(SwingConstants.CENTER);
		number1.setBounds(12, 10, 150, 30);
		frame.getContentPane().add(number1);

		JLabel number2 = new JLabel("Number 2");
		number2.setHorizontalAlignment(SwingConstants.CENTER);
		number2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		number2.setBounds(12, 50, 150, 30);
		frame.getContentPane().add(number2);
		// end Number1, Number2 Label

		textNum1 = new JTextField();
		textNum1.setFont(new Font("굴림", Font.PLAIN, 15));
		textNum1.setBounds(180, 10, 220, 30);
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);

		textNum2 = new JTextField();
		textNum2.setFont(new Font("굴림", Font.PLAIN, 15));
		textNum2.setColumns(10);
		textNum2.setBounds(180, 50, 220, 30);
		frame.getContentPane().add(textNum2);
		// end num1, num2 textField

		btnSum = new JButton("+");
		btnSum.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					a = Double.parseDouble(textNum1.getText());
					b = Double.parseDouble(textNum2.getText());
					// num1, num2의 입력된 텍스트값을 파싱해서 저장
					String msg = a + " + " + b + " = " + (a + b) + "\n";
//					resultArea.setText(msg);
					resultArea.append(msg);
				} catch (Exception e1) {
					String msg = "Enter the Number.\n";
					resultArea.setText(msg);
				}
			}
		});
		btnSum.setFont(new Font("돋움", Font.BOLD, 25));
		btnSum.setBounds(40, 90, 50, 50);
		frame.getContentPane().add(btnSum);
		// end btnSum

		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					a = Double.parseDouble(textNum1.getText());
					b = Double.parseDouble(textNum2.getText());
					// num1, num2의 입력된 텍스트값을 파싱해서 저장
					if (b < 0) {
						String msg = a + " - (" + b + ") = " + (a - b) + "\n";
						resultArea.append(msg);
					} else {
						String msg = a + " - " + b + " = " + (a - b) + "\n";
						resultArea.append(msg);
					}
				} catch (Exception e1) {
					String msg = "Enter the Number.\n";
					resultArea.setText(msg);
				}

			}
		});
		btnSub.setFont(new Font("돋움", Font.BOLD, 25));
		btnSub.setBounds(140, 90, 50, 50);
		frame.getContentPane().add(btnSub);
		// end btnSub

		btnMul = new JButton("*");
		btnMul.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// KeyEvent : 사용자가 누른 키의 정보를 가지고 있음
				try {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) { // Enter 키를 눌렀을 경우에만 메소드 실행
						a = Double.parseDouble(textNum1.getText());
						b = Double.parseDouble(textNum2.getText());
						// num1, num2의 입력된 텍스트값을 파싱해서 저장
						String mul = String.format("%.2f", a * b);
						String msg = a + " * " + b + " = " + mul + "\n";
						resultArea.append(msg);
					}
				} catch (Exception e1) {
					String msg = "Enter the Number.\n";
					resultArea.setText(msg);
				}
			}
		});
		btnMul.setFont(new Font("돋움", Font.BOLD, 25));
		btnMul.setBounds(240, 90, 50, 50);
		frame.getContentPane().add(btnMul);
		// end btnMul

		btnDiv = new JButton("/");
		btnDiv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				try {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						a = Double.parseDouble(textNum1.getText());
						b = Double.parseDouble(textNum2.getText());
						// num1, num2의 입력된 텍스트값을 파싱해서 저장
						if (b == 0) {
							String msg = "Not Div /0\n";
							resultArea.setText(msg);
						} else {
							String div = String.format("%.2f", a / b);
							String msg = a + " / " + b + " = " + div + "\n";
							resultArea.append(msg);
						}
					}
				} catch (Exception e1) {
					String msg = "Enter the Number.\n";
					resultArea.setText(msg);
				}
			}
		});

		btnDiv.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					a = Double.parseDouble(textNum1.getText());
					b = Double.parseDouble(textNum2.getText());
					// num1, num2의 입력된 텍스트값을 파싱해서 저장
					if (b == 0) {
						String msg = "Not Div /0\n";
						resultArea.setText(msg);
					} else {
						String div = String.format("%.2f", a / b);
						String msg = a + " / " + b + " = " + div + "\n";
						resultArea.append(msg);
					}
				} catch (Exception e1) {
					String msg = "Enter the Number.\n";
					resultArea.setText(msg);
				}
			}

		});
		btnDiv.setFont(new Font("돋움", Font.BOLD, 25));
		btnDiv.setBounds(340, 90, 50, 50);
		frame.getContentPane().add(btnDiv);
		// end btnDiv

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 150, 360, 101);
		frame.getContentPane().add(scrollPane);

		resultArea = new JTextArea();
		resultArea.setFont(new Font("Consolas", Font.BOLD, 20));
		resultArea.setEditable(false);
		scrollPane.setViewportView(resultArea);

	} // end initialize()
} // end GuiMain04
