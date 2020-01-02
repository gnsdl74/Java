package edu.java.variable04;

/*
 * 리터럴(literal) : 상수(1, 2, 10, 200)
 * - 자바의 정수 타입 리터럴은 int가 기본타입
 * - 정수 리터럴을 long 타입으로 취급하려면,
 *   숫자 뒤에 대문자 L 또는 소문자 l을 붙여줌
 */
public class VariableMain04 {

	public static void main(String[] args) {
		
		long num1 = 12345678900L;
		System.out.println("num1 = " + num1);
		
		short x = 12345;
		System.out.println("x = " + x);
		// 12345는 리터럴(상수)이기 때문에 int 타입
		// 정수 리터럴을 byte나 short에 저장할 때
		// 해당 타입에 저장할 수 있는 범위만 넘지 않으면
		// 자동 형(byte) 변환을 해줌
		// int -> byte, int -> short
		
		// long 타입의 리터럴(상수)는 자동 형 변환을 하지 않음
		int y = (int)100L;	// 강제 캐스팅
		System.out.println("y = " + y);
		
	}	// end main()

}	// end VariableMain04
