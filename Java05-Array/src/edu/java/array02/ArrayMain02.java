package edu.java.array02;

public class ArrayMain02 {

	public static void main(String[] args) {
		System.out.println("배열의 선언, 초기화, 출력");

		// int형 정수 10개를 저장할 수 있는 배열 선언
		int[] array = new int[10];

		// 배열의 길이 출력
		System.out.println("배열의 길이 : " + array.length);

		// for문을 사용한 배열의 초기화
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		System.out.println("===========================");

		// for문을 사용한 배열 내용 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "번째 값 : " + array[i]);
		}
		System.out.println("===========================");

		// 배열의 모든 원소들을 더하기
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("sum : " + sum);

	} // end main()

} // end ArrayMain01
