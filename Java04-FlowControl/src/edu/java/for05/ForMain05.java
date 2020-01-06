package edu.java.for05;

public class ForMain05 {

	public static void main(String[] args) {
		System.out.println("for문 연습4");

		// 등차수열의 합 구하기
		// 1 + 2 + 3 + ... + 10

		int sum1 = 0;

		for (int i = 1; i <= 10; i++) {
			sum1 += i;
//			System.out.println(sum1);
		}
		System.out.println(sum1);

		// 1 ~ 100까지의 짝수들의 합을 출력
		int total = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				total += i;
//				System.out.println(total);
			}
		}
		System.out.println(total);

	} // end main()

} // end ForMain05
