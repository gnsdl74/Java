package edu.java.homework;

public class HomeWork {

	public static void main(String[] args) {

		// 1. 반복문을 사용해서, 'A'부터 'Z'까지 출력하는 프로그램
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("==========================================================");

		// 2. While문과 Math.random() 함수를 이용해서 두 개의 주사위를 던졌을 때 나오는
		// 눈의 합이 5이면 실행을 멈추고 5가 아니면 주사위를 계속 던지는 코드를 작성
		int count = 1;
		while (true) {
			int x = (int) (6 * Math.random() + 1);
			int y = (int) (6 * Math.random() + 1);
			int sum = x + y;

			System.out.print(count + "번째 - ");
			System.out.println(x + ", " + y);
			if (sum == 5) {
				break;
			}
			count++;
		}
		System.out.println("====================");

		// 3. 별 찍기
		for (int x = 1; x < 6; x++) {
			for (int y = 0; y < x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("====================");

		// 4. sum = 1 + (-2) + 3 + (-4) + 5 + ... + n >= 100을 만족하는 n과 sum의 값을 출력
		int n = 0;
		int sum = 0;

		while (true) {
			n++;
			if(n%2 == 0) {
				sum -= n;
			} else {
				sum += n;
			}
			
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("n의 값 : " + n);
		System.out.println("sum의 값 : "+ sum);
		System.out.println("====================");
		
		// 5. 마름모 찍기
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=0; i<5 ; i++) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(" ");
			}
			for(int k=0 ; k<5-i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* 다른 형태의 문제 풀이
		 
		 * for(int i =1 ; i<=5 ; i++) {
		 * 	for(int j = 1 ; j <= 5 ; j++) {
		 * 		if(i > j) {
		 * 			System.out.print(" ");
		 * 		} else {
		 * 			System.out.print("*");
		 * 		}
		 * 	}
		 * 	System.out.println();
		 * }
		 */
		

	} // end main()

} // end HomeWork
