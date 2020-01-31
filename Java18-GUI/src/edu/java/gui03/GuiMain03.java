package edu.java.gui03;

import java.awt.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiMain03 {

	private JFrame frame;
	private JTextField textName, textPhone, textEmail, textOutput;
	private JTextArea textArea;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain03 window = new GuiMain03();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain03() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("연락처 프로그램");
		frame.setBounds(100, 100, 930, 650); // Frame Size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null); // Absolute Layout
		
		JLabel lblName = new JLabel("이름");
		lblName.setOpaque(true); // false가 default로 배경색을 투명하게 만듬, true는 배경을 투명하지 않게 만들어 배경색을 설정할 수 있다.
		lblName.setBackground(Color.PINK);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setFont(new Font("굴림", Font.BOLD, 48));
		lblName.setBounds(12, 10, 245, 76);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setOpaque(true);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setFont(new Font("굴림", Font.BOLD, 48));
		lblPhone.setBackground(Color.ORANGE);
		lblPhone.setBounds(12, 96, 245, 76);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setOpaque(true);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("굴림", Font.BOLD, 48));
		lblEmail.setBackground(Color.yellow);
		lblEmail.setBounds(12, 182, 245, 76);
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("맑은 고딕", Font.ITALIC, 30));
		textName.setBounds(269, 10, 633, 76);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("맑은 고딕", Font.ITALIC, 30));
		textPhone.setBounds(269, 96, 633, 76);
		frame.getContentPane().add(textPhone);
		textPhone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("맑은 고딕", Font.ITALIC, 30));
		textEmail.setBounds(269, 182, 633, 76);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textOutput = new JTextField();
		textOutput.setEditable(false);	// textOutput을 편집할 수 없도록 제한(JTextField, JTextArea등 에서 사용)
		textOutput.setBounds(12, 378, 890, 100);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
		
		JButton btnInsert = new JButton("정보 출력");
		btnInsert.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String name = textName.getText();
				String phone = textPhone.getText();
				String email = textEmail.getText();
				String msg = "이름 : " + name + "\n" + "전화번호 : " + phone + "\n" + "이메일 : " + email;
				textOutput.setText(msg);
				textArea.setText(msg);
			}
		});
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 48));
		btnInsert.setBounds(12, 268, 890, 100);
		frame.getContentPane().add(btnInsert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 479, 890, 123);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("굴림", Font.PLAIN, 20));
		scrollPane.setViewportView(textArea);
		
	} // end initialize()

} // end GuiMain03