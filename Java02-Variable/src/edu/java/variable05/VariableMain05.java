package edu.java.variable05;

public class VariableMain05 {

	public static void main(String[] args) {
		System.out.println("실수 자료형(Floating point)");
		
		/*
		 * float : 4byte에 저장되는 실수 타입
		 * double : 8byte에 저장되는 실수 타입
		 * double 타입은 float 타입보다 더 크고,
		 * 더 정밀한(소수점 이하 자리수가 더 큼) 수를 표현할 수 있음
		 * 자바에서 실수 타입 리터럴(상수)의 기본타입은 double
		 * 1.23 -> 자바는 double 취급
		 */
		double x = 3.14;
		System.out.println("x = " + x);
		
		float y = 3.14f;
		System.out.println("y = " + y);
		// 자바에서 실수 리터럴은 double로 취급하기 때문에,
		// float 타입으로 명시하기 위해서는 대문자 F 또는 소문자 f를 숫자 뒤에 붙여줌
		
		double n1 = 123;	// int -> double 자동 형 변환
		double n2 = 100;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);
		System.out.println("나눗셈 : " + (n1/n2));
		System.out.printf("나눗셈 : %.5f", (n1/n2));
		// %.nf : 소수점 n째짜리까지 출력 (f는 실수형, d는 정수형)
		
	}	// end main()
	
}	// end VariableMain05
