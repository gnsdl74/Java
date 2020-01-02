package edu.java.variable09;

import java.util.Scanner;

public class VariableMain09 {

	public static void main(String[] args) {
		System.out.println("총점 계산 프로그램");
		
		// 키보드로 국/영/수 점수를 입력받아서
		// 총점과 평균을 출력하는 프로그램 작성
		
		// 1. 입력받을 준비 : Scanner 준비
		Scanner sc = new Scanner(System.in);
		
		// 2. 국어, 영어, 수학 점수를 int로 입력받아서 저장
//		System.out.println("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		System.out.println("영어 점수 입력 : ");
//		int eng = sc.nextInt();
//		System.out.println("수학 점수 입력 : ");
//		int math = sc.nextInt();
		
		System.out.println("---과목 점수 입력---");
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		while (kor <= 0 || kor > 100) {
			System.out.println("잘못된 점수입니다.");
			System.out.print("국어 점수 입력 : ");
			kor = sc.nextInt();
		}
		
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		while (eng <= 0 || eng > 100) {
			System.out.println("잘못된 점수입니다.");
			System.out.print("영어 점수 입력 : ");
			eng = sc.nextInt();
		}
		
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();
		while (math <= 0 || math > 100) {
			System.out.println("잘못된 점수입니다.");
			System.out.print("수학 점수 입력 : ");
			math = sc.nextInt();
		}
		System.out.println();
		
		// 3. 국어, 영어, 수학 점수를 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);
		System.out.println();
		
		// 4. 총점을 계산해서 출력
		int total = kor+eng+math;
		System.out.println("과목의 합 : " + total);
		
		// 5. 평균을 계산해서 출력(소수점 셋째자리까지)
		// 참고) 정수 / 실수 -> 실수값을 돌려줌
		// 예시 1/2.0 = 0.5
		double avg = total/3.0;
		System.out.printf("과목의 평균 : %.3f" , avg);
		
		// 6. Scanner 종료(close)
		sc.close();
		
		
		
		
		
	}
}
