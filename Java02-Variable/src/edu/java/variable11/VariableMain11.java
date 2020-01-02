package edu.java.variable11;

import java.util.Scanner;

public class VariableMain11 {
	public static void main(String[] args) {
		System.out.println("문자열 입력 받기");
		
		String str = "+";
		System.out.println(str);
		
		String str2 = "안녕하세요";
		System.out.println(str2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String str3 = sc.next();
		System.out.println(str3);
		
		sc.close();

		// nextInt() : 정수를 입력받는 메소드
		// nextDouble() : 실수를 입력받는 메소드
		// nextLine() : 문자열 한 줄을 입력받는 메소드
		// next() : 공백 전까지의 문자열을 입력받는 메소드(띄어쓰기나 탭 모두 포함)
		
		// 입력받은 문자열의 첫 번째 글자 출력
		System.out.println(str3.charAt(0));
		// 입력받은 문자열의 마지막 글자 출력
		System.out.println(str3.charAt(str3.length()-1));
		
	}	// end main()
	
}	// end VariableMain11
