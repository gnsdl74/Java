package edu.java.oper01;

public class OperatorMain01 {
	
	public static void main(String[] args) {
		System.out.println("대입 연산자(=)");
		/*
		 * 변수 = 값;
		 * - 오른쪽의 값을 왼쪽의 변수에 저장하는 연산자
		 */
		int num = 246 + 234 + 100 / 10;
		System.out.println("num = " + num);
		
		System.out.println("===================");
		System.out.println("산술 연산자(+, -, *, /, %)");
		/*
		 * (정수) / (정수) : 나눈 몫을 계산
		 * (정수) % (정수) : 나눈 나머지를 계산
		 * (실수) / (실수) , (실수) / (정수) (정수) / (실수) :
		 *   소수점까지 계산하는 나눗셈 결과
		 */
		System.out.println("정수 나눗셈 몫 : " + (246 / 100));
		System.out.println("정수 나눗셈 나머지 : " + (246%100));
		System.out.println("실수 나눗셈 : " + (246/100.0));
		
		System.out.println(246/0.0);
		// 정수 0으로 나누는 것은 불가능하기 때문에 Exception 발생
		// 실수 0.0으로 나누면 Infinity를 결과로 보여줌
		
	}	// end main()
	
}	// end OperatorMain01
