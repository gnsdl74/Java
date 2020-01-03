package edu.java.if07;

import java.util.Scanner;

public class IfMain07 {

	public static void main(String[] args) {
		System.out.println("if 중첩문 연습");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.close();
		
		if(num != 0) {	// 0이 아닐때
			
			if(num%2 == 0) {	// 짝수일 때
				System.out.println("짝수입니다.");
				
				if(num%4 == 0) {	// 짝수 중 4의 배수일때
					System.out.println("4의 배수입니다.");
				} else {
					System.out.println("4의 배수가 아닙니다.");
				}
				
			} else {	// 홀수일 때
				System.out.println("홀수입니다.");
			}
			
		} else {	// 0일 때
			System.out.println("숫자 0 입니다.");
		}

	}	// end main()

}	// end IfMain07
