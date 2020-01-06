package edu.java.while03;

/*
 * do - while
 * - 무조건 한번 본문을 실행한 후 
 *   반복문의 조건에 따라 반복 실행
 * - 선언 형태
 * 		do { 본문 }
 * 		while(조건)
 */

public class WhileMain03 {
	
	public static void main(String[] args) {
		System.out.println("do-while문");
		
		int count = 0;
		while(count > 0) {
			System.out.println(count);
			count--;
		}
		// count 값이 출력되지 않음
		// while문은 조건에 맞지않으면 실행 안함.
		
		do {
			System.out.println(count);
			count--;
		} while(count > 0);
		// count 값이 출력됨
		// do-while문은 조건에 맞지않더라도 무조건 한번은 실행.
		
		
	}	// end main()
	
}	// end WhileMain03
