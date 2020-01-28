package edu.java.contact01;

import java.util.Scanner;

public class ContactMain01 {
	public static final int MENU_QUIT = 0;
	public static final int MENU_INSERT = 1;
	public static final int MENU_SELECT_ALL = 2;
	public static final int MENU_SELECT = 3;
	public static final int MENU_UPDATE = 4;
	// ContactMain02에서 Menu 인터페이스로 분리

	// 연락처 최대 저장 개수 - 상수
	public static final int MAX = 100;

	public static Scanner sc = new Scanner(System.in);
	public static Contact[] contactList = new Contact[MAX];
	public static int count = 0; // 배열에 접근할 인덱스**
	// 메소드에 필요한 변수를 ContactDAOImple로 분리

	public static void main(String[] args) {

		boolean run = true;
		System.out.println("연락처 Version 0.1");
		int choice = 0;

		while (run) {
			showMainMenu();
			choice = sc.nextInt();
			sc.nextLine(); // 입력한 숫자 뒤에 엔터키를 제거

			// 선택된 번호에 따라 각 기능을 수행
			switch (choice) {
			case MENU_INSERT:
				insertContact(sc);
				break;

			case MENU_SELECT_ALL:
				allSelectContact();
				break;

			case MENU_SELECT:
				selectContact(sc);
				break;

			case MENU_UPDATE:
				updateContact(sc);
				break;

			case MENU_QUIT:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			default:
				System.out.println("올바른 번호를 선택하세요.");
				System.out.println();
				break;
			} // end switch

		} // end while
		sc.close();

	} // end main()

	// 메소드 -> ContactMain02에서 ContactDAOImple로 분리
	// 연락처 등록
	public static void insertContact(Scanner sc) {
		if (count < contactList.length) {
			System.out.println("--- 연락처 등록 ---");
			System.out.print("이름> ");
			String name = sc.next();
			System.out.print("전화번호> ");
			String phone = sc.next();
			System.out.print("이메일> ");
			String email = sc.next();

			// Contact 인스턴스 생성
			Contact contact = new Contact(name, phone, email);

			// 배열에 저장
			contactList[count] = contact; // 0번부터 저장해서
			count++; // 하나씩 증가하면서 저장

			System.out.println("입력이 완료되었습니다.");

		} else {
			System.out.println("저장할 수 있는 최대 연락처입니다.");
		}
//		for (int i = 0; i < contactList.length; i++) {
//			if (contactList[i] == null) {
//				contactList[i] = contact;
//				break;
//			} else if (contactList[contactList.length - 1] != null) {
//				System.out.println("연락처를 더이상 저장할 수 없습니다.");
//				System.out.println();
//				break;
//			}
//		} // end for	-by KH

	} // end insert()

	// 연락처 전체 검색
	public static void allSelectContact() {
		if (contactList[0] == null) {
			System.out.println("저장된 연락처가 없습니다.");
			System.out.println();
		}
		for (int i = 0; i < count; i++) {
			if (contactList[i] != null) {
				System.out.print("인덱스> " + (i + 1) + "\n");
				contactList[i].displayInfo();
				System.out.println("======================");
				System.out.println();
			}
		}
	} // end allSelect()

	// 연락처 상세검색
	public static void selectContact(Scanner sc) {
		if (contactList[0] == null) {
			System.out.println("저장된 연락처가 없습니다.");
			System.out.println();
		} else {
			System.out.print("검색할 인덱스> ");
			int index = sc.nextInt();
			if (index >= 1 && index <= 99) {
				if (contactList[index - 1] != null) {
					System.out.print("인덱스> " + index + "\n");
					contactList[index - 1].displayInfo();
				} else {
					System.out.println("찾으려는 연락처가 없습니다.");
					System.out.println();
				}
			} else {
				System.out.println("유효하지 않은 번호입니다.");
				System.out.println();
			}
		}
	} // end select()

	// 연락처 수정
	public static void updateContact(Scanner sc) {
		if (contactList[0] == null) {
			System.out.println("저장된 연락처가 없습니다.");
			System.out.println();
		} else {
			System.out.print("수정할 인덱스> ");
			int index = sc.nextInt();
			if (index >= 1 && index <= 100) {
				if (contactList[index - 1] != null) {
					System.out.print("인덱스> " + index + "\n");
					contactList[index - 1].displayInfo();
					System.out.println("------ 수정 -------");
					System.out.print("이름 수정 : ");
					contactList[index - 1].setName(sc.next());
					System.out.print("전화번호 수정 : ");
					contactList[index - 1].setPhone(sc.next());
					System.out.print("이메일 수정 : ");
					contactList[index - 1].setEmail(sc.next());
				} else {
					System.out.println("수정할 연락처가 없습니다.");
					System.out.println();
				}
			} else {
				System.out.println("유효하지 않은 번호입니다.");
				System.out.println();
			}
		}
	} // end update()

	public static void showMainMenu() {
		System.out.println("-----------------------------------------");
		System.out.println(" 1.등록 | 2.전체검색 | 3.상세검색 | 4.수정 | 0.종료");
		System.out.println("-----------------------------------------");
		System.out.print("선택> ");
	} // end showMainMenu()

} // end ContactMain01
