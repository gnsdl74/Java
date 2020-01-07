package edu.java.homework;

import java.util.Scanner;

public class HomeWork02 {

	public static Scanner sc;

	public static void main(String[] args) {

		// CodeUp 1402 : 거꾸로 출력하기 3
		sc = new Scanner(System.in);
		System.out.print("데이터 개수 : ");
		int data = sc.nextInt();
		int[] arr1 = new int[data];

		System.out.print("내용 입력 : ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[arr1.length - 1 - i] + " ");
		}
		System.out.println();
		System.out.println("===================================");

		// CodeUp 1403 : 배열 두번 출력하기
		System.out.print("k 입력 : ");
		int k_Num = sc.nextInt();
		int[] arr2 = new int[2 * k_Num];

		System.out.print("숫자 입력 : ");
		for (int i = 0; i < arr2.length; i++) {
			if (i < k_Num) {
				arr2[i] = sc.nextInt();
			} else {
				arr2[i] = arr2[i - k_Num];
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("===================================");

		// CodeUp 1405
		System.out.print("숫자의 개수 입력 : ");
		int num = sc.nextInt();
		int[][] arr3 = new int[num][num];

		System.out.print("숫자 입력 : ");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				if (i == 0) {
					arr3[i][j] = sc.nextInt();

				} else {
					if (j == num - 1) {
						arr3[i][j] = arr3[i - 1][j - (num - 1)];
					} else {
						arr3[i][j] = arr3[i - 1][j + 1];
					}
				}

			}
		}

		for (int[] x : arr3) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");

		// CodeUp 1411
		System.out.print("카드 전체 장수 : ");
		int cardNum = sc.nextInt();
		int[] arr4 = new int[cardNum];
		int all = 0, total = 0;

		for (int i = 0; i < arr4.length; i++) {
			arr4[i] = i + 1;
			all += arr4[i];
		} // 잃어버리기 전의 카드 합

		for (int i = 0; i < arr4.length - 1; i++) {
			System.out.print("가지고 있는 카드 값 : ");
			int hand = sc.nextInt();
			total += hand;
		} // 가지고 있는 카드 합
		sc.close();

		int lostCard = all - total; // 전체 - 손패 = 잃어버린 카드
		System.out.println(lostCard);

	} // end main()

} // end HomeWork
