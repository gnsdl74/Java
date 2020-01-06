package edu.java.for02;

public class ForMain02 {

	public static void main(String[] args) {
		System.out.println("for문 연습1");
		
		// 10 이하의 짝수만 오름차순으로 출력
		// 0 2 4 6 8 10
		for(int i=0 ; i<=5 ; i++) {
			System.out.println(i * 2);
		}
		System.out.println("====================");
		
		for(int i=0 ; i<=10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("====================");
		
		for(int i=0 ; i<=10 ; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		
	}	// end main()

}	// end ForMain02
