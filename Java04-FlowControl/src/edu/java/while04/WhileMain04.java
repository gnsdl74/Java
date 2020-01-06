package edu.java.while04;

import java.util.Scanner;

public class WhileMain04 {

	public static void main(String[] args) {
		System.out.println("while문으로 입력 받기");
		// while 문과 Scanner 를 이용하여 예금, 출금, 조회, 종료 등을 제공하는 코드 작성
		Scanner sc = new Scanner(System.in);
		int balance = 0; // 예금 잔고
		boolean run = true; // while문의 반복 여부 검사

		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			System.out.print("선택> ");

			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.print("예금액>");
				balance += sc.nextInt();
				break;
			case 2:
				System.out.print("출굼액>");
				balance -= sc.nextInt();
				break;
			case 3:
				System.out.println("잔고> " + balance);
				break;
			case 4:
				System.out.println("종료합니다.");
				run = false;
				break;
			default:
				System.out.println("올바른 메뉴를 선택하세요.");
			}	// end switch
		}	// end while
		
		sc.close();
		System.out.println("프로그램 종료");

	} // end main()

} // end WhileMain04
