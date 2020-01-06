package edu.java.while01;

/*
 * while문
 * - for문과 같은 반복문
 * - 선언형태
 * 		while(조건) {
 * 		   (본문)
 * 		}
 */

public class WhileMain01 {

	public static void main(String[] args) {
		System.out.println("while 반복문");

		int x = 0;
		while (x <= 10) {
			System.out.println(x);
			x++;
		}
		
		System.out.println("==========================");
		// while문을 사용하여 10, 9, 8, ... , 2, 1 까지 출력하기
		int i=10;
		while(i>0) {
			System.out.println(i);
			i--;
		}

	} // end main()

} // end WhileMain01
