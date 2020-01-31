package edu.java.gui14;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class GuiMain14 {

	private JFrame frame;
	private JTextField txtInputId; // 아이디 입력 변수
	private JPanel topPanel; // 로그인, 로그아웃, 아이디 등을 입력하는 판넬
	private JPanel contentPane; // 시작할 때 생성되는 기본 판넬(버튼 등 없음)
	private JLabel lblInfo, lblTest;
	private JButton btnLogin, btnLogout;
	private boolean isLogin = false; // 로그아웃, 로그인 상태를 체크하기 위한 변수
	private JPanel loginPanel; // 로그인했을 때 보이는 판넬
	private JPanel logoutPanel; // 로그아웃했을 때 보이는 판넬
	private Component currentComponent; // 현재 가지고 있는 컴퍼넌트 확인 변수
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain14 window = new GuiMain14();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public GuiMain14() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		// BorderLayout은 5개의 구역으로 분할하여 사용하는 레이아웃
		
		topPanel = new JPanel();
		// topPanel의 위치를 북쪽에 배치
		frame.getContentPane().add(topPanel, BorderLayout.NORTH);
		topPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		topPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		/* topPanel에 들어갈 컴퍼넌트 */
		lblInfo = new JLabel("안녕하세요");
		topPanel.add(lblInfo);
		
		txtInputId = new JTextField();
		topPanel.add(txtInputId);
		txtInputId.setColumns(10);
		
		btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (isLogin == false) { // 로그아웃 상태일 때 실행
					lblInfo.setText(txtInputId.getText() + " 환영합니다");
					
					// 현재 판넬 제거
					frame.getContentPane().remove(currentComponent); // currentComponent는 없어도 상관 없음
					frame.revalidate(); // 컴퍼넌트 재검트
					frame.repaint(); // 컴퍼넌트 재작성
					
					// 로그인했을 때 보여줄 판넬 추가
					loginPanel = new JPanel();
					JLabel lblLogin = new JLabel("로그인 되었습니다.");
					loginPanel.add(lblLogin);
					frame.getContentPane().add(loginPanel, BorderLayout.CENTER);
					frame.revalidate();
					frame.repaint();
					
					// 현재 컴퍼넌트 정보와 로그인 정보 변경
					currentComponent = loginPanel;
					isLogin = true;
					
				}
				
			}
		});
		topPanel.add(btnLogin);
		
		btnLogout = new JButton("로그아웃");
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(isLogin == true) { // 로그인 상태일 때 실행
					lblInfo.setText("안녕하세요");
					
					// 현재 판넬 제거
					frame.getContentPane().remove(currentComponent);
					frame.revalidate();
					frame.repaint();
					
					// 로그아웃했을 때 보여줄 판넬 추가
					logoutPanel = new JPanel();
					JLabel lblLogout = new JLabel("로그아웃 되었습니다.");
					logoutPanel.add(lblLogout);
					frame.getContentPane().add(logoutPanel, BorderLayout.CENTER);
					frame.revalidate();
					frame.repaint();
					
					// 현재 컴퍼넌트 정보와 로그인 정보 변경
					currentComponent = loginPanel;
					isLogin = false;
				}
			}
		});
		topPanel.add(btnLogout);
		
		/* 기본 판넬 생성 */
		contentPane = new JPanel();
		// 현재 컴퍼넌트에 판넬 저장
		currentComponent = contentPane;
		frame.getContentPane().add(contentPane, BorderLayout.CENTER);
		
	} // end initialize()

} // end GuiMain14
