package edu.java.exception02;

import java.util.Scanner;

public class ExMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		sc.close();
		
		if(n2 != 0) {
		int result = n1 / n2;
		System.out.println("result = " + result);
		} else {
			System.out.println();
		}
		
		/*
		 *  예외 처리 : try 구문
		 *  try {
		 *      정상적인 실행 문장들;
		 *  } catch (예외클래스 변수이름 {
		 *     예외상황일 때 실행할 문장들
		 *  }
		 */
		
		try {
			System.out.println("try 내부");
			int result = n1/n2;
		} catch (Exception e) { // 예외 상황
			System.err.println("예외 발생!");
		}
		
		System.out.println("프로그램 종료");
		
		
	} // end main()

} // end ExMain02
