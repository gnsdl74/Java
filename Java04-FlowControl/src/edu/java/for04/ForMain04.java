package edu.java.for04;

public class ForMain04 {

	public static void main(String[] args) {
		System.out.println("for문 연습3");
		
		// 아래 출력 결과를 나타내시오.
		// 1꼬마 2꼬마 3꼬마 인디언
		// 4꼬마 5꼬마 6꼬마 인디언
		// 7꼬마 8꼬마 9꼬마 인디언
		// 10꼬마 인디언 보이~
		
		for(int i=1 ; i<=10 ; i++) {
			System.out.print(i + "꼬마 ");
			if(i%3 == 0) {
				System.out.println("인디언");
			} else if(i%10==0) {
				System.out.println("인디언 보이~");
			}
		}
		
		
	}	// end main()

}	// end ForMain04
