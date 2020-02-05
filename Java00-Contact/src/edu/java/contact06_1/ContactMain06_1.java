package edu.java.contact06_1;

import java.awt.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import java.awt.event.*;

public class ContactMain06_1 {

	private JFrame frame;
	private JTextArea textResult;
	private JTextField textName, textPhone, textEmail, textIndex;
	private JTable table, table_Name;
	private String[] colNames = { "No", "이름", "연락처", "이메일" };
	private Object[] records = new Object[colNames.length];
	private DefaultTableModel tableModel, tableModel_Name;

	// DAO : 함수의 기능 및 데이터를 저장/일긱를 수행하는 클래스(인스턴스)
	private static ContactDAO dao;
	private static ArrayList<ContactVO> list;
	private static int cid;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06_1 window = new ContactMain06_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} // end main()

	public ContactMain06_1() {
		initialize();
	} // end ContactMain07 - 생성자

	private void initialize() {
		dao = ContactDAOImple.getInstance();

		frame = new JFrame();
		frame.setTitle("Contact Program");
		frame.setBounds(100, 100, 799, 680);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		Font font = new Font("굴림", Font.BOLD, 32);
		JLabel lblNewLabel = new JLabel("연락처 Version 0.6_1");
		lblNewLabel.setFont(font);
		lblNewLabel.setBounds(12, 10, 355, 45);
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
		JButton btnInsert = new JButton("등록");
		btnInsert.addActionListener(e -> InsertContact());

		btnInsert.setFont(font);
		btnInsert.setBounds(12, 245, 120, 40);
		frame.getContentPane().add(btnInsert);
		// end Insert

		JButton btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectContactByName();
			}
		});
		btnSearch.setFont(font);
		btnSearch.setBounds(190, 295, 214, 40);
		frame.getContentPane().add(btnSearch);
		// end Search

		JButton btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				updateContact(cid);
			}
		});
		btnUpdate.setFont(font);
		btnUpdate.setBounds(149, 245, 120, 40);
		frame.getContentPane().add(btnUpdate);
		// end Update

		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteContact(cid);
			}
		});
		btnDelete.setFont(font);
		btnDelete.setBounds(284, 245, 120, 40);
		frame.getContentPane().add(btnDelete);
		// end Delete

		JButton btnAllSearch = new JButton("전체검색");
		btnAllSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAllContact();
			}
		});

		btnAllSearch.setFont(font);
		btnAllSearch.setBounds(424, 65, 347, 40);
		frame.getContentPane().add(btnAllSearch);
		// end AllSearch

		textIndex = new JTextField();
		textIndex.setHorizontalAlignment(SwingConstants.CENTER);
		textIndex.setFont(new Font("맑은 고딕", Font.PLAIN, 18));
		textIndex.setText("이름 입력");
		textIndex.setBounds(12, 295, 166, 40);
		frame.getContentPane().add(textIndex);
		textIndex.setColumns(10);

		// ********* JTable 사용하기 *********
		JScrollPane scrollTable = new JScrollPane();
		scrollTable.setBounds(424, 125, 347, 390);
		frame.getContentPane().add(scrollTable);

		tableModel = new DefaultTableModel(colNames, 0);
		table = new JTable(tableModel);
		table.setRowHeight(25);
		table.getColumn("No").setWidth(0);
		table.getColumn("No").setMinWidth(0);
		table.getColumn("No").setMaxWidth(0);
		// table에 표시될 컬럼인 No를 숨김
		table.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();

				cid = (int) tableModel.getValueAt(row, 0);
				System.out.println(tableModel.getValueAt(row, 0));
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});
		table.setFont(new Font("굴림", Font.PLAIN, 15));
		scrollTable.setViewportView(table);

		JScrollPane scrollTable_Name = new JScrollPane();
		scrollTable_Name.setBounds(12, 345, 392, 170);
		frame.getContentPane().add(scrollTable_Name);

		tableModel_Name = new DefaultTableModel(colNames, 0);
		table_Name = new JTable(tableModel_Name);
		table_Name.setRowHeight(25);
		table_Name.getColumn("No").setWidth(0);
		table_Name.getColumn("No").setMinWidth(0);
		table_Name.getColumn("No").setMaxWidth(0);
		// table_Name에 표시될 컬럼인 No를 숨김
		table_Name.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table_Name.getSelectedRow();

				cid = (int) tableModel_Name.getValueAt(row, 0);
				System.out.println(tableModel_Name.getValueAt(row, 0));
				// tableModel_Name에 각 행의 값들이 들어가있고 (클릭한 행, 0)의 좌표에 따라 숨겨져있는 cid가 출력**********
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseReleased(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}
		});
		table_Name.setFont(new Font("굴림", Font.PLAIN, 15));
		scrollTable_Name.setViewportView(table_Name);

		textResult = new JTextArea();
		textResult.setEditable(false);
		textResult.setBounds(12, 525, 759, 100);
		frame.getContentPane().add(textResult);

	} // end initialize()

	public void resizeColumnWidth(JTable table) {
		final TableColumnModel columnModel = table.getColumnModel();
		// TableColumnModel : table에 있는 컬럼을 사용할 수 있게 하는 인터페이스
		// table.getColumnModel() : 해당 table의 컬럼의 모든 정보를 돌려줌
		for (int column = 0; column < table.getColumnCount(); column++) {
			int width = 30; // Min width
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer renderer = table.getCellRenderer(row, column);
				// TableCellRenderer : 테이블 렌더링을 위한 인터페이스
				// table.getCellRenderer(row, column) : 해당 row, column의 위치에 있는 셀의 적절한 렌더링을 돌려줌
				Component comp = table.prepareRenderer(renderer, row, column);
				// table.prepareRenderer(renderer, row, column) : 해당 row, column의 위치에 있는 셀의 값이나 상태를 renderer에 맞춰 렌더링 준비 
				width = Math.max(comp.getPreferredSize().width + 1, width);
				// comp의 적절한 크기정보 중 길이를 반환 -> max 메소드로 최저 길이와 비교하여 최종 길이 결정
			}
			columnModel.getColumn(column).setPreferredWidth(width);
			// 해당 컬럼에 최종 길이를 설정
		}
	} // end resizeColumnWidth -- 자동으로 각 컬럼의 데이터에 맞게 사이즈 조절해주는 메소드

	private void clearTextFields() {
		textName.setText(null);
		textPhone.setText(null);
		textEmail.setText(null);

	} // end clearTextFields()

	private void clearTextResult() {
		textResult.setText(null);
		textResult.revalidate();
		textResult.repaint();
	}

	private void InsertContact() {
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();

		if (name.isEmpty()) { // 이름을 입력하지 않았으면
			clearTextFields();
			textResult.setText("이름은 반드시 입력해주세요.");
			return; // 함수 종료
		}

		ContactVO vo = new ContactVO();
		vo.setName(name);
		vo.setPhone(phone);
		vo.setEmail(email);

		int result = dao.insert(vo);
		if (result == 1) {
			clearTextFields();
			clearTextResult();
			textResult.setText("연락처 등록 성공");
		} else {
			clearTextResult();
			textResult.setText("연락처 등록 실패");
		}
	} // end InsertContact()

	private void selectContactByName() {
		// 연락처 이름 검색
		tableModel_Name.setNumRows(0);
		String S_name = textIndex.getText();
		list = dao.selectName(S_name);
		if (list.size() == 0) {
			clearTextResult();
			textResult.setText("이름에 해당하는 연락처가 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				records[0] = list.get(i).getCid();
				records[1] = list.get(i).getName();
				records[2] = list.get(i).getPhone();
				records[3] = list.get(i).getEmail();
				tableModel_Name.addRow(records);
				resizeColumnWidth(table_Name);
			}
		}
	} // end selectContactByName()

	private void updateContact(int cid) {
		if (cid == 0) {
			clearTextResult();
			clearTextFields();
			textResult.setText("수정할 연락처를 검색하세요.");
			return;
		}

		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();

		if (name.isEmpty()) {
			clearTextResult();
			textResult.setText("이름은 반드시 입력해주세요.");
			return;
		}

		if (cid >= 1) {
			ContactVO vo = new ContactVO();
			vo.setName(name);
			vo.setPhone(phone);
			vo.setEmail(email);

			int result = dao.update(cid, vo);
			if (result == 1) {
			} else {
			}
		}

	} // end updateContact()

	private void deleteContact(int cid) {
		if (cid == 0) {
			clearTextResult();
			clearTextFields();
			textResult.setText("삭제할 연락처를 검색하세요.");
			return;
		}

		if (cid >= 1) {
			int result = dao.delete(cid);
			if (result == 1) {
				clearTextResult();
				textResult.setText("연락처 삭제 성공");
			} else {
				clearTextResult();
				textResult.setText("연락처 삭제 실패");
			}
		}

	} // end deleteContact()

	private void selectAllContact() {
		tableModel.setNumRows(0); // 테이블 데이터를 초기화
		list = dao.select();

		if (list.size() == 0) { // 연락처가 없다면 실행
			clearTextResult();
			textResult.setText("연락처를 등록해주세요");
		} else { // 연락처가 1개라도 있다면 실행
			for (int i = 0; i < list.size(); i++) {
				records[0] = list.get(i).getCid();
				records[1] = list.get(i).getName();
				records[2] = list.get(i).getPhone();
				records[3] = list.get(i).getEmail();
				tableModel.addRow(records);
				resizeColumnWidth(table);
			}
		}
	} // end selectAllContact()
} // end ContactMain05
