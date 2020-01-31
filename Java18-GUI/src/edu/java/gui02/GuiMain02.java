package edu.java.gui02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Point;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GuiMain02 {

	private JFrame frame;
	private JTextField textInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain02 window = new GuiMain02();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	/**
	 * Create the application.
	 */
	public GuiMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		int width = 760;
		JLabel lblOutput = new JLabel("구아아아악");
		lblOutput.setForeground(new Color(102, 153, 204));
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("함초롬돋움", Font.PLAIN, 20));
		lblOutput.setBounds(12, 10, width, 100);
		frame.getContentPane().add(lblOutput);
		
		textInput = new JTextField();
		textInput.setFont(new Font("돋움체", Font.BOLD, 34));
		textInput.setBounds(12, 120, width, 100);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JButton btninput = new JButton("입력");
		btninput.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 버튼을 클릭했을 때 해야 할 기능 구현
				// JTextField에 입력된 내용을 읽어서 JLabel에 씀
				String msg = textInput.getText();
				lblOutput.setText(msg);
				lblOutput.setForeground(new Color(204, 0, 0));
			}
		});
		btninput.setFont(new Font("휴먼옛체", Font.ITALIC, 20));
		btninput.setBounds(12, 230, 760, 100);
		frame.getContentPane().add(btninput);
	} // end initialize()
} // end GuiMain02 
