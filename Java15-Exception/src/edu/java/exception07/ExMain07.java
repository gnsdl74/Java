package edu.java.exception07;

import java.util.Scanner;

public class ExMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * try {
		 *     정상적인 경우에 실행할 코드들;
		 * } catch (Exception e) {
		 *    예외 상황일 때 실행할 코드;
		 * } finally {
		 *     정상적인 경우든, 예외 상황이든 상관없이 항상 실행할 코드
		 * }
		 * (주의) try 블록이나 catch 블록 안에 return; 이 있더라도
		 * return 보다 먼저 finally 블록이 실행되고, 그 후에 return이 실행됨! 
		 */
		
		try {
			System.out.println("try 시작");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int result = a / b;
			System.out.println("try 끝 : result = " + result);
		} catch (Exception e) {
			System.err.println("예외 : " + e.getMessage());
		} finally {
			System.out.println("finally : 언제 실행될까요?");
			sc.close();
		}
		System.out.println("프로그램 종료");
	} // end main()

} // end ExMain07
