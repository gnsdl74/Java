package edu.java.collection04;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionMain04 {

	public static void main(String[] args) {

		// 수학/영어 점수 입력 받아서 Score 객체 생성
		// 이름, Score 객체로 Student 객체를 3개 생성
		// LinkedList를 생성하여 Student 정보를 저장(add)
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		String judge;
		Score score;
		Student stu;
		LinkedList<Student> list = new LinkedList<Student>();

		while (run) {
			System.out.println("0.종료 | 1.학생 정보 입력");
			System.out.print("선택> ");
			judge = sc.next();

			if (judge.equals("0")) {
				System.out.println("프로그램 종료");
				run = false;

			} else if (judge.equals("1")) {
				System.out.print("이름, 수학, 영어 점수 입력 : ");
				String name = sc.next();
				int math = sc.nextInt();
				int eng = sc.nextInt();
				sc.nextLine();

				score = new Score(eng, math);
				stu = new Student(name, score);
				list.add(stu);

			} else {
				System.out.println("올바른 번호를 입력하세요.");
			} // end if-else
		} // end while
		sc.close(); // 학생 정보 입력

		// LinkedList의 내용을 검색(get), 변경(set), 삭제(remove) 하기
		// 검색 예시)
		// --- 학생[0] 정보 ---
		// 이름 : Kim
		// 수학 : 100
		// 영어 : 100
		// 변경 및 삭제는 임의의 인덱스와 데이터로 변경
		System.out.println();
		System.out.println("LinkedList 출력");
		for (int i = 0; i < list.size(); i++) {
			System.out.println("--- 학생[" + i + "] 정보 ---");
			System.out.println(list.get(i));
		} // 검색

		System.out.println("================================");
		score =  new Score(90, 90);
		stu = new Student("None", score);
		list.set(1, stu);
		System.out.println(list.get(1));
		// 수정

		System.out.println("================================");
		list.remove(1);
		// 삭제

		for (Student s : list) {
			System.out.println(s);
		} // 재출력

	} // end main()

} // end CollectionMain04
