package edu.java.gui11;

import java.awt.*;
import java.awt.event.*;
import java.io.File;

import javax.swing.*;

public class GuiMain11 {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain11 window = new GuiMain11();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain11() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JFileChooser : 파일을 선택할 수 있는 팝업 창
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(null);
				if( result == JFileChooser.APPROVE_OPTION) { // 확인버튼을 누르면
					System.out.println("파일 선택");
					File selected = chooser.getSelectedFile();
					System.out.println(selected.getAbsolutePath());
				} else {
					System.out.println("취소");
				}
				
			}
		});
		
		mnFile.add(mntmOpen);
		// end mntmOpen
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		
		mntmExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ConfirmDialog :
				// Yes(확인) - No(아니오) - Cancel(취소) 버튼을 갖는 다이얼로그
				int result = 
//						JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
						JOptionPane.showConfirmDialog(null, "종료하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.YES_OPTION) { // 예 버튼을 누르면
					// 프로그램 종료
					// System.exit(0); 정상 종료
					// System.exit(0 이외의 숫자); 비정상 종료
					System.exit(0);
				} else if(result == JOptionPane.NO_OPTION) { // 아니오 버튼을 누르면
					System.out.println("취소");
				}
			}
		});
		
		mnFile.add(mntmExit);
		// end mntmExit
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		// end mnHelp
		
		JMenuItem mntmAbout = new JMenuItem("About");
		
		mntmAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메시지와 Ok 버튼만 있는 다이얼로그 : MessageDialog
//				JOptionPane.showMessageDialog(null, "버전 1.0"); // 부모 컴퍼넌트에 null을 설정하면 무작위 위치로 창이 생성
				// 매개변수 parentComponent :
				//	 MessageDialog의 부모 컴퍼넌트를 설정
				//   설정이 되어 있으면, 다이얼로그는 부모 창의 가운데에 보임
				//   null로 되어 있으면, 화면의 중아에 보임
				JOptionPane.showMessageDialog(frame, "버전 1.0", "정보", JOptionPane.INFORMATION_MESSAGE); // "정보"는 Title 설정, INFORMATION_MESSAGE는 창의 이미지 설정
			}
		});
		
		mnHelp.add(mntmAbout);
		// end mntmAbout
		
	} // end initialize()
} // end GuiMain11