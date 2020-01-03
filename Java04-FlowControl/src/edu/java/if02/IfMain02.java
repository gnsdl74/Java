package edu.java.if02;

import java.util.Scanner;

public class IfMain02 {
	
	public static void main(String[] args) {
		System.out.println("if-else 문");
		// if(조건) { 본문 A }
		// else { 본문 B }
		// - 조건이 참이면 본문 A가 실행되고 거짓이면 본문B가 실행

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("양수");
		} else {
			System.out.println("0보다 크지 않음");
		}
		
		if(x != 0) {
			System.out.println("0이 아닌 정수");
		} else {
			System.out.println("0입니다.");
		}
		
		sc.close();
		
	}	// end main()
	
}	// end IfMain02
