package edu.java.wrapper03;

import java.util.Scanner;

public class WrapperMain03 {

	public static void main(String[] args) {
		// 정규표현식 예제 https://mkil.tistory.com/205
		String str = "2020년 1월 17일 12:10:10";
		String[] arr = str.split("[\\D]+"); // \D와 [^0-9]는 같음 : 숫자가 아닌 문자를 뜻함
		int sum = 0;

		for (String x : arr) {
			sum += Integer.parseInt(x);
		} // end for, 문자열 parsing 및 값 합산

		System.out.println("sum = " + sum); // 합계 출력

		System.out.println("===============================");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();

		String[] list = input.split("[^0-9]+");
		for (String x : list) {
			if (!x.isEmpty()) { // isEmpty() : 문자열의 길이가 0인 경우 true(null은 아님)
				System.out.println(x);
			}
		}

	} // end main()

} // end WrapperMain03
