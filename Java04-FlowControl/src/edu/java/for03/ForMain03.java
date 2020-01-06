package edu.java.for03;

public class ForMain03 {

	public static void main(String[] args) {
		System.out.println("for문 연습2");
		
		// 1 ~ 100까지 정수 중에서 9의 배수들만 출력
		for(int i=1 ; i<=100 ; i++) {
			if(i%9 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("================================");
		
		// 1 ~ 100까지 숫자들을 출력(10 단위로 줄바꿈)
		// 1 2 3 ... 10
		// 11 12 13 ... 20
		// ....
		// 91 92 93 ... 100
		System.out.println(); // println() : 맨 마지막에 줄바꿈(\n)이 포함된 출력 함수
		System.out.print(""); // print() : 문자열을 나열하여 출력
		
		for(int i=1 ; i<=100 ; i++) {
			System.out.print(i + " ");
			if(i%10 == 0) {
				System.out.println();
			}
		}
		
		
	}	// end main()

}	// end ForMain03
