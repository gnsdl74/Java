package edu.java.if08;

/*
 * SCE (Short-circuit evaluation : 짧은 계산)
 * Laz Evaluation (게이른 계산)
 * A && B 를 계산할 때 A가 false이면, B를 계산하지 않음
 * A || B 를 계산할 때 A가 true이면, B를 계산하지 않음
 */

public class IfMain08 {

	public static void main(String[] args) {
		System.out.println("계산 규칙 확인");

		int x = 0;
		int y = 0;

		if ((x += 10) < 0 && (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}

		System.out.println("x = " + x); // x = 10
		System.out.println("y = " + y); // y = 0
		// if의 조건 판단에서 (x += 10) < 0 이 false가 되어 뒷 조건은 접근조차 안함. (AND 연산)

		System.out.println("=========================");
		x = 0;
		y = 0;
		
		if ((x += 10) > 0 || (y += 10) > 0) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
		System.out.println("x = " + x); // x = 10
		System.out.println("y = " + y); // y = 0
		// if의 조건 판단에서 (x += 10) > 0 이 true가 되어 뒷 조건은 접근조차 안함. (OR 연산)
		
	} // end main()

} // end IfMain08
