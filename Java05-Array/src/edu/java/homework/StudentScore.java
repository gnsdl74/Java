package edu.java.homework;

import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		System.out.println("<학생 점수 관리 프로그램>");
		/*
		 * 변수 명명 규칙 1. 첫 번째 글자는 무자이거나, '$', '_' 이어야 하고 숫자로 시작할 수 없다.(필수) 2. 영어 대소문자가
		 * 구분된다. (필수) 3. 첫 문자는 영어 소문자로 시작하되, 다른 단어가 붙을 경우 첫 문자를 대문자로 한다.(관례) 4. 문자
		 * 수(길이)의 제한은 없다. 5. 자바 예약어는 사용할 수 없다.(필수)
		 */

		// 자바 예약어
		// boolean byte, char, String, private, public, new, true, if, else 등
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; // null은 값이 없음을 의미.
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {
				System.out.println("학생수를 입력하세요> ");
				studentNum = sc.nextInt(); // 학생수 입력
				scores = new int[studentNum]; // 학생 수만큼 배열 생성
				System.out.println("학생수" + studentNum + "명 입력 완료");

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println((i + 1) + "번 학생의 점수를 입력하세요> ");
					scores[i] = sc.nextInt(); // 각 학생의 점수 입력
				}

			} else if (selectNo == 3) {
				int i = 0;
				for (int score : scores) {
					i++;
					System.out.println(i + "번 학생의 점수> " + score);
				}

			} else if (selectNo == 4) {

			} else {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}

		}

	} // end main()

} // end StudentScore
