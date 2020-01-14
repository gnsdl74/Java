package edu.java.interface05;

import java.util.Scanner;

public class InterfaceMain05 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("-------------------------------");
			System.out.println("0.종료 | 1.입력 | 2.검색");
			System.out.println("-------------------------------");
			System.out.println("선택> ");

			int choice = sc.nextInt();
			switch (choice) {
			case Menu.MENU_QUIT:
				run = false;
				System.out.println(Menu.STR_QUIT);
				break;
			case Menu.MENU_INSERT:
				System.out.println(Menu.STR_INSERT);
				break;
			case Menu.MENU_SELECT:
				System.out.println(Menu.STR_SELECT);
				break;
			default:
				System.out.println("올바른 번호를 선택하세요.");
				break;
			} // end switch
			
		} // end while

		
		
	} // end main()

} // end InterfaceMain05
