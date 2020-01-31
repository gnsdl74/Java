package edu.java.gui13;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class GuiMain13 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain13 window = new GuiMain13();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain13() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn1 = new JButton("New Frame");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 프레임 호출
				MyFrame frame1 = new MyFrame();
				frame1.setVisible(true);
			}
		});
		btn1.setFont(new Font("굴림", Font.PLAIN, 24));
		btn1.setBounds(12, 30, 410, 47);
		frame.getContentPane().add(btn1);
		// end btn1
		
		JButton btn2 = new JButton("New Dialog");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 다이얼로그 호출
				MyDialog dialog = new MyDialog();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			}
		});
		btn2.setFont(new Font("굴림", Font.PLAIN, 24));
		btn2.setBounds(12, 87, 410, 47);
		frame.getContentPane().add(btn2);
		// end btn2
		
	} // end initialize()

} // end GuiMain13
