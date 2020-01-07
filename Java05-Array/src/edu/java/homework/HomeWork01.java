package edu.java.homework;

import java.util.Scanner;

public class HomeWork01 {

	public static Scanner sc;

	public static void main(String[] args) {

		// 과제1 : 배열 1, 2, 3, 5, 6의 값 중에 최대값 출력하기
		int[] arr1 = { 1, 2, 3, 5, 6 };

		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println(max);
		System.out.println("===============================");

		// 과제2 : 주어진 배열(1, 2, 3, 5, 6)의 전체 합과 평균 값을 구하기
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			avg = (double) sum / arr1.length;
		}
		System.out.println("전체 합 : " + sum);
		System.out.println("평균 값 : " + avg);
		System.out.println("===============================");

		// 과제3: 피보나치 수열 20개를 출력(1, 1, 2, 3, 5, 8, 13, 21, ...)
		// f[0] = 1
		// f[1] = 1
		// f[n] = f[n-1] + f[n-2], n >= 2
		// 1) 정수 20개를 저장할 수 있는 배열 선언
		// 2) 배열의 인덱스 0번째, 1번째 원소는 1로 초기화
		// 3) 배열의 인덱스 2번째 원소부터 19번째 원소까지는 반복문을 사용해서 초기화
		// 4) 배열의 내용을 출력

		int[] fibonacci = new int[20];
		for (int i = 0; i < fibonacci.length; i++) {
			if (i == 0 || i == 1) {
				fibonacci[i] = 1;
			} else {
				fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
			}
		}

		for (int i : fibonacci) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("===============================");

		// 과제4: 2차원 배열의 전체 합과 평균 구하기
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int total = 0, count = 0;
		double average = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
				count++;
			}
		}
		average = (double) total / count;

		System.out.println("전체 합 : " + total);
		System.out.println("평균 : " + average);

	} // end main()

} // end HomeWork
