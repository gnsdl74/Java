package edu.java.array01;

/*
 * 배열
 * - 같은 타입의 변수들을 하나의 목록으로 저장할 때 사용
 * - 배열의 선언과 초기화
 *   배열타입[] 배열이름 = new 타입 이름[배열 길이];
 *   배열이름[인덱스] = 값;
 *   - 배열의 인덱스는 0번부터 시작
 */

public class ArrayMain01 {

	public static void main(String[] args) {
		System.out.println("배열(array");
		int score1 = 100;
		int score2 = 90;
		int score3 = 80;
		int score4 = 70;
		int[] scores = {score1, score2, score3, score4};
		for(int i=0 ; i<4 ; i++) {
			System.out.println(scores[i]);
		}
		System.out.println("====================");
		
		int[] koreans = new int[4];
		koreans[0] = 90;
		koreans[1] = 90;
		koreans[2] = 90;
		koreans[3] = 90;
		System.out.println(koreans[0]);
		for(int i=0 ; i<4; i++) {
			System.out.println(koreans[i]);
		}
		
		
	}	// end main()

}	// end ArrayMain01
