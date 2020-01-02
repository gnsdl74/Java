package edu.java.variable10;

import java.util.Scanner;

public class VariableMain10 {
	
	public static void main(String[] args) {
		System.out.println("초간단 계산기");
		// double 타입의 숫자 2개를 입력 받아서 저장
		// 두 수의 사칙연산(+, -, *, /)의 결과를 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 입력 : ");
		double x = sc.nextDouble();
		
		System.out.print("두번째 숫자 입력 : ");
		double y = sc.nextDouble();
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		sc.close();
		System.out.println();
		
		System.out.println("---- 사칙연산 결과표 ----");
		double result;	// 결과값 변수
		result = x+y;
		System.out.println(x + " + " + y + " = "  + String.format("%.3f", result));
		
		result = x-y;
		System.out.println(x + " - " + y + " = "  + String.format("%.3f", result));
		
		result = x*y;
		System.out.println(x + " * " + y + " = "  + String.format("%.3f", result));
		
		result = x/y;
		System.out.println(x + " / " + y + " = "  + String.format("%.3f", result));
		
		
	}	// end main()
	
}	// end VariableMain10
