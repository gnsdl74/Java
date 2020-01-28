package edu.java.contact02;

import java.util.Scanner;

public class ContactMain02 {

	private static int count;
	private static Scanner sc;
	private static ContactDAO dao;

	public static void main(String[] args) {
		System.out.println("연락처 Version 0.2");

		sc = new Scanner(System.in);
		dao = ContactDAOImple.getInstance();
		boolean run = true;

		while (run) {
			showDisplayMenu();
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case Menu.QUIT: // 종료
				run = false;
				break;
			case Menu.INSERT: // 등록
				insert();
				break;
			case Menu.SELECT_ALL: // 전체 검색
				selectAll();
				break;
			case Menu.SELECT_BY_INDEX: // 상세 검색
				selectByIndex();
				break;
			case Menu.UPDATE: // 수정
				update();
				break;
			default:
				System.out.println("올바른 번호를 선택하세요.\n");
				break;
			} // end switch
		} // end while
		sc.close();
		System.out.println("- 프로그램 종료 -");
	} // end main()

	private static void showDisplayMenu() {
		System.out.println("------------------------------------------");
		System.out.println("0.종료 | 1.등록 | 2.전체 검색 | 3.상세 검색 | 4.수정");
		System.out.println("------------------------------------------");
		System.out.print("선택> ");
	} // end showDisplayMenu()

	private static void insert() {
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("전화번호 입력 : ");
		String phone = sc.nextLine();
		System.out.print("이메일 입력 : ");
		String email = sc.nextLine();
		ContactVO vo = new ContactVO(name, phone, email);

		System.out.println("vo data - " + vo);
		int result = dao.insert(vo);
		if (result == 1) {
			System.out.println("연락처 저장 성공");
		} else {
			System.out.println("연락처 저장 실패");
		}
	} // end insert()

	private static void selectAll() {
		ContactVO[] list = dao.select();

		count = ((ContactDAOImple) dao).getCount();
		if (count == 0) {
			System.out.println("연락처를 등록하세요.\n");
		} else {
			for (int i = 0; i < count; i++) {
				System.out.println("[ " + i + "번째 ] 연락처 정보");
				System.out.println(list[i]);
			}
		}
	} // end selectAll()

	private static void selectByIndex() {
		count = ((ContactDAOImple) dao).getCount();
		if (count == 0) {
			System.out.println("연락처를 등록하세요.\n");
		} else {
			System.out.print("검색할 연락처 인덱스 입력 : \n");
			int index = sc.nextInt();
			sc.nextLine();

			ContactVO vo = dao.select(index);
			if (vo != null) {
				System.out.println("[ " + index + "번째 ] 연락처 정보");
				System.out.println(vo);
			} else {
				System.out.println("해당하는 연락처가 없습니다.\n");
			}
		}
	} // end selectByIndex

	private static void update() {
		count = ((ContactDAOImple) dao).getCount();
		if (count == 0) {
			System.out.println("연락처를 등록하세요.\n");
		} else {
			System.out.print("수정할 연락처 인덱스 입력 : ");
			int index = sc.nextInt();
			sc.nextLine();

			if (index >= 0 && index < count) {
				System.out.println("수정할 이름 입력 : ");
				String name = sc.nextLine();
				System.out.print("수정할 전화번호 입력 : ");
				String phone = sc.nextLine();
				System.out.print("수정할 이메일 입력 : ");
				String email = sc.nextLine();

				ContactVO vo = new ContactVO();
				vo.setName(name);
				vo.setPhone(phone);
				vo.setEmail(email);
				int result = dao.update(index, vo);
				if (result == 1) {
					System.out.println("연락처 수정 성공");
				} else {
					System.out.println("연락처 수정 실패");
				}

			} else {
				System.out.println("해당하는 연락처가 없습니다.\n");
			}
		}
	} // end update()

} // end ContactMain02
