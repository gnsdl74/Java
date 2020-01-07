package edu.java.array03;

import java.util.Scanner;

public class ArrayMain03 {

	public static void main(String[] args) {
		System.out.println("배열 연습");

		int[] scores = new int[3];

		// for문을 사용하여, 입력받은 점수를 배열에 저장
		Scanner sc = new Scanner(System.in);
		// Ctrl + Shift + O : 자동 import 단축키
		for (int i = 0; i < scores.length; i++) {
			System.out.print("입력> ");
			scores[i] = sc.nextInt();
		}
		sc.close();
		System.out.println("=========================");

		// for문을 사용하여, 입력받은 모든 점수 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i + 1 + "번째 점수 : " + scores[i]);
		}
		System.out.println("=========================");

		// 배열에 있는 모든 점수들의 합계를 출력
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("=========================");

		// 점수의 평균을 계산하여 출력(소수점까지 출력)
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + String.format("%.2f", avg));
		System.out.println("=========================");

		// 점수의 최대값 출력
		int max = Integer.MIN_VALUE; // int 범위 중 최소값 저장
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				count = i + 1;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값의 번호 : " + count);
		System.out.println("=========================");

		// 점수의 최소값 출력
		int min = Integer.MAX_VALUE; // int 범위 중 최대값 저장
		for (int i = 0; i < scores.length; i++) {
			if (min > scores[i]) {
				min = scores[i];
				count = i + 1;
			}
		}
		System.out.println("최소값 : " + min);
		System.out.println("최소값의 번호 : " + count);
		System.out.println("=========================");

		System.out.println("가운데 값 출력 : " + scores[scores.length / 2]);

	} // end main()

} // end ArrayMain03
