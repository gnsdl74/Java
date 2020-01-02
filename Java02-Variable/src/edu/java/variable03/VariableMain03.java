package edu.java.variable03;

/*
 * 자바의 기본 자료형
 * - 논리형 : boolean(1byte)
 * - 정수형 :
 * 		byte(1byte), short(2byte), int(4byte)
 * 		long(8byte), char(2byte)
 * - 실수형 :
 * 		float(4byte), double(8byte)
 */
public class VariableMain03 {

	public static void main(String[] args) {
		System.out.println("자바의 기본 자료형");
		byte n1 = 5;	// byte 범위 : -128 ~ 127
		System.out.println("n1 =" + n1);
		
		// Ctrl + / : 코드 주석 처리 및 주석 해제
//		n1 = 128;
		// byte 타입에 저장할 수 있는 범위를 넘어서는 수는 저장할 수 없음
		
		short n2 = 1234;	// short 범위 : -32768 ~ 32767
		System.out.println("n2 = " + n2);
//		n2 = 32768;
		
		
	}	// end main()

}	// end VariableMain03
