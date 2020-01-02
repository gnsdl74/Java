package edu.java.variable01;

/* 
      변수(Variable)
   - 값을 저장할 수 있는 메모리 공간
   - 변수에는 하나의 값만 저장가능
   - 선언형태
   	  타입 변수이름; 
*/
public class VariableMain01 {
	
	// 프로그램의 시작점 : main() 메소드
	public static void main(String[] args) {
		System.out.println("변수(Variable)");
		// Ctrl + Space bar : 자동완성 단축키
		System.out.println();
		// Ctrl + F11 : 자동 실행 단축키
		
		int x = 10;	// 변수 x에 10을 저장
		System.out.println("x = " + x);
		
		int y;	// 변수 선언
		y = 20;	// 변수 초기화(값을 저장)
		System.out.println("y = " + y);
		System.out.println();
		
		x = 12;	// 이미 선언된 변수의 값을 변경
		x = 12 + y;	// 다른 변수를 연산할 수 있음
		y = 10;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("덧셈 = " + (x+y));
		System.out.println("나눗셈 = " + (x/y));
		// (정수) / (정수) : 나눈 몫을 계산
		// (정수) % (정수) : 나눈 나머지를 계산
		
	}	// end main()
	
}	// end VariableMain01
