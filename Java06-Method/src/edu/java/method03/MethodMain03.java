package edu.java.method03;

import java.util.Scanner;

public class MethodMain03 {

	public static void main(String[] args) {
		// 1. 국어, 영어, 수학 점수를 입력받아서 저장
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 성적 입력 : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		sc.close();

		// 2. 입력받은 점수 출력
		System.out.println("국어 점수 : " + kor);
		System.out.println("영어 점수 : " + eng);
		System.out.println("수학 점수 : " + math);

		// 3. public static int calcTotal(int kor, int eng, int math) 메소드를
		// 정의하고, 함수를 호출하여 세 과목의 총점을 출력
		int total = calcTotal(kor, eng, math);
		System.out.println("세 과목 총점 : " + total);

		// 4. public static double calcAverage(int total) 메소드를 정의하고
		// 함수를 호출하여 세 과목의 평균을 출력(소수점까지 정확하게)
		double avg = calcAverage(total);
		System.out.println("세 과목 평균 : " + String.format("%.3f", avg));

		// 5. public static char calcGrade(double avg) 메소드를 정의하고,
		// 함수를 호출하여 성적(100 ~ 90, 89 ~ 80, ...)에 따른
		// 등급 ('A', 'B', 'C', 'F')을 출력
		char grade = calcGrade(avg);
		System.out.println("성적 등급 : " + grade);

	} // end main()

	public static int calcTotal(int kor, int eng, int math) {
		return kor + eng + math;
	} // end clacTotal()

	public static double calcAverage(int total) {
		return (double) total / 3;
	} // end calcAverage()

	public static char calcGrade(double avg) {
		char grade;
		if (avg >= 90) {
			grade = 'A';
		} else if (avg >= 80) {
			grade = 'B';
		} else if (avg >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		return grade;
	} // end calcGrade()

} // end MethodMain03
