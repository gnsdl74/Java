package edu.java.oper04;

/*
 * 비교 연산자
 * - 두 값을 범위적으로 비교할 때 사용
 * - 연산 결과로 true, false를 리턴
 * - <, >, <=, >=, ==, !=
 */

/*
 * 논리 연산자
 * - boolean 타입의 변수를 사용하여 연산
 * - A && B : AND(논리곱) 연산
 *    A와 B가 모두 true일 때만 true, 나머지는 false
    
 * - A || B : OR(논리합) 연산
 *    A 또는 B가 true이면 true이고, A, B 모두 false 일 때는 false
 
 * - !A : NOT(논리 부정) 연산
 *    A가 true이면 false, false이면 true
 */

public class OperatorMain04 {
	
	public static void main(String[] args) {
		System.out.println("비교 연산자");
		
		System.out.println(10 > 20); // 10이 20보다 큰가?
		System.out.println(10 < 20); // 10이 20보다 작은가?
		System.out.println(123 == 100); // 123이 100과 같은가?
		System.out.println(123 != 100); // 123이 100과 다른가?
		
		System.out.println("논리 연산자");
		boolean A = true;
		boolean B = false;
		System.out.println(A && B);
		System.out.println(A || B);
		System.out.println(!B);
		
		System.out.println((10 > 0) && (10 < 100));	// true
		//System.out.println((10 > 0) || (10 < 100));	// true
		// 뒤의 10 < 100은 죽은 코드, 이미 앞에서 true로 판단되었기 때문에 뒤의 코드는 필요 없음
		System.out.println((10 <= 0) || (10 <= 100)); // true
		System.out.println(!(111 < 100));	// true

		
	}	// end main()
	
}	// end OperatorMain04
