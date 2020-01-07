package edu.java.array05;

public class ArrayMain05 {

	public static void main(String[] args) {
		System.out.println("배열 연습");
		// 구구단 2단의 결과만 저장하는 배열 : 2, 4, ... , 18
		int[] dan = new int[9];
		
		// for문을 사용하여 초기화(구구단 전체 출력하면서 2단의 결과만 저장)
		for(int i=1; i<=9; i++) {
			System.out.println(i+"단");
			System.out.println("----------------------");
			for(int j=1; j<=9; j++) {
				if(i == 2) {
					dan[j-1] = i*j; 
				}
				System.out.println(i + " X " + j + " = " + i*j);
			}
			System.out.println();
		}
		// 2단만 저장하는 경우
		for(int i=0; i<dan.length; i++) {
			dan[i] = 2 * (i+1);
		}
		
		// for-each 구문을 사용해서 출력
		System.out.println("2단의 결과 출력");
		for(int x : dan) {
			System.out.print(x + " ");
		}
		
		
	}	// end main()

}	// end ArrayMain05
