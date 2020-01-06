package edu.java.while02;

public class WhileMain02 {

	public static void main(String[] args) {
		System.out.println("while 구구단 연습");

		// 구구단 3단을 while문을 사용해서 출력
		int dan = 3;
		int i = 1;
		while (i <= 9) {
			System.out.println(dan + " X " + i + " = " + (dan * i));
			i++;
		}
		System.out.println();

		dan = 2;
		// dan 변수 초기화
		while (dan <= 9) {
			i = 1;
			// i 변수 초기화
			System.out.println(dan + "단");
			while(i <= 9) {
				System.out.println(dan+ " X " + i + " = " + (dan*i));
				i++;
			}
			System.out.println("=========================");
			dan++;
		}
		
		// for문으로 구구단 출력하기
		// 단 : 2 ~ 9
		// 곱하는 수 : 1 ~ 9
		for(dan=2 ;dan<10 ; dan++) {
			System.out.println(dan + "단");
			for(i=1 ; i<10 ; i++) {
				System.out.println(dan + " X " + i + " = " + (dan*i));
			}
			System.out.println("===================");
		}

	} // end main()

} // end WhileMain02
