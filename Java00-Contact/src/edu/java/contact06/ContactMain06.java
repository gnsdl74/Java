package edu.java.contact06;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;

public class ContactMain06 {

	private JFrame frame;
	private JTextField textName, textPhone, textEmail, textIndex;
	private JTextArea textResult, textChange;
	private JTable table;
	private String[] colNames = { "No", "이름", "연락처", "이메일" };
	private Object[] records = new Object[colNames.length];
	private DefaultTableModel tableModel;

	// DAO : 함수의 기능 및 데이터를 저장/일긱를 수행하는 클래스(인스턴스)
	private static ContactDAO dao;
	private static ArrayList<ContactVO> list;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public ContactMain06() {
		initialize();
	}

	private void initialize() {
		dao = ContactDAOImple.getInstance();

		frame = new JFrame();
		frame.setTitle("Contact Program");
		frame.setBounds(100, 100, 700, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 32);
		JLabel lblNewLabel = new JLabel("연락처 Version 0.6");
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(12, 10, 300, 45);
		frame.getContentPane().add(lblNewLabel);
		// end Title

		JLabel lblName = new JLabel("이름");
		lblName.setFont(font);
		lblName.setBounds(12, 65, 140, 50);
		frame.getContentPane().add(lblName);

		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setFont(font);
		lblPhone.setBounds(12, 125, 140, 50);
		frame.getContentPane().add(lblPhone);

		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setFont(font);
		lblEmail.setBounds(12, 185, 140, 50);
		frame.getContentPane().add(lblEmail);

		textName = new JTextField();
		textName.setBounds(164, 65, 240, 40);
		frame.getContentPane().add(textName);
		textName.setColumns(10);

		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(164, 125, 240, 40);
		frame.getContentPane().add(textPhone);

		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(164, 185, 240, 40);
		frame.getContentPane().add(textEmail);
		// end 이름, 전화번호, 이메일 수집

		font = new Font("맑은 고딕", Font.BOLD, 20);
		JButton btnInput = new JButton("입력");
		btnInput.setFont(font);
		btnInput.setBounds(12, 245, 80, 40);
		frame.getContentPane().add(btnInput);
		// 입력 기능 미구현

		JButton btnInsert = new JButton("등록");
		btnInsert.addActionListener(e -> InsertContact());

		btnInsert.setFont(font);
		btnInsert.setBounds(104, 245, 80, 40);
		frame.getContentPane().add(btnInsert);
		// end Insert

		JButton btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectContactByIndex();
			}
		});
		btnSearch.setFont(font);
		btnSearch.setBounds(196, 245, 80, 40);
		frame.getContentPane().add(btnSearch);
		// end Search

		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setFont(font);
		btnUpdate.setBounds(12, 295, 80, 40);
		frame.getContentPane().add(btnUpdate);
		// end Update

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});
		btnDelete.setFont(font);
		btnDelete.setBounds(104, 295, 80, 40);
		frame.getContentPane().add(btnDelete);
		// end Delete

		JButton btnAllSearch = new JButton("전체검색");
		btnAllSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAllContact();
			}
		});

		btnAllSearch.setFont(font);
		btnAllSearch.setBounds(196, 295, 160, 40);
		frame.getContentPane().add(btnAllSearch);
		// end AllSearch

		textIndex = new JTextField();
		textIndex.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		textIndex.setText("번호입력");
		textIndex.setBounds(288, 245, 116, 40);
		frame.getContentPane().add(textIndex);
		textIndex.setColumns(10);

		JScrollPane scrollSearch = new JScrollPane();
		scrollSearch.setBounds(12, 345, 392, 80);
		frame.getContentPane().add(scrollSearch);

		textResult = new JTextArea("검색 및 전체 검색 내용 출력");
		textResult.setFont(new Font("굴림", Font.PLAIN, 15));
		textResult.setEditable(false);
		scrollSearch.setViewportView(textResult);

		JScrollPane scrollChange = new JScrollPane();
		scrollChange.setBounds(12, 435, 392, 80);
		frame.getContentPane().add(scrollChange);

		textChange = new JTextArea("로그 및 변경 사항 출력");
		textChange.setFont(new Font("굴림", Font.PLAIN, 15));
		textChange.setEditable(false);
		scrollChange.setViewportView(textChange);

		// ********* JTable 사용하기 *********
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setBounds(424, 208, 248, 307);
		frame.getContentPane().add(scrollTable);

		tableModel = new DefaultTableModel(colNames, 0);
		table = new JTable(tableModel);
		table.setFont(new Font("굴림", Font.PLAIN, 15));
		scrollTable.setViewportView(table);

	} // end initialize()

	private void clearTextFields() {
		textName.setText(null);
		textPhone.setText(null);
		textEmail.setText(null);
		textResult.revalidate();
		textResult.repaint();

	} // end clearTextFields()

	private void clearTextArea() {
		textResult.setText(null);
		textChange.setText(null);
		textResult.revalidate();
		textResult.repaint();
	} // end clearTextArea()

	private void InsertContact() {
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();

		if (name.isEmpty()) { // 이름을 입력하지 않았으면
			textChange.setText("이름은 반드시 입력해주세요.");
			return; // 함수 종료
		}

		ContactVO vo = new ContactVO(name, phone, email);

		int result = dao.insert(vo);
		if (result == 1) {
			textChange.setText("연락처 저장 성공");
			clearTextFields();
		} else {
			textChange.setText("연락처 저장 실패");
		}
		clearTextFields();
	} // end InsertContact()

	private void selectContactByIndex() {
		try {
			int index = Integer.parseInt(textIndex.getText());
			if (index >= 1) {
				ContactVO vo = dao.select(index);
				if (vo != null) {
					clearTextArea();
					textResult.append("[" + index + "] 번째 연락처\n");
					textResult.append(vo.toString() + "\n");
				} else {
					textChange.setText("해당하는 연락처가 없습니다. 연락처를 등록하세요.");
				}
			} else {
				textChange.setText("1 이상의 숫자를 입력하세요.");
			}
		} catch (Exception e1) {
			textChange.setText("숫자를 입력하세요.");
		}
	} // end selectContactByIndex()

	private void updateContact() {
		try {
			String name = textName.getText();
			String phone = textPhone.getText();
			String email = textEmail.getText();

			if (name.isEmpty()) {
				textChange.setText("이름은 반드시 입력해주세요.");
				return;
			}

			int index = Integer.parseInt(textIndex.getText());
			if (index >= 1) {
				ContactVO vo = new ContactVO(name, phone, email);

				int result = dao.update(index, vo);
				if (result == 1) {
					textChange.setText("연락처 수정 성공");
				} else {
					textChange.setText(index + "번 연락처가 존재하지 않습니다.");
				}
			} else {
				textChange.setText("1 이상의 숫자를 입력하세요.");
			}
		} catch (Exception e1) {
			textChange.setText("숫자를 입력하세요.");
		}

	} // end updateContact()

	private void deleteContact() {
		try {
			int index = Integer.parseInt(textIndex.getText());

			if (index >= 1) {
				int result = dao.delete(index);
				if (result == 1) {
					textChange.setText("연락처 삭제 성공");
				} else {
					textChange.setText(index + "번 연락처가 존재하지 않습니다.");
				}

			} else {
				textChange.setText("1 이상의 숫자를 입력하세요.");
			}

		} catch (Exception e1) {
			textChange.setText("숫자를 입력하세요");
		}

	} // end deleteContact()

	private void selectAllContact() {
		tableModel.setNumRows(0); // 테이블 데이터를 초기화
		list = dao.select();

		if (list.size() == 0) { // 연락처가 없다면 실행
			textResult.setText("연락처를 먼저 등록하세요");

		} else { // 연락처가 1개라도 있다면 실행
			clearTextArea();
			StringBuffer buffer = new StringBuffer();

			for (int i = 0; i < list.size(); i++) {
				buffer.append((i+1) + "번째 연락처\n" + list.get(i).toString() + "\n");
				records[0] = i+1;
				records[1] = list.get(i).getName();
				records[2] = list.get(i).getPhone();
				records[3] = list.get(i).getEmail();
				tableModel.addRow(records);

				textResult.setText(buffer.toString());
			}
		}
	} // end selectAllContact()

} // end ContactMain05
